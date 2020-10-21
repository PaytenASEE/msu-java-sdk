package com.merchantsafeunipay.sdk.request.apiv2.ewallet;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.EWalletAddCardResponse;

public class EWalletAddCardRequest extends ApiRequest<EWalletAddCardResponse> {
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

    private String cutoffDay;

    private EWalletAddCardRequest() {
    }

    public static EWalletAddCardRequestBuilder builder() {
        return new EWalletAddCardRequestBuilder();
    }

    @Override
    public Class<EWalletAddCardResponse> responseClass() {
        return EWalletAddCardResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CARDPAN, this.cardPan);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.AUTH3DTOKEN, this.auth3dToken);
        addToPayload(Param.ENCRYPTEDDATA, this.encryptedData);
        addToPayload(Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.CUTOFFDAY, this.cutoffDay);
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

        private String cutoffDay;

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

        public EWalletAddCardRequestBuilder withCutoffDay(String cutoffDay) {
            this.cutoffDay = cutoffDay;
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
            request.cutoffDay = this.cutoffDay;
            return request;
        }
    }
}
