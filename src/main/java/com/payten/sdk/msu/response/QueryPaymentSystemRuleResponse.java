package com.payten.sdk.msu.response;

import com.payten.sdk.msu.request.enumerated.PaymentSystemRuleType;
import com.payten.sdk.msu.response.model.PaymentSystemRule;

import java.util.ArrayList;
import java.util.List;

public class QueryPaymentSystemRuleResponse extends ApiResponse {
    private PaymentSystemRuleType ruleType;
    private List<PaymentSystemRule> paymentSystemRules = new ArrayList<>();

    public PaymentSystemRuleType getRuleType() {
        return ruleType;
    }

    public void setRuleType(PaymentSystemRuleType ruleType) {
        this.ruleType = ruleType;
    }

    public List<PaymentSystemRule> getPaymentSystemRules() {
        return paymentSystemRules;
    }

    public void setPaymentSystemRules(List<PaymentSystemRule> paymentSystemRules) {
        this.paymentSystemRules = paymentSystemRules;
    }
}
