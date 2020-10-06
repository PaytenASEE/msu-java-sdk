package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.PaymentSystemType;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.DealerPstEditResponse;

@ResponseInfo(
        responseClass = DealerPstEditResponse.class
)
public class DealerPstEditRequest extends ApiRequest {
    private String subMerchantCode;

    private String bankmerchantid;

    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private String dealerCode;

    private String integrationExtraField00;

    private String integrationExtraField01;

    private DealerPstEditRequest() {
    }

    public static DealerPstEditRequestBuilder builder() {
        return new DealerPstEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SUBMERCHANTCODE, this.subMerchantCode);
        addToPayload(Param.BANKMERCHANTID, this.bankmerchantid);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INTEGRATIONEXTRAFIELD00, this.integrationExtraField00);
        addToPayload(Param.INTEGRATIONEXTRAFIELD01, this.integrationExtraField01);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERPSTEDIT;
    }

    public static final class DealerPstEditRequestBuilder {
        private String subMerchantCode;

        private String bankmerchantid;

        private String paymentSystem;

        private PaymentSystemType paymentSystemType;

        private String dealerCode;

        private String integrationExtraField00;

        private String integrationExtraField01;

        private Authentication authentication;

        public DealerPstEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerPstEditRequestBuilder withSubMerchantCode(String subMerchantCode) {
            this.subMerchantCode = subMerchantCode;
            return this;
        }

        public DealerPstEditRequestBuilder withBankmerchantid(String bankmerchantid) {
            this.bankmerchantid = bankmerchantid;
            return this;
        }

        public DealerPstEditRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public DealerPstEditRequestBuilder withPaymentSystemType(PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public DealerPstEditRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerPstEditRequestBuilder withIntegrationExtraField00(String integrationExtraField00) {
            this.integrationExtraField00 = integrationExtraField00;
            return this;
        }

        public DealerPstEditRequestBuilder withIntegrationExtraField01(String integrationExtraField01) {
            this.integrationExtraField01 = integrationExtraField01;
            return this;
        }

        public DealerPstEditRequest build() {
            DealerPstEditRequest request = new DealerPstEditRequest();
            request.authentication = this.authentication;
            request.subMerchantCode = this.subMerchantCode;
            request.bankmerchantid = this.bankmerchantid;
            request.paymentSystem = this.paymentSystem;
            request.paymentSystemType = this.paymentSystemType;
            request.dealerCode = this.dealerCode;
            request.integrationExtraField00 = this.integrationExtraField00;
            request.integrationExtraField01 = this.integrationExtraField01;
            return request;
        }
    }
}
