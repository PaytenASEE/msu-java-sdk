package com.payten.msu.sdk.request.apiv2.paymentsystem;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.BasePaymentSystemRuleResponse;

@ResponseInfo(
        responseClass = BasePaymentSystemRuleResponse.class
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
        addToPayload(Param.RULECODE, this.ruleCode);
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
