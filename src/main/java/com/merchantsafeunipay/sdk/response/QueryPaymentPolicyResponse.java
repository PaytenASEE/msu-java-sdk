package com.merchantsafeunipay.sdk.response;

import java.math.BigDecimal;

public class QueryPaymentPolicyResponse extends ApiResponse {
    private String paymentPolicy;
    private BigDecimal threeDAmountLimit;

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public BigDecimal getThreeDAmountLimit() {
        return threeDAmountLimit;
    }
}
