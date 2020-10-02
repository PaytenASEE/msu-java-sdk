package com.payten.msu.sdk.request.apiv2.paymentpolicy;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Currency;
import com.payten.msu.sdk.request.enumerated.PPolicy;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.PaymentPolicyAddResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = PaymentPolicyAddResponse.class
)
public class PaymentPolicyAddRequest extends ApiRequest {
    private String paymentSystem;

    private PPolicy pPolicy;

    private Currency currency;

    private BigDecimal amountLimit;

    private PaymentPolicyAddRequest() {
    }

    public static PaymentPolicyAddRequestBuilder builder() {
        return new PaymentPolicyAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PPOLICY, this.pPolicy);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.AMOUNTLIMIT, this.amountLimit);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTPOLICYADD;
    }

    public static final class PaymentPolicyAddRequestBuilder {
        private String paymentSystem;

        private PPolicy pPolicy;

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

        public PaymentPolicyAddRequestBuilder withPPolicy(PPolicy pPolicy) {
            this.pPolicy = pPolicy;
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
            request.pPolicy = this.pPolicy;
            request.currency = this.currency;
            request.amountLimit = this.amountLimit;
            return request;
        }
    }
}
