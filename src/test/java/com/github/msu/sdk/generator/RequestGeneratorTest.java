package com.github.msu.sdk.generator;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.lang.model.element.Modifier;

import org.junit.Before;
import org.junit.Test;

import com.github.msu.sdk.generator.MsuApiMetadata.Action;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.util.ResponseInfo;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

public class RequestGeneratorTest {
	MsuApiMetadataLoader metadataLoader;
	StringCaseUtility stringCaseUtility;
	Set<String> enums = new HashSet<>();
	
	static final Set<String> BOOLEAN_PARAMS = new HashSet<>(
			Arrays.asList("SAVECARD", "ISREFUNDABLE", "FORGROUP", "APPLYFORDEBITCREDITCARD", "APPLYFORCREDITCARD",
					"APPLYFORBUSINESSCARD", "INCLUDEDEALERS", "ISCOMMISSIONINCLUDED"));
	static final Set<String> AUTH_PARAMS = new HashSet<>(
			Arrays.asList("ACTION", "SESSIONTOKEN", "MERCHANTUSER", "MERCHANTPASSWORD", "MERCHANT"));

	static final Set<String> IGNORABLE_ENUMS = new HashSet<>(Arrays.asList("ROLE", "PERMISSION", "FEATURE"));
	
	@Before
	public void setUp() {
		metadataLoader = new MsuApiMetadataLoader();
		stringCaseUtility = new StringCaseUtility();
		// TODO load template file from src/test/resources/requestTemplate.txt
	}

	@Test
	public void testMetadataLoader() throws IOException {
		List<Action> actions = metadataLoader.getMsuApiMetadata().getAction();
		//actions = actions.stream().filter(a -> a.getName().equalsIgnoreCase("SALE")).collect(Collectors.toList()); // comment
																													// for
																													// all
																													// actions
		actions.forEach(action -> {
			String actionInCamelCase = stringCaseUtility.toCamelCase(action.getName());
			String actionName = stringCaseUtility.firstUpperCase(actionInCamelCase);
			System.out.println("ApiAction: " + actionInCamelCase);
			// exclude auth params
			List<MsuApiMetadata.Action.Params.Param> params = action.getParams().param.stream()
					.filter(p -> !AUTH_PARAMS.contains(p.getName().toUpperCase())).collect(Collectors.toList());
			String className = actionName + "Request";

			List<FieldSpec> fields = new ArrayList<>();
			List<MethodSpec> innerBuilderMethods = new ArrayList<>();
			String builderName = className + "Builder";
			// Get fields from params
			params.forEach(param -> {
				String paramName = stringCaseUtility.toCamelCase(param.getName());
				String paramType = param.getType();
				System.out.println(stringCaseUtility.toCamelCase(paramName + ":" + paramType));
				FieldSpec field = FieldSpec.builder(getParameterType(param), paramName.trim(), Modifier.PRIVATE)
						.build();
				fields.add(field);

				// with* methods of builder
				MethodSpec withMethod = MethodSpec.methodBuilder("with" + stringCaseUtility.firstUpperCase(field.name))
						.addModifiers(Modifier.PUBLIC).addStatement("this." + field.name + " = " + field.name)
						.addStatement("return this").returns(ClassName.get("", builderName))
						.addParameter(getParameterType(param), field.name).build();
				innerBuilderMethods.add(withMethod);
			});
			System.out.println("------------------------------------------------------------");

			// Add to payload block
			StringBuilder addToPayload = new StringBuilder();
			fields.stream().forEach(field -> {
				addToPayload.append("addToPayload(com.github.msu.sdk.request.enumerated.Param." + Param.valueOf(field.name.toUpperCase()) + "," + "this."
						+ field.name + ");").append("\n");
			});
			CodeBlock applyRequestParamBody = CodeBlock.builder().add(addToPayload.toString()).build();
			// applyRequestParams() method of Request
			MethodSpec applyRequestParams = MethodSpec.methodBuilder("applyRequestParams").addModifiers(Modifier.PUBLIC)
					.addCode(applyRequestParamBody).addAnnotation(Override.class).build();

			// action() method of Request
			MethodSpec actionMethod = MethodSpec.methodBuilder("apiAction")
					.returns(com.github.msu.sdk.request.enumerated.ApiAction.class).addModifiers(Modifier.PUBLIC)
					.addAnnotation(Override.class).addStatement("return ApiAction." + actionName.toUpperCase()).build();

			// build() block of Builder
			StringBuilder builderBuildSatements = new StringBuilder();
			builderBuildSatements.append(className + " request = new " + className + "()\n");
			fields.stream().forEach(field -> {
				builderBuildSatements.append("request." + field.name + " = this." + field.name + ";\n");
			});
			
			builderBuildSatements.append("return request");
			CodeBlock builderBuildStatementBlock = CodeBlock.builder().add(builderBuildSatements.toString()).build();
			// build() method of Builder
			MethodSpec buildMethod = MethodSpec.methodBuilder("build").returns(ClassName.get("", className))
					.addModifiers(Modifier.PUBLIC).addStatement(builderBuildStatementBlock).build();
			// Class Builder
			TypeSpec builder = TypeSpec.classBuilder(builderName)
					.addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).addFields(fields)
					.addMethods(innerBuilderMethods).addMethod(buildMethod).build();

			// builder() method of Request
			ClassName builderClassName = ClassName.get("", builderName);
			MethodSpec builderMethod = MethodSpec.methodBuilder("builder").returns(builderClassName)
					.addModifiers(Modifier.PUBLIC).addStatement("return new " + builderName + "()").build();

			// Main Class
			AnnotationSpec annotation = AnnotationSpec.builder(ResponseInfo.class)
					.addMember("responseClass", "com.github.msu.sdk.response." + actionName + "Response.class").build();
			TypeSpec mainClass = TypeSpec.classBuilder(className).addAnnotation(annotation)
					.addMethod(MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE).build()).addType(builder)
					.addModifiers(Modifier.PUBLIC).addFields(fields).addMethod(applyRequestParams)
					.addMethod(actionMethod).addMethod(builderMethod).superclass(ApiRequest.class).build();
			JavaFile javaFile = JavaFile.builder("com.github.msu.sdk.request", mainClass).build();

			try {
				// Save class to path
				//javaFile.writeTo(Paths.get("C:\\Users\\DELL\\Asseco\\msu-api-sdk\\src\\main\\java\\com\\github\\msu\\sdk\\request"));
				URL pathname = this.getClass().getClassLoader().getResource("com/github/msu/sdk/request/generated");
				System.out.println(pathname);
				javaFile.writeTo(new File(pathname.getFile()));
				//javaFile.writeTo(System.out);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("Enums:");
			System.out.println(Arrays.toString(enums.toArray(new String[0])));
		});
		// TODO
	}

	private TypeName getParameterType(com.github.msu.sdk.generator.MsuApiMetadata.Action.Params.Param param) {
		if (BOOLEAN_PARAMS.contains(param.getName().toUpperCase())) {
			return TypeName.BOOLEAN;
		}
		if(IGNORABLE_ENUMS.contains(param.getName().toUpperCase())) {
			return TypeName.get(String.class);
		}
		switch (param.getType()) {
		case "decimal":
			return TypeName.get(BigDecimal.class);
		case "enum":
			String enumClass = param.getEnumClass();
			enums.add(enumClass);
			return ClassName.get("com.github.msu.sdk.request.enumerated",
					enumClass.substring(enumClass.lastIndexOf('.') + 1, enumClass.length()));
		default:
			return TypeName.get(String.class);
		}
	}
}