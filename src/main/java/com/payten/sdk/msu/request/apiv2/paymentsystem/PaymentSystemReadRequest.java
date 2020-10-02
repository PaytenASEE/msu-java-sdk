package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.PaymentSystemType;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.PaymentSystemReadResponse;

@ResponseInfo(
        responseClass = PaymentSystemReadResponse.class
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
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
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
