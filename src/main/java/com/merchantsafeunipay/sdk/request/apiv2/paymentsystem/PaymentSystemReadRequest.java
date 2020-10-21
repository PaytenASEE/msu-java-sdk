package com.merchantsafeunipay.sdk.request.apiv2.paymentsystem;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.PaymentSystemType;
import com.merchantsafeunipay.sdk.response.PaymentSystemReadResponse;

public class PaymentSystemReadRequest extends ApiRequest<PaymentSystemReadResponse> {
    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private PaymentSystemReadRequest() {
    }

    public static PaymentSystemReadRequestBuilder builder() {
        return new PaymentSystemReadRequestBuilder();
    }

    @Override
    public Class<PaymentSystemReadResponse> responseClass() {
        return PaymentSystemReadResponse.class;
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
