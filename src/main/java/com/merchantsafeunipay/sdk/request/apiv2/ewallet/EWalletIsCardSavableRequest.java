package com.merchantsafeunipay.sdk.request.apiv2.ewallet;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.EWalletIsCardSavableResponse;

public class EWalletIsCardSavableRequest extends ApiRequest<EWalletIsCardSavableResponse> {
    private String customer;

    private String cardPan;

    private EWalletIsCardSavableRequest() {
    }

    public static EWalletIsCardSavableRequestBuilder builder() {
        return new EWalletIsCardSavableRequestBuilder();
    }

    @Override
    public Class<EWalletIsCardSavableResponse> responseClass() {
        return EWalletIsCardSavableResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CARDPAN, this.cardPan);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.EWALLETISCARDSAVABLE;
    }

    public static final class EWalletIsCardSavableRequestBuilder {
        private String customer;

        private String cardPan;

        private Authentication authentication;

        public EWalletIsCardSavableRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public EWalletIsCardSavableRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public EWalletIsCardSavableRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public EWalletIsCardSavableRequest build() {
            EWalletIsCardSavableRequest request = new EWalletIsCardSavableRequest();
            request.authentication = this.authentication;
            request.customer = this.customer;
            request.cardPan = this.cardPan;
            return request;
        }
    }
}
