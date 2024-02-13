package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.query.QrPaymentRequest;
import com.merchantsafeunipay.sdk.response.QrPaymentResponse;
import org.junit.Assert;
import org.junit.Test;

public class QrPaymentTest extends BaseIntegrationTest{
    @Test
    public void qrPayment() {
        QrPaymentRequest qrPaymentRequest = QrPaymentRequest.builder()
                .withCurrency("TRY")
                .withAmount("200")
                .withMerchantPaymentId("KuveytTurk-1")
                .withSessionToken("CF6OGRQDKB6EB67YQVL6WLP7HDIV2BNM6TLKQP4S2IDEJ4CY")
                .withPaymentSystemType("KUVEYTTURK_LOAN")
                .build();

        QrPaymentResponse qrPaymentResponse = client.doRequest(qrPaymentRequest);
        Assert.assertTrue(qrPaymentResponse.getResponseMsg().contains("Approved"));
    }
}
