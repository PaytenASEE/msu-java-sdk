package com.payten.msu.sdk.request.apiv2.paymentsystem;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.PaymentSystemRuleType;
import com.payten.msu.sdk.request.enumerated.Status;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.BasePaymentSystemRuleResponse;

@ResponseInfo(
        responseClass = BasePaymentSystemRuleResponse.class
)
public class PaymentSystemRuleEditRequest extends ApiRequest {
    private String ruleCode;

    private PaymentSystemRuleType ruleType;

    private String paymentSystemRuleScope;

    private Status status;

    private String paymentSystemList;

    private PaymentSystemRuleEditRequest() {
    }

    public static PaymentSystemRuleEditRequestBuilder builder() {
        return new PaymentSystemRuleEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RULECODE, this.ruleCode);
        addToPayload(Param.RULETYPE, this.ruleType);
        addToPayload(Param.PAYMENTSYSTEMRULESCOPE, this.paymentSystemRuleScope);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.PAYMENTSYSTEMLIST, this.paymentSystemList);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTSYSTEMRULEEDIT;
    }

    public static final class PaymentSystemRuleEditRequestBuilder {
        private String ruleCode;

        private PaymentSystemRuleType ruleType;

        private String paymentSystemRuleScope;

        private Status status;

        private String paymentSystemList;

        private Authentication authentication;

        public PaymentSystemRuleEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentSystemRuleEditRequestBuilder withRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }

        public PaymentSystemRuleEditRequestBuilder withRuleType(PaymentSystemRuleType ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public PaymentSystemRuleEditRequestBuilder withPaymentSystemRuleScope(
                String paymentSystemRuleScope) {
            this.paymentSystemRuleScope = paymentSystemRuleScope;
            return this;
        }

        public PaymentSystemRuleEditRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public PaymentSystemRuleEditRequestBuilder withPaymentSystemList(String paymentSystemList) {
            this.paymentSystemList = paymentSystemList;
            return this;
        }

        public PaymentSystemRuleEditRequest build() {
            PaymentSystemRuleEditRequest request = new PaymentSystemRuleEditRequest();
            request.authentication = this.authentication;
            request.ruleCode = this.ruleCode;
            request.ruleType = this.ruleType;
            request.paymentSystemRuleScope = this.paymentSystemRuleScope;
            request.status = this.status;
            request.paymentSystemList = this.paymentSystemList;
            return request;
        }
    }
}
