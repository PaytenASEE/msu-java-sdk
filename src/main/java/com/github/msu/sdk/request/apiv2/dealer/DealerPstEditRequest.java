package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.PaymentSystemType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerPstEditResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SUBMERCHANTCODE, this.subMerchantCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BANKMERCHANTID, this.bankmerchantid);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INTEGRATIONEXTRAFIELD00, this.integrationExtraField00);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INTEGRATIONEXTRAFIELD01, this.integrationExtraField01);
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
