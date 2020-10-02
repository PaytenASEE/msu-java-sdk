package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.PaymentTypeDisableResponse;

@ResponseInfo(
        responseClass = PaymentTypeDisableResponse.class
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
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.INSTALLMENTS, this.installments);
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
