package com.merchantsafeunipay.sdk.request;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryPointsRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.QueryPointsResponse;
import com.merchantsafeunipay.sdk.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class QueryPointsTest extends BaseIntegrationTest {
    @Test
    public void queryPoints() throws Exception {
        QueryPointsRequest queryPointsRequest = QueryPointsRequest.builder()
                .withAmount(new BigDecimal(100))
                .withCurrency(Currency.TRY)
                .withCustomer("test" + StringUtils.generateString(5))
                .withCardPan("4022780107947023")
                .withCardCvv("123")
                .withCardExpiry("01.2050")
                .withNameOnCard("test"+StringUtils.generateString(5))
                .withMerchantPaymentId("test"+ StringUtils.generateString(5))
                .withPaymentSystem("QNBFINANS")
                .build();
        QueryPointsResponse queryPointsResponse = client.doRequest(queryPointsRequest);
        Assert.assertTrue(queryPointsResponse.getResponseMsg().contains("Approved"));
    }
}