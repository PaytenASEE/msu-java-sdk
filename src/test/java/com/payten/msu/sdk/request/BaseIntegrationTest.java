package com.payten.msu.sdk.request;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.authentication.types.UserCredentialsAuthentication;
import org.junit.Before;

import com.payten.msu.sdk.MsuApiClient;
import com.payten.msu.sdk.authentication.credentials.providers.StaticCredentialsProvider;

public class BaseIntegrationTest {
	protected MsuApiClient client;
	
	@Before
	public void setUp() {
		Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
				new StaticCredentialsProvider("testmerchant", "apiuser@testmerchant.com", "Pluto321`"));
		client = MsuApiClient.builder().withDefaultAuthentication(userCredentialsAuthentication).build();
	}
}
