package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.PaymentSystemType;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.PaymentSystemDisableResponse;

@ResponseInfo(
        responseClass = PaymentSystemDisableResponse.class
)
public class PaymentSystemDisableRequest extends ApiRequest {
    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private PaymentSystemDisableRequest() {
    }

    public static PaymentSystemDisableRequestBuilder builder() {
        return new PaymentSystemDisableRequestBuilder();
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
