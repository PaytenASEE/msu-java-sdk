package com.payten.sdk.msu.request;

import com.payten.sdk.msu.request.apiv2.query.QueryBinRequest;
import com.payten.sdk.msu.response.QueryBinResponse;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class BinRequestsTest extends BaseIntegrationTest{
    @Test
    public void testQueryBin(){
        QueryBinRequest request = QueryBinRequest.builder()
                .withBin("402277")
                .build();
        QueryBinResponse response = client.doRequest(request);
        assertThat(response, is(notNullValue()));
    }
}
