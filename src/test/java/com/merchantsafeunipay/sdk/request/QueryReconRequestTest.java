package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.financial.SaleRequest;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryReconRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.QueryReconResponse;
import com.merchantsafeunipay.sdk.response.SaleResponse;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.UUID;

public class QueryReconRequestTest extends BaseIntegrationTest{

    @Test
    public void whenTransactionExistsThenQueryReconReturned(){
        String merchantPaymentId = "payment-" + UUID.randomUUID().toString();
        SaleRequest saleRequest = SaleRequest.builder()
                .withAmount(new BigDecimal("101.00"))
                .withCurrency(Currency.TRY)
                .withCustomer("customer-" + UUID.randomUUID().toString())
                .withMerchantPaymentId(merchantPaymentId)
                .withCardPan("4508034508034509")
                .withCardCvv("000")
                .withCardExpiry("12.2023")
                .withNameOnCard("fasfsasaf")
                .build();

        SaleResponse saleResponse = client.doRequest(saleRequest);
        QueryReconRequest queryReconRequest = QueryReconRequest.builder()
                .withMerchantPaymentId(merchantPaymentId)
                .build();
        QueryReconResponse queryReconResponse = client.doRequest(queryReconRequest);
        Assert.assertEquals(1, queryReconResponse.getTotalTransactionCount());
        Assert.assertEquals(1, queryReconResponse.getTransactionCount());
        Assert.assertEquals(1, queryReconResponse.getTransactions().size());
        Assert.assertEquals(merchantPaymentId, queryReconResponse.getTransactions().get(0).getPgOrderId());
    }
}
