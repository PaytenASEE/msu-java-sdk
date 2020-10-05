package com.payten.sdk.msu.request;

import com.payten.sdk.msu.request.apiv2.query.QueryCardRequest;
import com.payten.sdk.msu.response.QueryCardResponse;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class CardRequestsTest extends BaseIntegrationTest{
    @Test
    public void testQueryCard(){
        QueryCardRequest request = QueryCardRequest.builder()
                .withCustomer("isahb")
                .build();

        QueryCardResponse response = client.doRequest(request);
        assertThat(response, is(notNullValue()));
    }
}
