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
            if(resourceAsStream == null){
                throw new RuntimeException("Could not find msuCredentials.properties in classpath!");
            }
            props.load(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException("Could not find msuCredentials.properties in classpath!");
        }
        String merchantBusinessId = props.getProperty("merchantBusinessId");
        String email = props.getProperty("merchantUser");
        String password = props.getProperty("merchantPassword");
        Validate.notEmpty(merchantBusinessId, "merchantBusinessId is empty in property file!");
        Validate.notEmpty(email, "merchantUser is empty in property file!");
        Validate.notEmpty(password, "merchantPassword is empty in property file!");
        return new MsuCredentials(merchantBusinessId, email, password);
    }
}
