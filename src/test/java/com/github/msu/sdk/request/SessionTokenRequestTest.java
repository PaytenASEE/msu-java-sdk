package com.github.msu.sdk.request;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import com.github.msu.sdk.request.apiv2.session.SessionTokenRequest;
import com.github.msu.sdk.request.enumerated.SessionType;
import org.junit.Test;

import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.response.SessionTokenResponse;

public class SessionTokenRequestTest extends BaseIntegrationTest {
	
	@Test
	public void testSessionToken() {
		SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder().withCurrency(Currency.TRY)
				.withSessionType(SessionType.PAYMENTSESSION)
				.withAmount(new BigDecimal("100.00"))
				.withCustomer("customer-3828342004")
				.withMerchantPaymentId("payment-8945456121")
				.withReturnUrl("http://www.returnurl.com")
				.build();
		SessionTokenResponse sessionTokenResponse = client.doRequest(sessionTokenRequest);
		assertThat(sessionTokenResponse, is(notNullValue()));
	}
}
