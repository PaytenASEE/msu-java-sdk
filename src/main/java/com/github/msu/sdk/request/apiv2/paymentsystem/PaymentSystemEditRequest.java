package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.*;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PaymentSystemEditResponse.class
)
public class PaymentSystemEditRequest extends ApiRequest {
    private PaymentSystemType paymentSystemType;

    private String paymentSystem;

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

    private PaymentSystemEditRequest() {
    }

    public static PaymentSystemEditRequestBuilder builder() {
        return new PaymentSystemEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
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
        return ApiAction.PAYMENTSYSTEMEDIT;
    }

    public static final class PaymentSystemEditRequestBuilder {
        private PaymentSystemType paymentSystemType;

        private String paymentSystem;

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

        public PaymentSystemEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentSystemEditRequestBuilder withPaymentSystemType(
                PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public PaymentSystemEditRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentSystemEditRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public PaymentSystemEditRequestBuilder withPaymentSystemMode(
                PaymentSystemMode paymentSystemMode) {
            this.paymentSystemMode = paymentSystemMode;
            return this;
        }

        public PaymentSystemEditRequestBuilder withApiMerchantId(String apiMerchantId) {
            this.apiMerchantId = apiMerchantId;
            return this;
        }

        public PaymentSystemEditRequestBuilder withApiUserName(String apiUserName) {
            this.apiUserName = apiUserName;
            return this;
        }

        public PaymentSystemEditRequestBuilder withApiPassword(String apiPassword) {
            this.apiPassword = apiPassword;
            return this;
        }

        public PaymentSystemEditRequestBuilder withGate3dKey(String gate3dKey) {
            this.gate3dKey = gate3dKey;
            return this;
        }

        public PaymentSystemEditRequestBuilder withIntegrationExtraField00(
                String integrationExtraField00) {
            this.integrationExtraField00 = integrationExtraField00;
            return this;
        }

        public PaymentSystemEditRequestBuilder withIntegrationExtraField01(
                String integrationExtraField01) {
            this.integrationExtraField01 = integrationExtraField01;
            return this;
        }

        public PaymentSystemEditRequestBuilder withIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public PaymentSystemEditRequestBuilder withSubMerchantCode(String subMerchantCode) {
            this.subMerchantCode = subMerchantCode;
            return this;
        }

        public PaymentSystemEditRequestBuilder withAdjustrates(YesNo adjustrates) {
            this.adjustrates = adjustrates;
            return this;
        }

        public PaymentSystemEditRequest build() {
            PaymentSystemEditRequest request = new PaymentSystemEditRequest();
            request.authentication = this.authentication;
            request.paymentSystemType = this.paymentSystemType;
            request.paymentSystem = this.paymentSystem;
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
