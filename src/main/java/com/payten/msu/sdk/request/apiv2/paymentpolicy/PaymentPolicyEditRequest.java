package com.payten.msu.sdk.request.apiv2.paymentpolicy;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Currency;
import com.payten.msu.sdk.request.enumerated.PPolicy;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.PaymentPolicyEditResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = PaymentPolicyEditResponse.class
)
public class PaymentPolicyEditRequest extends ApiRequest {
    private String paymentSystem;

    private PPolicy pPolicy;

    private Currency currency;

    private BigDecimal amountLimit;

    private PaymentPolicyEditRequest() {
    }

    public static PaymentPolicyEditRequestBuilder builder() {
        return new PaymentPolicyEditRequestBuilder();
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
        return ApiAction.PAYMENTPOLICYEDIT;
    }

    public static final class PaymentPolicyEditRequestBuilder {
        private String paymentSystem;

        private PPolicy pPolicy;

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

        public PaymentPolicyEditRequestBuilder withPPolicy(PPolicy pPolicy) {
            this.pPolicy = pPolicy;
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
            request.pPolicy = this.pPolicy;
            request.currency = this.currency;
            request.amountLimit = this.amountLimit;
            return request;
        }
    }
}
