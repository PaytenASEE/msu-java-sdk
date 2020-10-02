package com.github.msu.sdk.request.apiv2.paymentpolicy;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.PPolicy;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PaymentPolicyEditResponse.class
)
public class PaymentPolicyEditRequest extends ApiRequest {
    private String paymentSystem;

    private PPolicy ppolicy;

    private Currency currency;

    private BigDecimal amountLimit;

    private PaymentPolicyEditRequest() {
    }

    public static PaymentPolicyEditRequestBuilder builder() {
        return new PaymentPolicyEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PPOLICY, this.ppolicy);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNTLIMIT, this.amountLimit);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTPOLICYEDIT;
    }

    public static final class PaymentPolicyEditRequestBuilder {
        private String paymentSystem;

        private PPolicy ppolicy;

        private Currency currency;

        private BigDecimal amountLimit;

        private Authentication authentication;

        public PaymentPolicyEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentPolicyEditRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentPolicyEditRequestBuilder withPpolicy(PPolicy ppolicy) {
            this.ppolicy = ppolicy;
            return this;
        }

        public PaymentPolicyEditRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public PaymentPolicyEditRequestBuilder withAmountLimit(BigDecimal amountLimit) {
            this.amountLimit = amountLimit;
            return this;
        }

        public PaymentPolicyEditRequest build() {
            PaymentPolicyEditRequest request = new PaymentPolicyEditRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.ppolicy = this.ppolicy;
            request.currency = this.currency;
            request.amountLimit = this.amountLimit;
            return request;
        }
    }
}
