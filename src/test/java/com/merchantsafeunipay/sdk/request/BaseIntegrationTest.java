package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.authentication.types.UserCredentialsAuthentication;
import org.junit.Before;

import com.merchantsafeunipay.sdk.MsuApiClient;
import com.merchantsafeunipay.sdk.authentication.credentials.providers.StaticCredentialsProvider;

public class BaseIntegrationTest {
	protected MsuApiClient client;
	
	@Before
	public void setUp() {
		Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
				new StaticCredentialsProvider("testmerchant", "apiuser@testmerchant.com", "Pluto321`"));
		client = MsuApiClient.builder()
				.withUrl("https://neon-app.local.payten.com.tr/msu/api/v2")
				//.withPrettyPrintRequests(true)
				.withDefaultAuthentication(userCredentialsAuthentication)
				.build();
	}
}
