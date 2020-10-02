package com.github.msu.sdk.request.apiv2.ewallet;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.EWalletEditCardResponse.class
)
public class EWalletEditCardRequest extends ApiRequest {
    private String cardToken;

    private String cardExpiry;

    private String nameOnCard;

    private String cardSaveName;

    private String cutoffday;

    private boolean forGroup;

    private EWalletEditCardRequest() {
    }

    public static EWalletEditCardRequestBuilder builder() {
        return new EWalletEditCardRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAMEONCARD, this.nameOnCard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUTOFFDAY, this.cutoffday);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.FORGROUP, this.forGroup);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.EWALLETEDITCARD;
    }

    public static final class EWalletEditCardRequestBuilder {
        private String cardToken;

        private String cardExpiry;

        private String nameOnCard;

        private String cardSaveName;

        private String cutoffday;

        private boolean forGroup;

        private Authentication authentication;

        public EWalletEditCardRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public EWalletEditCardRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public EWalletEditCardRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public EWalletEditCardRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public EWalletEditCardRequestBuilder withCardSaveName(String cardSaveName) {
            this.cardSaveName = cardSaveName;
            return this;
        }

        public EWalletEditCardRequestBuilder withCutoffday(String cutoffday) {
            this.cutoffday = cutoffday;
            return this;
        }

        public EWalletEditCardRequestBuilder withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public EWalletEditCardRequest build() {
            EWalletEditCardRequest request = new EWalletEditCardRequest();
            request.authentication = this.authentication;
            request.cardToken = this.cardToken;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.cardSaveName = this.cardSaveName;
            request.cutoffday = this.cutoffday;
            request.forGroup = this.forGroup;
            return request;
        }
    }
}
