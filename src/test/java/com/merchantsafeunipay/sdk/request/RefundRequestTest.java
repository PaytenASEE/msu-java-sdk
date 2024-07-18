package com.merchantsafeunipay.sdk.request;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.merchantsafeunipay.sdk.request.apiv2.financial.RefundRequest;
import com.merchantsafeunipay.sdk.request.apiv2.financial.VoidRequest;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.RefundResponse;
import com.merchantsafeunipay.sdk.response.VoidResponse;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class RefundRequestTest extends BaseIntegrationTest {
    @Test
    public void testRefund() {
        Map<String, String> extra = new HashMap<>();
        extra.put("ISBANK.PARTIALPOINTSREFUND","YES");
        RefundRequest refundRequest= RefundRequest.builder()
                .withCurrency(Currency.TRY)
                .withAmount(new BigDecimal(9))
                .withPgTranId("24194QLgJ07030785")
                .withExtra(extra)
                .build();
        RefundResponse refundResponse = client.doRequest(refundRequest);
        assertThat(refundResponse, is(notNullValue()));
    }
}
