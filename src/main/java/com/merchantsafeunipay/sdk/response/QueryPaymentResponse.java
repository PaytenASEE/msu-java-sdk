package com.merchantsafeunipay.sdk.response;

import com.merchantsafeunipay.sdk.response.model.Payment;

import java.util.ArrayList;
import java.util.List;

public class QueryPaymentResponse extends ApiResponse {
    private List<Payment> payments = new ArrayList<>();

    public QueryPaymentResponse(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}