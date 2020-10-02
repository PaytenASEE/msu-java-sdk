package com.payten.sdk.msu.request.apiv2.ewallet;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.EWalletIsCardSavableResponse;

@ResponseInfo(
        responseClass = EWalletIsCardSavableResponse.class
)
public class EWalletIsCardSavableRequest extends ApiRequest {
    private String customer;

    private String cardPan;

    private EWalletIsCardSavableRequest() {
    }

    public static EWalletIsCardSavableRequestBuilder builder() {
        return new EWalletIsCardSavableRequestBuilder();
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
