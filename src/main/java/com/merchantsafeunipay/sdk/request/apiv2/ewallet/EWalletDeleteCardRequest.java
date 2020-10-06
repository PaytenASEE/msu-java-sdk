package com.merchantsafeunipay.sdk.request.apiv2.ewallet;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.EWalletDeleteCardResponse;

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
