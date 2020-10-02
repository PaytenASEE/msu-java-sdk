package com.github.msu.sdk.request.apiv2.ewallet;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.EWalletAddCardResponse.class
)
public class EWalletAddCardRequest extends ApiRequest {
    private String customer;

    private String cardPan;

    private String cardExpiry;

    private String nameOnCard;

    private String auth3dToken;

    private String encryptedData;

    private String cardSaveName;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private String dealerCode;

    private String cutoffday;

    private EWalletAddCardRequest() {
    }

    public static EWalletAddCardRequestBuilder builder() {
        return new EWalletAddCardRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDPAN, this.cardPan);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAMEONCARD, this.nameOnCard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AUTH3DTOKEN, this.auth3dToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENCRYPTEDDATA, this.encryptedData);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERNAME, this.customerName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUTOFFDAY, this.cutoffday);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.EWALLETADDCARD;
    }

    public static final class EWalletAddCardRequestBuilder {
        private String customer;

        private String cardPan;

        private String cardExpiry;

        private String nameOnCard;

        private String auth3dToken;

        private String encryptedData;

        private String cardSaveName;

        private String customerName;

        private String customerEmail;

        private String customerPhone;

        private String dealerCode;

        private String cutoffday;

        private Authentication authentication;

        public EWalletAddCardRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public EWalletAddCardRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public EWalletAddCardRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public EWalletAddCardRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public EWalletAddCardRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public EWalletAddCardRequestBuilder withAuth3dToken(String auth3dToken) {
            this.auth3dToken = auth3dToken;
            return this;
        }

        public EWalletAddCardRequestBuilder withEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
            return this;
        }

        public EWalletAddCardRequestBuilder withCardSaveName(String cardSaveName) {
            this.cardSaveName = cardSaveName;
            return this;
        }

        public EWalletAddCardRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public EWalletAddCardRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public EWalletAddCardRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public EWalletAddCardRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public EWalletAddCardRequestBuilder withCutoffday(String cutoffday) {
            this.cutoffday = cutoffday;
            return this;
        }

        public EWalletAddCardRequest build() {
            EWalletAddCardRequest request = new EWalletAddCardRequest();
            request.authentication = this.authentication;
            request.customer = this.customer;
            request.cardPan = this.cardPan;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.auth3dToken = this.auth3dToken;
            request.encryptedData = this.encryptedData;
            request.cardSaveName = this.cardSaveName;
            request.customerName = this.customerName;
            request.customerEmail = this.customerEmail;
            request.customerPhone = this.customerPhone;
            request.dealerCode = this.dealerCode;
            request.cutoffday = this.cutoffday;
            return request;
        }
    }
}
