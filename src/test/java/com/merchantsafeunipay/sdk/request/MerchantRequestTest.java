package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.query.QueryMerchantProfileRequest;
import com.merchantsafeunipay.sdk.response.QueryMerchantPaymentSystemsResponse;
import com.merchantsafeunipay.sdk.request.apiv2.query.QueryMerchantPaymentSystemsRequest;
import com.merchantsafeunipay.sdk.response.QueryMerchantProfileResponse;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class MerchantRequestTest extends BaseIntegrationTest{
    @Test
    public void testQueryMerchantPaymentSystems(){
        QueryMerchantPaymentSystemsRequest request = QueryMerchantPaymentSystemsRequest
                .builder()
                .build();

        QueryMerchantPaymentSystemsResponse response = client.doRequest(request);

        assertThat(response, is(notNullValue()));
    }

    @Test
    public void testQueryMerchantProfile(){
        QueryMerchantProfileRequest request = QueryMerchantProfileRequest
                .builder()
                .build();

        QueryMerchantProfileResponse response = client.doRequest(request);

        assertThat(response, is(notNullValue()));
    }
}
