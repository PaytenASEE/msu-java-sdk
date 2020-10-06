package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.financial.PreauthRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.ApiResponse;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class FinancialRequestsTest extends BaseIntegrationTest{
    @Test
    public void testPreauthRequest(){
        PreauthRequest preauthRequest = buildPreauthRequest();
        ApiResponse apiResponse = client.doRequest(preauthRequest);
        assertThat(apiResponse, is(notNullValue()));
    }

    // TODO add others
    @Test
    public void testPostauthRequest(){

    }

    private PreauthRequest buildPreauthRequest() {
        PreauthRequest preauthRequest =  PreauthRequest.builder()
                .withNameOnCard("Filan Fisteku")
                .withAmount(new BigDecimal("240.55"))
                .withCurrency(Currency.TRY)
                .withCustomer("merchant-customer-id")
                .withMerchantPaymentId(UUID.randomUUID().toString())
                .withCardPan("4022774022774026")
                .withCardExpiry("02.2025")
                .withCardCvv("000")
                .build();
        return preauthRequest;
    }
}
