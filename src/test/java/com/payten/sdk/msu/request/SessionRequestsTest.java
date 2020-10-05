package com.payten.sdk.msu.request;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.authentication.types.SessionTokenAuthentication;
import com.payten.sdk.msu.request.apiv2.query.QuerySessionRequest;
import com.payten.sdk.msu.request.apiv2.session.SessionTokenRequest;
import com.payten.sdk.msu.request.enumerated.SessionType;
import com.payten.sdk.msu.request.enumerated.Currency;
import com.payten.sdk.msu.response.QuerySessionResponse;
import com.payten.sdk.msu.response.SessionTokenResponse;
import org.junit.Test;

public class SessionRequestsTest extends BaseIntegrationTest {
	
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

	@Test
	public void testQuerySession(){
		QuerySessionRequest querySessionRequest = QuerySessionRequest.builder()
				.withAuthentication(SessionTokenAuthentication.builder()
						.withToken("PL5OTOKB2CE4ISFDU5NI6MMR2VPWQCIMJLRZDDAGZW3UIUXZ")
						.build())
				.build();

		QuerySessionResponse querySessionResponse = client.doRequest(querySessionRequest);
		assertThat(querySessionResponse, is(notNullValue()));
	}
}
