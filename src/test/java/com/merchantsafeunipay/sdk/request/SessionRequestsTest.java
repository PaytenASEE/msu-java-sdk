package com.merchantsafeunipay.sdk.request;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.merchantsafeunipay.sdk.authentication.types.SessionTokenAuthentication;
import com.merchantsafeunipay.sdk.request.apiv2.invoice.InvoiceAddRequest;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryCustomFieldRequest;
import com.merchantsafeunipay.sdk.request.apiv2.query.QuerySessionRequest;
import com.merchantsafeunipay.sdk.request.apiv2.session.SessionTokenRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.SessionType;
import com.merchantsafeunipay.sdk.response.InvoiceAddResponse;
import com.merchantsafeunipay.sdk.response.QueryCustomFieldResponse;
import com.merchantsafeunipay.sdk.response.QuerySessionResponse;
import com.merchantsafeunipay.sdk.response.SessionTokenResponse;
import com.merchantsafeunipay.sdk.response.model.CustomField;
import com.merchantsafeunipay.sdk.util.StringUtils;
import org.junit.Assert;
import org.junit.Ignore;
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
		SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder()
				.withCurrency(Currency.TRY)
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

	@Test
	public void testSessionTokenWithCustomFields() throws Exception {
		List<CustomField> customFields = new ArrayList<>();
		String testIntegrationCode = "byvMVUHsfYpFsuV"; //do not forget that this code should be enabled on test merchant.
		String testValue = "value";
		customFields.add(CustomField.builder()
				.integrationCode(testIntegrationCode)
				.value(testValue)
				.build());
		SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder().withCurrency(Currency.TRY)
				.withSessionType(SessionType.PAYMENTSESSION)
				.withAmount(new BigDecimal("100.00"))
				.withCustomer("customer" + StringUtils.generateString(10))
				.withMerchantPaymentId("payment" + StringUtils.generateString(10))
				.withReturnUrl("http://www.returnurl.com")
				.withCustomFields(customFields)
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
		List<CustomField> customFieldListOnResponse = querySessionResponse.getSessionVO().getCustomFields();

		assertThat(querySessionResponse, is(notNullValue()));
		assertEquals(testIntegrationCode, customFieldListOnResponse.get(0).getIntegrationCode());
		assertEquals(testValue, customFieldListOnResponse.get(0).getValue());
	}

	@Test
	public void testSessionTokenWithMerchantOrderId() throws Exception {
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Map<String, String> extra = new HashMap<>();
		extra.put("Preauth","YES");
		String merchantOrderId = StringUtils.generateString(10);
		InvoiceAddRequest invoiceAddRequest = InvoiceAddRequest
				.builder()
				.withMerchantOrderId(merchantOrderId)
				.withExtra(extra)
				.withName(StringUtils.generateString(10))
				.withIssueDate(StringUtils.getDateAfterAddedInDays(formatter, 0))
				.withDueDate(StringUtils.getDateAfterAddedInDays(formatter, 7))
				.withAmount(new BigDecimal("100.0"))
				.withOriginalAmount(new BigDecimal("100.0"))
				.withCurrency(Currency.TRY)
				.withDealerCode("auth01")
				.build();
		InvoiceAddResponse invoiceAddResponse = client.doRequest(invoiceAddRequest);
		assertThat(invoiceAddResponse, is(notNullValue()));
		assertThat(invoiceAddResponse.isApproved(), is(Boolean.TRUE));

		String merchantPaymentId = StringUtils.generateString(10);
		SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder()
				.withCurrency(Currency.TRY)
				.withSessionType(SessionType.PAYMENTSESSION)
				.withAmount(new BigDecimal("100.00"))
				.withCustomer("customer" + StringUtils.generateString(10))
				.withMerchantOrderId(merchantOrderId)
				.withMerchantPaymentId(merchantPaymentId)
				.withReturnUrl("http://www.returnurl.com")
				.build();

		SessionTokenResponse sessionTokenResponse = client.doRequest(sessionTokenRequest);
		assertThat(sessionTokenResponse, is(notNullValue()));
		assertThat(sessionTokenResponse.getSessionToken(), is(notNullValue()));
	}
}
