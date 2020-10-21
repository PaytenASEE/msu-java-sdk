package com.merchantsafeunipay.sdk.request.apiv2.paymentsystem;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.PaymentSystemType;
import com.merchantsafeunipay.sdk.response.PaymentSystemDisableResponse;

public class PaymentSystemDisableRequest extends ApiRequest<PaymentSystemDisableResponse> {
    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private PaymentSystemDisableRequest() {
    }

    public static PaymentSystemDisableRequestBuilder builder() {
        return new PaymentSystemDisableRequestBuilder();
    }

    @Override
    public Class<PaymentSystemDisableResponse> responseClass() {
        return PaymentSystemDisableResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTSYSTEMDISABLE;
    }

    public static final class PaymentSystemDisableRequestBuilder {
        private String paymentSystem;

        private PaymentSystemType paymentSystemType;

        private Authentication authentication;

        public PaymentSystemDisableRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentSystemDisableRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentSystemDisableRequestBuilder withPaymentSystemType(
                PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public PaymentSystemDisableRequest build() {
            PaymentSystemDisableRequest request = new PaymentSystemDisableRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.paymentSystemType = this.paymentSystemType;
            return request;
        }
    }
}
