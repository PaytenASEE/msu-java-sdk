package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.PaymentSystemRuleType;
import com.payten.sdk.msu.request.enumerated.Status;
import com.payten.sdk.msu.response.BasePaymentSystemRuleResponse;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;

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
        addToPayload(Param.RULETYPE, this.ruleType);
        addToPayload(Param.PAYMENTSYSTEMRULESCOPE, this.paymentSystemRuleScope);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.PAYMENTSYSTEMLIST, this.paymentSystemList);
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
