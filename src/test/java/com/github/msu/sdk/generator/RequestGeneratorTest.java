package com.github.msu.sdk.generator;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.util.ResponseInfo;
import com.squareup.javapoet.*;
import org.junit.Before;
import org.junit.Test;

import com.github.msu.sdk.generator.MsuApiMetadata.Action;
import com.github.msu.sdk.generator.MsuApiMetadata.Action.Params;

import javax.lang.model.element.Modifier;

public class RequestGeneratorTest {
    MsuApiMetadataLoader metadataLoader;
    StringCaseUtility stringCaseUtility;

    @Before
    public void setUp() {
        metadataLoader = new MsuApiMetadataLoader();
        stringCaseUtility = new StringCaseUtility();
        // TODO load template file from src/test/resources/requestTemplate.txt
    }

    @Test
    public void testMetadataLoader() throws IOException {
        List<Action> actions = metadataLoader.getMsuApiMetadata().getAction();
        actions.forEach(action -> {
            String actionInCamelCase = stringCaseUtility.toCamelCase(action.getName());
            String actionName = stringCaseUtility.firstUpperCase(actionInCamelCase);
            System.out.println("Action: " + actionInCamelCase);
            Params params = action.getParams();
            String className = actionName + "Request";
            List<FieldSpec> fields = new ArrayList<>();
            List<MethodSpec> innerBuilderMethods = new ArrayList<>();

            // Get fields from params
            params.param.forEach(param -> {
                String paramName = stringCaseUtility.toCamelCase(param.getName());
                String paramType = param.getType();
                System.out.println(stringCaseUtility.toCamelCase(paramName + ":" + paramType));
                FieldSpec field = FieldSpec.builder(String.class, paramName, Modifier.PRIVATE).build();
                fields.add(field);

                //// TODO: 3/13/2018 Methods for builder
            });
            System.out.println("------------------------------------------------------------");

            //Remove first field -> ACTION field
            fields.remove(0);

            // Add to payload block
            StringBuilder addToPayload = new StringBuilder();
            fields.stream().forEach(field -> {
                addToPayload.append("addToPayload(Param." + Param.valueOf(field.name.toUpperCase()) + "," + "this." + field.name + ");");
            });
            CodeBlock applyRequestParamBody = CodeBlock.builder().add(addToPayload.toString()).build();

            //applyRequestParams method
            MethodSpec applyRequestParams = MethodSpec.methodBuilder("applyRequestParams").addModifiers(Modifier.PUBLIC)
                    .addCode(applyRequestParamBody).addAnnotation(Override.class).build();

            //action method
            MethodSpec actionMethod = MethodSpec.methodBuilder("action").returns(com.github.msu.sdk.request.enumerated.Action.class)
                    .addModifiers(Modifier.PUBLIC).addAnnotation(Override.class).addCode("return Action." + actionName + ";").build();

            // Class Builder
            String builderName = className + "Builder";
            TypeSpec builder = TypeSpec.classBuilder(builderName).addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                    .addFields(fields).build();

            //builder method
            MethodSpec builderMethod = MethodSpec.methodBuilder("builder").returns(Object.class)
                    .addModifiers(Modifier.PUBLIC).addCode("return new " + builderName + "();").build();

            // Main Class
            AnnotationSpec annotation = AnnotationSpec.builder(ResponseInfo.class).addMember("responseClass", actionName + "Response.class").build();
            TypeSpec mainClass = TypeSpec.classBuilder(className)
                    .addAnnotation(annotation).addType(builder).addModifiers(Modifier.PUBLIC).addFields(fields)
                    .addMethod(applyRequestParams).addMethod(actionMethod).addMethod(builderMethod).build();
            JavaFile javaFile = JavaFile.builder("com.github.msu.sdk.request", mainClass).build();

            try {
                // Save class to path
                // javaFile.writeTo(Paths.get("C:\\Users\\DELL\\Asseco\\msu-api-sdk\\src\\main\\java\\com\\github\\msu\\sdk\\request"));
               javaFile.writeTo(System.out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        // TODO
    }
}
