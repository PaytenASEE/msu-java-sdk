package com.payten.sdk.msu.request.apiv2.ewallet;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.EWalletEditCardResponse;

@ResponseInfo(
        responseClass = EWalletEditCardResponse.class
)
public class EWalletEditCardRequest extends ApiRequest {
    private String cardToken;

    private String cardExpiry;

    private String nameOnCard;

    private String cardSaveName;

    private String cutoffDay;

    private boolean forGroup;

    private EWalletEditCardRequest() {
    }

    public static EWalletEditCardRequestBuilder builder() {
        return new EWalletEditCardRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(Param.CUTOFFDAY, this.cutoffDay);
        addToPayload(Param.FORGROUP, this.forGroup);
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

        private String cutoffDay;

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

        public EWalletEditCardRequestBuilder withCutoffDay(String cutoffDay) {
            this.cutoffDay = cutoffDay;
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
            request.cutoffDay = this.cutoffDay;
            request.forGroup = this.forGroup;
            return request;
        }
    }
}
