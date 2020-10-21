package com.merchantsafeunipay.sdk.authentication.types;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.authentication.credentials.MsuCredentials;
import com.merchantsafeunipay.sdk.authentication.credentials.MsuCredentialsProvider;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Param;

import java.util.Map;

public class UserCredentialsAuthentication implements Authentication {
    private MsuCredentials msuCredentials;

    public UserCredentialsAuthentication(MsuCredentialsProvider msuCredentialsProvider) {
        this.msuCredentials = msuCredentialsProvider.getCredentials();
    }

    public void authenticate(ApiRequest apiRequest) {
        Map<String, String> formUrlEncodedData = apiRequest.getFormUrlEncodedData();
        formUrlEncodedData.put(Param.MERCHANT.name(), msuCredentials.getMerchantBusinessId());
        formUrlEncodedData.put(Param.MERCHANTUSER.name(), msuCredentials.getMerchantUser());
        formUrlEncodedData.put(Param.MERCHANTPASSWORD.name(), msuCredentials.getMerchantPassword());
    }

    @Override
    public String toString() {
        return "UserCredentialsAuthentication " + msuCredentials;
    }
}
