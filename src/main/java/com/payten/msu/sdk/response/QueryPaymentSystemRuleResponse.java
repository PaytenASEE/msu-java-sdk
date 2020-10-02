package com.payten.msu.sdk.response;

import com.payten.msu.sdk.request.enumerated.PaymentSystemRuleType;
import com.payten.msu.sdk.response.model.PaymentSystemRule;

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
