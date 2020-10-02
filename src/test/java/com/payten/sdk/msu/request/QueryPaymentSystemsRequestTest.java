package com.payten.sdk.msu.request;

import com.payten.sdk.msu.request.apiv2.query.QueryPaymentSystemsRequest;
import com.payten.sdk.msu.response.QueryPaymentSystemsResponse;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class QueryPaymentSystemsRequestTest extends BaseIntegrationTest {
    @Test
    public void testQueryPaymentSystems() {
        QueryPaymentSystemsRequest queryPaymentSystemsRequest = QueryPaymentSystemsRequest.builder()
                .withBin("402277")
                .withAmount(new BigDecimal("150.00"))
                .build();
        QueryPaymentSystemsResponse queryPaymentSystemsResponse = client.doRequest(queryPaymentSystemsRequest);
        assertThat(queryPaymentSystemsResponse, is(notNullValue()));
    }
}
