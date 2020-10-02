package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.*;
import com.payten.sdk.msu.response.PaymentSystemAddResponse;
import com.payten.sdk.msu.util.ResponseInfo;

@ResponseInfo(
        responseClass = PaymentSystemAddResponse.class
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

    private YesNo adjustRates;

    private PaymentSystemAddRequest() {
    }

    public static PaymentSystemAddRequestBuilder builder() {
        return new PaymentSystemAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
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

        private YesNo adjustRates;

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

        public PaymentSystemAddRequestBuilder withAdjustRates(YesNo adjustRates) {
            this.adjustRates = adjustRates;
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
            request.adjustRates = this.adjustRates;
            return request;
        }
    }
}
