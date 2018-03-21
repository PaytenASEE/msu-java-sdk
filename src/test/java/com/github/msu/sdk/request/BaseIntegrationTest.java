package com.github.msu.sdk.request;

import org.junit.Before;

import com.github.msu.sdk.MsuApiClient;
import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.authentication.credentials.providers.StaticCredentialsProvider;
import com.github.msu.sdk.authentication.types.UserCredentialsAuthentication;

public class BaseIntegrationTest {
	protected MsuApiClient client;
	
	@Before
	public void setUp() {
		Authentication userCredentialsAuthentication = new UserCredentialsAuthentication(
				new StaticCredentialsProvider("testmerchant", "apiuser@testmerchant.com", "Pluto321`"));
		client = MsuApiClient.builder().withDefaultAuthentication(userCredentialsAuthentication).build();
	}
}
