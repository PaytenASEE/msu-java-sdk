package com.merchantsafeunipay.sdk.authentication.credentials.providers;

import com.merchantsafeunipay.sdk.authentication.credentials.MsuCredentials;
import com.merchantsafeunipay.sdk.authentication.credentials.MsuCredentialsProvider;
import com.merchantsafeunipay.sdk.util.Validate;

public class EnvironmentVariableCredentialsProvider implements MsuCredentialsProvider {

    private static final String MERCHANT_BUSINESS_ID_ENV_VARIABLE = "MSU_MERCHANT_BUSINESS_ID";
    private static final String MERCHANT_EMAIL_ENV_VARIABLE = "MSU_MERCHANT_USER";
    private static final String MERCHANT_PASSWORD_ENV_VARIABLE = "MSU_MERCHANT_PASSWORD";

    public MsuCredentials getCredentials() {
        String merchantBusinessId = System.getenv(MERCHANT_BUSINESS_ID_ENV_VARIABLE);
        String email = System.getenv(MERCHANT_EMAIL_ENV_VARIABLE);
        String password = System.getenv(MERCHANT_PASSWORD_ENV_VARIABLE);
        Validate.notEmpty(merchantBusinessId, "MSU_MERCHANT_BUSINESS_ID env variable empty!");
        Validate.notEmpty(email, "MSU_MERCHANT_USER env variable empty!");
        Validate.notEmpty(password, "MSU_MERCHANT_PASSWORD env variable empty!");
        return new MsuCredentials(merchantBusinessId, email, password);
    }
}
