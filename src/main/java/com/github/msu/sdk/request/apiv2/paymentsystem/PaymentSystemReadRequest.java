package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.PaymentSystemType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PaymentSystemReadResponse.class
)
public class PaymentSystemReadRequest extends ApiRequest {
    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private PaymentSystemReadRequest() {
    }

    public static PaymentSystemReadRequestBuilder builder() {
        return new PaymentSystemReadRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTSYSTEMREAD;
    }

    public static final class PaymentSystemReadRequestBuilder {
        private String paymentSystem;

        private PaymentSystemType paymentSystemType;

        private Authentication authentication;

        public PaymentSystemReadRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentSystemReadRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentSystemReadRequestBuilder withPaymentSystemType(
                PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public PaymentSystemReadRequest build() {
            PaymentSystemReadRequest request = new PaymentSystemReadRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.paymentSystemType = this.paymentSystemType;
            return request;
        }
    }
}
