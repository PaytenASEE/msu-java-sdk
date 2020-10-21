package com.merchantsafeunipay.sdk.authentication.credentials.providers;

import com.merchantsafeunipay.sdk.authentication.credentials.MsuCredentials;
import com.merchantsafeunipay.sdk.authentication.credentials.MsuCredentialsProvider;
import com.merchantsafeunipay.sdk.util.Validate;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClasspathPropertyFileCredentialsProvider implements MsuCredentialsProvider {

    public MsuCredentials getCredentials() {
        Properties props = new Properties();
        try {
            InputStream resourceAsStream = Thread.currentThread().getContextClassLoader()
                    .getResourceAsStream("msuCredentials.properties");
            Validate.notNull(resourceAsStream, "msuCredentials.properties not found in classpath");
            props.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String merchantBusinessId = props.getProperty("merchantBusinessId");
        String email = props.getProperty("merchantuser");
        String password = props.getProperty("merchantpassword");
        Validate.notEmpty(merchantBusinessId, "merchantBusinessId is empty in property file!");
        Validate.notEmpty(email, "merchantuser is empty in property file!");
        Validate.notEmpty(password, "merchantpassword is empty in property file!");
        return new MsuCredentials(merchantBusinessId, email, password);
    }
}
