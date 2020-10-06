package com.merchantsafeunipay.sdk.response;

import java.util.ArrayList;
import java.util.List;

import com.merchantsafeunipay.sdk.response.model.Payment;

public class QueryPaymentResponse extends ApiResponse {
    private List<Payment> payments = new ArrayList<>();

    public QueryPaymentResponse(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}