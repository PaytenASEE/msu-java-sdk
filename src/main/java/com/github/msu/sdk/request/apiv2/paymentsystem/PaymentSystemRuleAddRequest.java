package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.PaymentSystemRuleType;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.response.BasePaymentSystemRuleResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = BasePaymentSystemRuleResponse.class
)
public class PaymentSystemRuleAddRequest extends ApiRequest {
    private PaymentSystemRuleType ruleType;

    private String paymentSystemRuleScope;

    private Status status;

    private String paymentSystemList;

    private PaymentSystemRuleAddRequest() {
    }

    public static PaymentSystemRuleAddRequestBuilder builder() {
        return new PaymentSystemRuleAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RULETYPE, this.ruleType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMRULESCOPE, this.paymentSystemRuleScope);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMLIST, this.paymentSystemList);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTSYSTEMRULEADD;
    }

    public static final class PaymentSystemRuleAddRequestBuilder {
        private PaymentSystemRuleType ruleType;

        private String paymentSystemRuleScope;

        private Status status;

        private String paymentSystemList;

        private Authentication authentication;

        public PaymentSystemRuleAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentSystemRuleAddRequestBuilder withRuleType(PaymentSystemRuleType ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public PaymentSystemRuleAddRequestBuilder withPaymentSystemRuleScope(
                String paymentSystemRuleScope) {
            this.paymentSystemRuleScope = paymentSystemRuleScope;
            return this;
        }

        public PaymentSystemRuleAddRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public PaymentSystemRuleAddRequestBuilder withPaymentSystemList(String paymentSystemList) {
            this.paymentSystemList = paymentSystemList;
            return this;
        }

        public PaymentSystemRuleAddRequest build() {
            PaymentSystemRuleAddRequest request = new PaymentSystemRuleAddRequest();
            request.authentication = this.authentication;
            request.ruleType = this.ruleType;
            request.paymentSystemRuleScope = this.paymentSystemRuleScope;
            request.status = this.status;
            request.paymentSystemList = this.paymentSystemList;
            return request;
        }
    }
}
