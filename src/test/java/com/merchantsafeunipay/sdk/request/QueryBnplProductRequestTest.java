package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.query.QueryBnplProductRequest;
import com.merchantsafeunipay.sdk.response.QueryBnplProductResponse;
import org.junit.Test;

public class QueryBnplProductRequestTest extends BaseIntegrationTest {

    @Test
    public void queryBnplProduct() {
        QueryBnplProductRequest queryBnplProductRequest = QueryBnplProductRequest.builder()
                .withCode("1234")
                .withValidFor("DEALER")
                .withPaymentSystem("YKB_LOAN")
                .build();

        QueryBnplProductResponse queryBnplProductResponse = client.doRequest(queryBnplProductRequest);
        System.out.println(queryBnplProductResponse.getRawResponse());
    }
}