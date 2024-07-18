package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.financial.VoidRequest;
import com.merchantsafeunipay.sdk.request.apiv2.session.SessionTokenRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.SessionType;
import com.merchantsafeunipay.sdk.response.SessionTokenResponse;
import com.merchantsafeunipay.sdk.response.VoidResponse;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class VoidRequestTest extends BaseIntegrationTest {

    @Test
    public void testVoid() {
        Map<String, String> extra = new HashMap<>();
        extra.put("ISBANK.PARTIALPOINTSVOID","YES");
        VoidRequest voidRequest= VoidRequest.builder()
                .withPgTranId("24194PD8J07047302")
                .withExtra(extra)
                .build();
        VoidResponse voidResponse = client.doRequest(voidRequest);
        assertThat(voidResponse, is(notNullValue()));
    }
}