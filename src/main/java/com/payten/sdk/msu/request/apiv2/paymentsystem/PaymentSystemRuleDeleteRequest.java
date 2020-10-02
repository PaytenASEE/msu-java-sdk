package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.BasePaymentSystemRuleResponse;

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
