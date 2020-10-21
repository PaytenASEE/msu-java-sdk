package com.merchantsafeunipay.sdk.authentication;

import com.merchantsafeunipay.sdk.request.base.ApiRequest;

public interface Authentication {
    void authenticate(ApiRequest apiRequest);
}
