package com.github.msu.sdk.request;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.response.SessionTokenResponse;

public class SessionTokenRequestTest extends BaseIntegrationTest {
	
	@Test
	public void testSessionToken() {
		SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder().withCurrency(Currency.TRY)
				.withAmount(new BigDecimal("100.00")).withCustomer("customer-3828342004")
				.withMerchantPaymentId("payment-18348323242342").withReturnUrl("http://www.returnurl.com").build();
		SessionTokenResponse sessionTokenResponse = client.doRequest(sessionTokenRequest);
		assertThat(sessionTokenResponse, is(notNullValue()));
	}
}
