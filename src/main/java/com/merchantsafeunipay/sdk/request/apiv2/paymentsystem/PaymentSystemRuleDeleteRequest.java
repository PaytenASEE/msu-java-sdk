package com.merchantsafeunipay.sdk.request.apiv2.paymentsystem;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.BasePaymentSystemRuleResponse;

public class PaymentSystemRuleDeleteRequest extends ApiRequest<BasePaymentSystemRuleResponse> {
    private String ruleCode;

    private PaymentSystemRuleDeleteRequest() {
    }

    public static PaymentSystemRuleDeleteRequestBuilder builder() {
        return new PaymentSystemRuleDeleteRequestBuilder();
    }

    @Override
    public Class<BasePaymentSystemRuleResponse> responseClass() {
        return BasePaymentSystemRuleResponse.class;
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
