package com.merchantsafeunipay.sdk.request.apiv2.ewallet;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.EWalletEditCardResponse;

public class EWalletEditCardRequest extends ApiRequest<EWalletEditCardResponse> {
    private String cardToken;

    private String cardExpiry;

    private String nameOnCard;

    private String cardSaveName;

    private String cutoffDay;

    private boolean forGroup;

    private String extra;

    private String trxAction;

    private EWalletEditCardRequest() {
    }

    public static EWalletEditCardRequestBuilder builder() {
        return new EWalletEditCardRequestBuilder();
    }

    @Override
    public Class<EWalletEditCardResponse> responseClass() {
        return EWalletEditCardResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(Param.CUTOFFDAY, this.cutoffDay);
        addToPayload(Param.FORGROUP, this.forGroup);
        addToPayload(Param.TRXACTION, this.trxAction);
        addToPayload(Param.EXTRA,this.extra);
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

        private String trxAction;

        private String extra;

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

        public EWalletEditCardRequestBuilder withTrxAction(String trxAction) {
            this.trxAction = trxAction;
            return this;
        }

        public EWalletEditCardRequestBuilder withExtra(String extra) {
            this.extra = extra;
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
            request.trxAction = this.trxAction;
            request.extra = this.extra;
            return request;
        }
    }
}
