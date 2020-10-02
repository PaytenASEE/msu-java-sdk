package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.BasePaymentSystemRuleResponse.class
)
public class PaymentSystemRuleDeleteRequest extends ApiRequest {
    private String ruleCode;

    private PaymentSystemRuleDeleteRequest() {
    }

    public static PaymentSystemRuleDeleteRequestBuilder builder() {
        return new PaymentSystemRuleDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RULECODE, this.ruleCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTSYSTEMRULEDELETE;
    }

    public static final class PaymentSystemRuleDeleteRequestBuilder {
        private String ruleCode;

        private Authentication authentication;

        public PaymentSystemRuleDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentSystemRuleDeleteRequestBuilder withRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }

        public PaymentSystemRuleDeleteRequest build() {
            PaymentSystemRuleDeleteRequest request = new PaymentSystemRuleDeleteRequest();
            request.authentication = this.authentication;
            request.ruleCode = this.ruleCode;
            return request;
        }
    }
}
