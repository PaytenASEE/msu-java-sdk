package com.payten.sdk.msu.response;

import java.util.ArrayList;
import java.util.List;

import com.payten.sdk.msu.response.model.Payment;

public class QueryPaymentResponse extends ApiResponse {
    private List<Payment> payments = new ArrayList<>();

    public QueryPaymentResponse(List<Payment> payments) {
        this.payments = payments;
    }

    public List<Payment> getPayments() {
        return payments;
    }
}