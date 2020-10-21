package com.merchantsafeunipay.sdk.util;

import com.merchantsafeunipay.sdk.response.ApiResponse;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ResponseInfo {
    Class<? extends ApiResponse> responseClass() default ApiResponse.class;
}