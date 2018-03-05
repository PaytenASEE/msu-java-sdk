package com.github.msu.sdk.authentication.credentials.providers;

import com.github.msu.sdk.authentication.credentials.MsuCredentials;
import com.github.msu.sdk.authentication.credentials.MsuCredentialsProvider;

public class EnvironmentVariableCredentialsProvider implements MsuCredentialsProvider {

	private static final String MERCHANT_BUSINESS_ID_ENV_VARIABLE = "MSU_MERCHANT_BUSINESS_ID";
	private static final String MERCHANT_EMAIL_ENV_VARIABLE = "MSU_MERCHANT_USER";
	private static final String MERCHANT_PASSWORD_ENV_VARIABLE = "MSU_MERCHANT_PASSWORD";

	public MsuCredentials getCredentials() {
		String merchantBusinessId = System.getenv(MERCHANT_BUSINESS_ID_ENV_VARIABLE);
		String email = System.getenv(MERCHANT_EMAIL_ENV_VARIABLE);
		String password = System.getenv(MERCHANT_PASSWORD_ENV_VARIABLE);
		return new MsuCredentials(merchantBusinessId, email, password);
	}
}
