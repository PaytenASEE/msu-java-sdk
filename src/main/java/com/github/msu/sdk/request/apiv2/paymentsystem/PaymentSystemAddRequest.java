package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.*;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PaymentSystemAddResponse.class
)
public class PaymentSystemAddRequest extends ApiRequest {
    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private Status status;

    private PaymentSystemMode paymentSystemMode;

    private String apiMerchantId;

    private String apiUserName;

    private String apiPassword;

    private String gate3dKey;

    private String integrationExtraField00;

    private String integrationExtraField01;

    private String isDefault;

    private String subMerchantCode;

    private YesNo adjustrates;

    private PaymentSystemAddRequest() {
    }

    public static PaymentSystemAddRequestBuilder builder() {
        return new PaymentSystemAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMMODE, this.paymentSystemMode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.APIMERCHANTID, this.apiMerchantId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.APIUSERNAME, this.apiUserName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.APIPASSWORD, this.apiPassword);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.GATE3DKEY, this.gate3dKey);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INTEGRATIONEXTRAFIELD00, this.integrationExtraField00);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INTEGRATIONEXTRAFIELD01, this.integrationExtraField01);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISDEFAULT, this.isDefault);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SUBMERCHANTCODE, this.subMerchantCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ADJUSTRATES, this.adjustrates);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTSYSTEMADD;
    }

    public static final class PaymentSystemAddRequestBuilder {
        private String paymentSystem;

        private PaymentSystemType paymentSystemType;

        private Status status;

        private PaymentSystemMode paymentSystemMode;

        private String apiMerchantId;

        private String apiUserName;

        private String apiPassword;

        private String gate3dKey;

        private String integrationExtraField00;

        private String integrationExtraField01;

        private String isDefault;

        private String subMerchantCode;

        private YesNo adjustrates;

        private Authentication authentication;

        public PaymentSystemAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentSystemAddRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentSystemAddRequestBuilder withPaymentSystemType(
                PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public PaymentSystemAddRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public PaymentSystemAddRequestBuilder withPaymentSystemMode(
                PaymentSystemMode paymentSystemMode) {
            this.paymentSystemMode = paymentSystemMode;
            return this;
        }

        public PaymentSystemAddRequestBuilder withApiMerchantId(String apiMerchantId) {
            this.apiMerchantId = apiMerchantId;
            return this;
        }

        public PaymentSystemAddRequestBuilder withApiUserName(String apiUserName) {
            this.apiUserName = apiUserName;
            return this;
        }

        public PaymentSystemAddRequestBuilder withApiPassword(String apiPassword) {
            this.apiPassword = apiPassword;
            return this;
        }

        public PaymentSystemAddRequestBuilder withGate3dKey(String gate3dKey) {
            this.gate3dKey = gate3dKey;
            return this;
        }

        public PaymentSystemAddRequestBuilder withIntegrationExtraField00(
                String integrationExtraField00) {
            this.integrationExtraField00 = integrationExtraField00;
            return this;
        }

        public PaymentSystemAddRequestBuilder withIntegrationExtraField01(
                String integrationExtraField01) {
            this.integrationExtraField01 = integrationExtraField01;
            return this;
        }

        public PaymentSystemAddRequestBuilder withIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public PaymentSystemAddRequestBuilder withSubMerchantCode(String subMerchantCode) {
            this.subMerchantCode = subMerchantCode;
            return this;
        }

        public PaymentSystemAddRequestBuilder withAdjustrates(YesNo adjustrates) {
            this.adjustrates = adjustrates;
            return this;
        }

        public PaymentSystemAddRequest build() {
            PaymentSystemAddRequest request = new PaymentSystemAddRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.paymentSystemType = this.paymentSystemType;
            request.status = this.status;
            request.paymentSystemMode = this.paymentSystemMode;
            request.apiMerchantId = this.apiMerchantId;
            request.apiUserName = this.apiUserName;
            request.apiPassword = this.apiPassword;
            request.gate3dKey = this.gate3dKey;
            request.integrationExtraField00 = this.integrationExtraField00;
            request.integrationExtraField01 = this.integrationExtraField01;
            request.isDefault = this.isDefault;
            request.subMerchantCode = this.subMerchantCode;
            request.adjustrates = this.adjustrates;
            return request;
        }
    }
}
