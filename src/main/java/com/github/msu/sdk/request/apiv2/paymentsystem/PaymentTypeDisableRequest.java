package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PaymentTypeDisableResponse.class
)
public class PaymentTypeDisableRequest extends ApiRequest {
    private String paymentSystem;

    private String installments;

    private PaymentTypeDisableRequest() {
    }

    public static PaymentTypeDisableRequestBuilder builder() {
        return new PaymentTypeDisableRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTTYPEDISABLE;
    }

    public static final class PaymentTypeDisableRequestBuilder {
        private String paymentSystem;

        private String installments;

        private Authentication authentication;

        public PaymentTypeDisableRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentTypeDisableRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentTypeDisableRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public PaymentTypeDisableRequest build() {
            PaymentTypeDisableRequest request = new PaymentTypeDisableRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.installments = this.installments;
            return request;
        }
    }
}
