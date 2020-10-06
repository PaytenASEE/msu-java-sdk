package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.response.QueryBinResponse;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryBinRequest;
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
