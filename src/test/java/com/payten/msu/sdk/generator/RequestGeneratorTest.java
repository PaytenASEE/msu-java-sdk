package com.payten.msu.sdk.generator;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.lang.model.element.Modifier;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.complex.OrderItem;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.request.model.Point;
import org.junit.Before;
import org.junit.Test;

import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.util.ResponseInfo;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
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
	
	@SuppressWarnings("serial")
	static Map<String, FieldSpec> COMPLEX_TYPES = new HashMap<String, FieldSpec>() {
		{
			put("POINTS",
					FieldSpec.builder(ParameterizedTypeName.get(ClassName.get(List.class), ClassName.get(Point.class)),
							"points", Modifier.PRIVATE).build());
			put("ORDERITEMS",
					FieldSpec.builder(
							ParameterizedTypeName.get(ClassName.get(List.class), ClassName.get(OrderItem.class)),
							"orderItems", Modifier.PRIVATE).build());
			put("EXTRA", FieldSpec.builder(ParameterizedTypeName.get(ClassName.get(Map.class),
					ClassName.get(String.class), ClassName.get(String.class)), "extra", Modifier.PRIVATE).build());
		}
	};
	
	@Before
	public void setUp() {
		metadataLoader = new MsuApiMetadataLoader();
		stringCaseUtility = new StringCaseUtility();
	}

	@Test
	public void testMetadataLoader() throws IOException {
		List<MsuApiMetadata.Action> actions = metadataLoader.getMsuApiMetadata().getAction();
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
			
			MethodSpec withAuthenticationMethod = MethodSpec.methodBuilder("withAuthentication")
					.addModifiers(Modifier.PUBLIC).addStatement("this.authentication = authentication")
					.addStatement("return this").returns(ClassName.get("", builderName))
					.addParameter(Authentication.class, "authentication").build();
			innerBuilderMethods.add(withAuthenticationMethod);
			// Get fields from params
			params.forEach(param -> {
				String paramName = stringCaseUtility.toCamelCase(param.getName());
				String paramType = param.getType();
				System.out.println(stringCaseUtility.toCamelCase(paramName + ":" + paramType));
				FieldSpec field = null;
				if (COMPLEX_TYPES.containsKey(param.getName().toUpperCase())) {
					field = COMPLEX_TYPES.get(param.getName().toUpperCase());
				} else {
					field = FieldSpec.builder(getParameterType(param), paramName.trim(), Modifier.PRIVATE).build();
				}
				fields.add(field);
				// with* methods of builder
				MethodSpec withMethod = MethodSpec.methodBuilder("with" + stringCaseUtility.firstUpperCase(field.name))
						.addModifiers(Modifier.PUBLIC).addStatement("this." + field.name + " = " + field.name)
						.addStatement("return this").returns(ClassName.get("", builderName))
						.addParameter(field.type, field.name).build();
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
					.returns(ApiAction.class).addModifiers(Modifier.PUBLIC)
					.addAnnotation(Override.class).addStatement("return ApiAction." + actionName.toUpperCase()).build();

			// build() block of Builder
			StringBuilder builderBuildSatements = new StringBuilder();
			builderBuildSatements.append(className + " request = new " + className + "();\n");
			builderBuildSatements.append("request.authentication = this.authentication;\n");
			fields.stream().forEach(field -> {
				builderBuildSatements.append("request." + field.name + " = this." + field.name + ";\n");
			});
			
			builderBuildSatements.append("return request");
			CodeBlock builderBuildStatementBlock = CodeBlock.builder().add(builderBuildSatements.toString()).build();
			// build() method of Builder
			MethodSpec buildMethod = MethodSpec.methodBuilder("build").returns(ClassName.get("", className))
					.addModifiers(Modifier.PUBLIC).addStatement(builderBuildStatementBlock).build();
			// Class Builder
			List<FieldSpec> builderFields = new ArrayList<>(fields);
			builderFields.add(FieldSpec.builder(Authentication.class, "authentication", Modifier.PRIVATE).build()); //builder has additional authentication attribute
			TypeSpec builder = TypeSpec.classBuilder(builderName)
					.addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL).addFields(builderFields)
					.addMethods(innerBuilderMethods).addMethod(buildMethod).build();

			// builder() method of Request
			ClassName builderClassName = ClassName.get("", builderName);
			MethodSpec builderMethod = MethodSpec.methodBuilder("builder").returns(builderClassName)
					.addModifiers(Modifier.PUBLIC).addModifiers(Modifier.STATIC).addStatement("return new " + builderName + "()").build();

			// Main Class
			AnnotationSpec annotation = AnnotationSpec.builder(ResponseInfo.class)
					.addMember("responseClass", "com.github.msu.sdk.response." + actionName + "Response.class").build();
			TypeSpec mainClass = TypeSpec.classBuilder(className).addAnnotation(annotation)
					.addMethod(MethodSpec.constructorBuilder().addModifiers(Modifier.PRIVATE).build()).addType(builder)
					.addModifiers(Modifier.PUBLIC).addFields(fields).addMethod(applyRequestParams)
					.addMethod(actionMethod).addMethod(builderMethod).superclass(ApiRequest.class).build();
			JavaFile javaFile = JavaFile.builder("com.github.msu.sdk.request.generated", mainClass).build();

			try {
				// Save class to path
				javaFile.writeTo(Paths.get("/home/isah/npd/client.sdk/msu-api-sdk/src/main/java/com/github/msu/sdk/generated"));
				//javaFile.writeTo(Paths.get(System.getProperty("user.dir") + "/src/main/java"));
				//javaFile.writeTo(System.out);
			} catch (IOException e) {
				e.printStackTrace();
			} 
		});
		// TODO
	}

	private TypeName getParameterType(MsuApiMetadata.Action.Params.Param param) {
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
