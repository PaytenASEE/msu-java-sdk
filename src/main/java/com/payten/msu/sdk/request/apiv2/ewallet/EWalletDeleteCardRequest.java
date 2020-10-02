package com.payten.msu.sdk.request.apiv2.ewallet;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.EWalletDeleteCardResponse;

@ResponseInfo(
        responseClass = EWalletDeleteCardResponse.class
)
public class EWalletDeleteCardRequest extends ApiRequest {
    private String cardToken;

    private boolean forGroup;

    private EWalletDeleteCardRequest() {
    }

    public static EWalletDeleteCardRequestBuilder builder() {
        return new EWalletDeleteCardRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.FORGROUP, this.forGroup);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.EWALLETDELETECARD;
    }

    public static final class EWalletDeleteCardRequestBuilder {
        private String cardToken;

        private boolean forGroup;

        private Authentication authentication;

        public EWalletDeleteCardRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public EWalletDeleteCardRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public EWalletDeleteCardRequestBuilder withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public EWalletDeleteCardRequest build() {
            EWalletDeleteCardRequest request = new EWalletDeleteCardRequest();
            request.authentication = this.authentication;
            request.cardToken = this.cardToken;
            request.forGroup = this.forGroup;
            return request;
        }
    }
}
