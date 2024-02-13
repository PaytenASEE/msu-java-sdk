package com.merchantsafeunipay.sdk.request;

import com.merchantsafeunipay.sdk.request.apiv2.query.QrpaymentRequest;
import com.merchantsafeunipay.sdk.response.QrpaymentResponse;
import org.junit.Assert;
import org.junit.Test;

public class QrPaymentTest extends BaseIntegrationTest{
    @Test
    public void qrPayment() {
        QrpaymentRequest qrpaymentRequest = QrpaymentRequest.builder()
                .withCurrency("TRY")
                .withAmount("200")
                .withMerchantPaymentId("KuveytTurk-1")
                .withSessionToken("CF6OGRQDKB6EB67YQVL6WLP7HDIV2BNM6TLKQP4S2IDEJ4CY")
                .withPaymentSystemType("KUVEYTTURK_LOAN")
                .build();

        QrpaymentResponse qrpaymentResponse = client.doRequest(qrpaymentRequest);
        Assert.assertTrue(qrpaymentResponse.getResponseMsg().contains("Approved"));
    }
}
