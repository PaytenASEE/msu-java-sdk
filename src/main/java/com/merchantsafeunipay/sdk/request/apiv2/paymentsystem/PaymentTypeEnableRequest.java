package com.merchantsafeunipay.sdk.request.apiv2.paymentsystem;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.PaymentTypeEnableResponse;

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
