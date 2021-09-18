package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.authentication.types.SessionTokenAuthentication;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryBinBasedActionRequest;
import com.merchantsafeunipay.sdk.request.apiv2.session.SessionTokenRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.SessionType;
import com.merchantsafeunipay.sdk.response.QueryBinBasedActionResponse;
import com.merchantsafeunipay.sdk.response.SessionTokenResponse;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.UUID;


public class BinBasedActionRequestTest extends BaseIntegrationTest {
    @Test
    public void checkBinBasedActionRequest() {

        SessionTokenRequest sessionTokenRequest = SessionTokenRequest.builder()
                .withCurrency(Currency.TRY)
                .withSessionType(SessionType.PAYMENTSESSION)
                .withAmount(new BigDecimal("101.00"))
                .withCustomer("customer-" + UUID.randomUUID().toString())
                .withMerchantPaymentId("payment-" + UUID.randomUUID().toString())
                .withReturnUrl("https://test.merchantsafeunipay.com/merchant/index.jsp")
                .withPaymentSystem("paymentSystem-oRtzn")
                .build();
        SessionTokenResponse sessionTokenResponse = client.doRequest(sessionTokenRequest);

        QueryBinBasedActionRequest queryBinBasedActionRequest = QueryBinBasedActionRequest.builder()
                .withAuthentication(SessionTokenAuthentication
                        .builder()
                        .withToken(sessionTokenResponse.getSessionToken()).build())
                .withRuleName("DontRemove")
                .build();
        QueryBinBasedActionResponse binBasedActionResponse = client.doRequest(queryBinBasedActionRequest);
        Assert.assertNotNull(binBasedActionResponse);
    }


}
