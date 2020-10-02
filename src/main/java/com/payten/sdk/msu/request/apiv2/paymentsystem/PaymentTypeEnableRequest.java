package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.PaymentTypeEnableResponse;

@ResponseInfo(
        responseClass = PaymentTypeEnableResponse.class
)
public class PaymentTypeEnableRequest extends ApiRequest {
    private String paymentSystem;

    private String installments;

    private PaymentTypeEnableRequest() {
    }

    public static PaymentTypeEnableRequestBuilder builder() {
        return new PaymentTypeEnableRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.INSTALLMENTS, this.installments);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTTYPEENABLE;
    }

    public static final class PaymentTypeEnableRequestBuilder {
        private String paymentSystem;

        private String installments;

        private Authentication authentication;

        public PaymentTypeEnableRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentTypeEnableRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentTypeEnableRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public PaymentTypeEnableRequest build() {
            PaymentTypeEnableRequest request = new PaymentTypeEnableRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.installments = this.installments;
            return request;
        }
    }
}
