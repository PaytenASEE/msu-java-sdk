package com.payten.sdk.msu.request;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.authentication.types.UserCredentialsAuthentication;
import org.junit.Before;

import com.payten.sdk.msu.MsuApiClient;
import com.payten.sdk.msu.authentication.credentials.providers.StaticCredentialsProvider;

public class BaseIntegrationTest {
	protected MsuApiClient client;
	
	@Before
	public void setUp() {
		Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
				new StaticCredentialsProvider("testmerchant", "apiuser@testmerchant.com", "Pluto321`"));
		client = MsuApiClient.builder()
//				.withUrl("http://localhost:8090/msu/api/v2")
				.withDefaultAuthentication(userCredentialsAuthentication)
				.build();
	}
}
