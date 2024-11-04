package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryAgricultureTemplateResponse;

public class QueryAgricultureTemplateRequest extends ApiRequest<QueryAgricultureTemplateResponse> {
    private String nameOnCard;

    private String currency;

    private String customer;

    private String dealerTypeName;

    private String paymentSystem;

    private String customerEmail;
    private String extra;
    private String customerPhone;
    private String customerName;
    private String encryptedPan;
    private String cardpan;
    private String cardCvv;
    private String cardExpiry;
    private String cardToken;


    private QueryAgricultureTemplateRequest() {
    }

    public static QueryAgricultureTemplateRequestBuilder builder() {
        return new QueryAgricultureTemplateRequestBuilder();
    }

    @Override
    public Class<QueryAgricultureTemplateResponse> responseClass() {
        return QueryAgricultureTemplateResponse.class;
    }

    @Override
    public void applyRequestParams() {

        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.ENCRYPTEDPAN, this.encryptedPan);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDPAN, this.cardpan);
        addToPayload(Param.CARDCVV, this.cardCvv);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.EXTRA, this.extra);

    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYAGRICULTURETEMPLATE;
    }

    public static final class QueryAgricultureTemplateRequestBuilder {

        private String nameOnCard;

        private String currency;

        private String customer;

        private String dealerTypeName;

        private String paymentSystem;

        private String customerEmail;
        private String extra;
        private String cardCvv;
        private String customerPhone;
        private String customerName;
        private String encryptedPan;
        private String cardpan;
        private String cardExpiry;
        private String cardToken;
        private Authentication authentication;

        public QueryAgricultureTemplateRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withCardPan(String cardPan) {
            this.cardpan = cardPan;
            return this;
        }


        public QueryAgricultureTemplateRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withEncryptedPan(String encryptedPan) {
            this.encryptedPan = encryptedPan;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryAgricultureTemplateRequestBuilder withExtra(String extra) {
            this.extra = extra;
            return this;
        }

        public QueryAgricultureTemplateRequest build() {
            QueryAgricultureTemplateRequest request = new QueryAgricultureTemplateRequest();
            request.authentication = this.authentication;
            request.customer = this.customer;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            request.cardToken = this.cardToken;
            request.cardpan = this.cardpan;
            request.cardCvv = this.cardCvv;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.currency = this.currency;
            request.dealerTypeName = this.dealerTypeName;
            request.paymentSystem = this.paymentSystem;
            request.encryptedPan = this.encryptedPan;
            request.extra = this.extra;
            return request;
        }
    }
}
