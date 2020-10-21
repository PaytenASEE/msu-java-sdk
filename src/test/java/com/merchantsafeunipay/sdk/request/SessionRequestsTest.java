package com.merchantsafeunipay.sdk.request;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.merchantsafeunipay.sdk.authentication.types.SessionTokenAuthentication;
import com.merchantsafeunipay.sdk.request.apiv2.query.QuerySessionRequest;
import com.merchantsafeunipay.sdk.request.apiv2.session.SessionTokenRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.SessionType;
import com.merchantsafeunipay.sdk.response.QuerySessionResponse;
import com.merchantsafeunipay.sdk.response.SessionTokenResponse;
import com.merchantsafeunipay.sdk.util.StringUtils;
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

	@Test
	public void testSessionTokenWithExtra() throws Exception {
		Map<String, String> extra = new HashMap<>();
		extra.put("foo","bar");
		SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder().withCurrency(Currency.TRY)
				.withSessionType(SessionType.PAYMENTSESSION)
				.withAmount(new BigDecimal("100.00"))
				.withCustomer("customer" + StringUtils.generateString(10))
				.withMerchantPaymentId("payment" + StringUtils.generateString(10))
				.withReturnUrl("http://www.returnurl.com")
				.withExtra(extra)
				.build();

		SessionTokenResponse sessionTokenResponse = client.doRequest(sessionTokenRequest);
		assertThat(sessionTokenResponse, is(notNullValue()));
		assertThat(sessionTokenResponse.getSessionToken(), is(notNullValue()));

		SessionTokenAuthentication sessionTokenAuthentication = SessionTokenAuthentication
				.builder()
				.withToken(sessionTokenResponse.getSessionToken())
				.build();

		QuerySessionRequest querySessionRequest = QuerySessionRequest.builder()
				.withAuthentication(sessionTokenAuthentication)
				.build();
		QuerySessionResponse querySessionResponse = client.doRequest(querySessionRequest);

		assertThat(querySessionResponse, is(notNullValue()));
		assertEquals("{\"foo\":\"bar\"}", querySessionResponse.getSessionVO().getExtra());

	}
}
