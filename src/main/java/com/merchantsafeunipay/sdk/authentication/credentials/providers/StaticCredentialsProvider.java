package com.merchantsafeunipay.sdk.authentication.credentials.providers;

import com.merchantsafeunipay.sdk.authentication.credentials.MsuCredentials;
import com.merchantsafeunipay.sdk.authentication.credentials.MsuCredentialsProvider;

public class StaticCredentialsProvider implements MsuCredentialsProvider {
    private String merchantBusinessId;
    private String user;
    private String password;

    public StaticCredentialsProvider(String merchantBusinessId, String user, String password) {
        this.merchantBusinessId = merchantBusinessId;
        this.user = user;
        this.password = password;
    }

    public MsuCredentials getCredentials() {
        return new MsuCredentials(merchantBusinessId, user, password);
    }

}
