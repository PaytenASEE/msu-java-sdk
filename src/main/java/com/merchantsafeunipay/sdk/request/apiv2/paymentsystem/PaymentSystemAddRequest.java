package com.merchantsafeunipay.sdk.request.apiv2.paymentsystem;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.*;
import com.merchantsafeunipay.sdk.response.PaymentSystemAddResponse;

public class PaymentSystemAddRequest extends ApiRequest<PaymentSystemAddResponse> {
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

    private String integrationExtraField02;

    private String isDefault;

    private String subMerchantCode;

    private YesNo adjustRates;

    private String merchantKey;

    private String appSecret;

    private String merchantId;

    private String secureKey;

    private String directPossURL;

    private String directPoss3DURL;

    private String integrationExtraField03;

    private PaymentSystemAddRequest() {
    }

    public static PaymentSystemAddRequestBuilder builder() {
        return new PaymentSystemAddRequestBuilder();
    }

    @Override
    public Class<PaymentSystemAddResponse> responseClass() {
        return PaymentSystemAddResponse.class;
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
        addToPayload(Param.INTEGRATIONEXTRAFIELD02, this.integrationExtraField02);
        addToPayload(Param.MERCHANTKEY,this.merchantKey);
        addToPayload(Param.APPSECRET,this.appSecret);
        addToPayload(Param.MERCHANTID,this.merchantId);
        addToPayload(Param.SECUREKEY,this.secureKey);
        addToPayload(Param.DIRECTPOSSURL,this.directPossURL);
        addToPayload(Param.DIRECTPOSS3DURL,this.directPoss3DURL);
        addToPayload(Param.INTEGRATIONEXTRAFIELD03,this.integrationExtraField03);
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

        private String integrationExtraField02;

        private String isDefault;

        private String subMerchantCode;

        private YesNo adjustRates;

        private Authentication authentication;

        private String merchantKey;

        private String appSecret;

        private String merchantId;

        private String secureKey;

        private String directPossURL;

        private String directPoss3DURL;

        private String integrationExtraField03;

        public PaymentSystemAddRequestBuilder withDirectPossURL(String directPossURL) {
            this.directPossURL = directPossURL;
            return this;
        }

        public PaymentSystemAddRequestBuilder withDirectPoss3DURL(String directPoss3DURL) {
            this.directPossURL = directPossURL;
            return this;
        }

        public PaymentSystemAddRequestBuilder withMerchantId(String merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        public PaymentSystemAddRequestBuilder withSecureKey(String secureKey) {
            this.secureKey = secureKey;
            return this;
        }

        public PaymentSystemAddRequestBuilder withAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public PaymentSystemAddRequestBuilder withMerchantKey(String merchantKey) {
            this.merchantKey = merchantKey;
            return this;
        }

        public PaymentSystemAddRequestBuilder withIntegrationExtraField02(String integrationExtraField02) {
            this.integrationExtraField02 = integrationExtraField02;
            return this;
        }
        public PaymentSystemAddRequestBuilder withIntegrationExtraField03(String integrationExtraField03) {
            this.integrationExtraField03 = integrationExtraField03;
            return this;
        }

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
            request.integrationExtraField02 = this.integrationExtraField02;
            request.merchantKey= this.merchantKey;
            request.appSecret = this.appSecret;
            request.merchantId=this.merchantId;
            request.secureKey=this.secureKey;
            request.directPossURL=this.directPossURL;
            request.directPoss3DURL=this.directPoss3DURL;
            request.integrationExtraField03=this.integrationExtraField03;

            return request;
        }
    }
}
