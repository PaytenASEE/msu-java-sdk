package com.merchantsafeunipay.sdk.http.async;

import com.merchantsafeunipay.sdk.response.ApiResponse;

/**
 * @author Kushtrim Hajrizi
 */
@FunctionalInterface
public interface ApiResponseAsyncCallback<T extends ApiResponse> {

    void handleResponse(T response);
}
