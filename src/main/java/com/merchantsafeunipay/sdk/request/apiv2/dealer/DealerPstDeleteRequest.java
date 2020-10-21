package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.PaymentSystemType;
import com.merchantsafeunipay.sdk.response.DealerPstDeleteResponse;

public class DealerPstDeleteRequest extends ApiRequest<DealerPstDeleteResponse> {
    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private String dealerCode;

    private DealerPstDeleteRequest() {
    }

    public static DealerPstDeleteRequestBuilder builder() {
        return new DealerPstDeleteRequestBuilder();
    }

    @Override
    public Class<DealerPstDeleteResponse> responseClass() {
        return DealerPstDeleteResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.DEALERCODE, this.dealerCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERPSTDELETE;
    }

    public static final class DealerPstDeleteRequestBuilder {
        private String paymentSystem;

        private PaymentSystemType paymentSystemType;

        private String dealerCode;

        private Authentication authentication;

        public DealerPstDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerPstDeleteRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public DealerPstDeleteRequestBuilder withPaymentSystemType(
                PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public DealerPstDeleteRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerPstDeleteRequest build() {
            DealerPstDeleteRequest request = new DealerPstDeleteRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.paymentSystemType = this.paymentSystemType;
            request.dealerCode = this.dealerCode;
            return request;
        }
    }
}
