package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.response.QueryPaymentSystemsResponse;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryPaymentSystemsRequest;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class PaymentSystemRequestsTest extends BaseIntegrationTest{
    @Test
    public void queryPaymentSystems(){
        QueryPaymentSystemsRequest queryPaymentSystemsRequest = QueryPaymentSystemsRequest.builder()
                .withBin("402277")
                .withAmount(new BigDecimal("322.00"))
                .build();

        QueryPaymentSystemsResponse queryPaymentSystemsResponse = client.doRequest(queryPaymentSystemsRequest);
        assertThat(queryPaymentSystemsResponse, is(notNullValue()));
    }
    
}
