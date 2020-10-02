package com.github.msu.sdk.request.apiv2.paymentpolicy;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.PPolicy;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PaymentPolicyAddResponse.class
)
public class PaymentPolicyAddRequest extends ApiRequest {
    private String paymentSystem;

    private PPolicy ppolicy;

    private Currency currency;

    private BigDecimal amountLimit;

    private PaymentPolicyAddRequest() {
    }

    public static PaymentPolicyAddRequestBuilder builder() {
        return new PaymentPolicyAddRequestBuilder();
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
        return ApiAction.PAYMENTPOLICYADD;
    }

    public static final class PaymentPolicyAddRequestBuilder {
        private String paymentSystem;

        private PPolicy ppolicy;

        private Currency currency;

        private BigDecimal amountLimit;

        private Authentication authentication;

        public PaymentPolicyAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentPolicyAddRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentPolicyAddRequestBuilder withPpolicy(PPolicy ppolicy) {
            this.ppolicy = ppolicy;
            return this;
        }

        public PaymentPolicyAddRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public PaymentPolicyAddRequestBuilder withAmountLimit(BigDecimal amountLimit) {
            this.amountLimit = amountLimit;
            return this;
        }

        public PaymentPolicyAddRequest build() {
            PaymentPolicyAddRequest request = new PaymentPolicyAddRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.ppolicy = this.ppolicy;
            request.currency = this.currency;
            request.amountLimit = this.amountLimit;
            return request;
        }
    }
}
