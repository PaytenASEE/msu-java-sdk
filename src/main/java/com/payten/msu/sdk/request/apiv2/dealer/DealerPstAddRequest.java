package com.payten.msu.sdk.request.apiv2.dealer;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.PaymentSystemType;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.DealerPstAddResponse;

@ResponseInfo(
        responseClass = DealerPstAddResponse.class
)
public class DealerPstAddRequest extends ApiRequest {
    private String subMerchantCode;

    private String bankMerchantId;

    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private String dealerCode;

    private String integrationExtraField00;

    private String integrationExtraField01;

    private DealerPstAddRequest() {
    }

    public static DealerPstAddRequestBuilder builder() {
        return new DealerPstAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SUBMERCHANTCODE, this.subMerchantCode);
        addToPayload(Param.BANKMERCHANTID, this.bankMerchantId);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INTEGRATIONEXTRAFIELD00, this.integrationExtraField00);
        addToPayload(Param.INTEGRATIONEXTRAFIELD01, this.integrationExtraField01);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERPSTADD;
    }

    public static final class DealerPstAddRequestBuilder {
        private String subMerchantCode;

        private String bankMerchantId;

        private String paymentSystem;

        private PaymentSystemType paymentSystemType;

        private String dealerCode;

        private String integrationExtraField00;

        private String integrationExtraField01;

        private Authentication authentication;

        public DealerPstAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerPstAddRequestBuilder withSubMerchantCode(String subMerchantCode) {
            this.subMerchantCode = subMerchantCode;
            return this;
        }

        public DealerPstAddRequestBuilder withBankMerchantId(String bankMerchantId) {
            this.bankMerchantId = bankMerchantId;
            return this;
        }

        public DealerPstAddRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public DealerPstAddRequestBuilder withPaymentSystemType(PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public DealerPstAddRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerPstAddRequestBuilder withIntegrationExtraField00(String integrationExtraField00) {
            this.integrationExtraField00 = integrationExtraField00;
            return this;
        }

        public DealerPstAddRequestBuilder withIntegrationExtraField01(String integrationExtraField01) {
            this.integrationExtraField01 = integrationExtraField01;
            return this;
        }

        public DealerPstAddRequest build() {
            DealerPstAddRequest request = new DealerPstAddRequest();
            request.authentication = this.authentication;
            request.subMerchantCode = this.subMerchantCode;
            request.bankMerchantId = this.bankMerchantId;
            request.paymentSystem = this.paymentSystem;
            request.paymentSystemType = this.paymentSystemType;
            request.dealerCode = this.dealerCode;
            request.integrationExtraField00 = this.integrationExtraField00;
            request.integrationExtraField01 = this.integrationExtraField01;
            return request;
        }
    }
}
