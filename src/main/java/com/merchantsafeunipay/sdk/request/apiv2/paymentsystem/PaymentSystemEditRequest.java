package com.merchantsafeunipay.sdk.request.apiv2.paymentsystem;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.*;
import com.merchantsafeunipay.sdk.response.PaymentSystemEditResponse;

public class PaymentSystemEditRequest extends ApiRequest<PaymentSystemEditResponse> {
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

    private YesNo adjustRates;

    private PaymentSystemEditRequest() {
    }

    public static PaymentSystemEditRequestBuilder builder() {
        return new PaymentSystemEditRequestBuilder();
    }

    @Override
    public Class<PaymentSystemEditResponse> responseClass() {
        return PaymentSystemEditResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.PAYMENTSYSTEMMODE, this.paymentSystemMode);
        addToPayload(Param.APIMERCHANTID, this.apiMerchantId);
        addToPayload(Param.APIUSERNAME, this.apiUserName);
        addToPayload(Param.APIPASSWORD, this.apiPassword);
        addToPayload(Param.GATE3DKEY, this.gate3dKey);
        addToPayload(Param.INTEGRATIONEXTRAFIELD00, this.integrationExtraField00);
        addToPayload(Param.INTEGRATIONEXTRAFIELD01, this.integrationExtraField01);
        addToPayload(Param.ISDEFAULT, this.isDefault);
        addToPayload(Param.SUBMERCHANTCODE, this.subMerchantCode);
        addToPayload(Param.ADJUSTRATES, this.adjustRates);
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

        private YesNo adjustRates;

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

        public PaymentSystemEditRequestBuilder withAdjustRates(YesNo adjustRates) {
            this.adjustRates = adjustRates;
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
            request.adjustRates = this.adjustRates;
            return request;
        }
    }
}
