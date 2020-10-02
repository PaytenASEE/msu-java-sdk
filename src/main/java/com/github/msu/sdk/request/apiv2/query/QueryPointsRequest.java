package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryPointsResponse.class
)
public class QueryPointsRequest extends ApiRequest {
    private String merchantPaymentId;

    private BigDecimal amount;

    private String customer;

    private Currency currency;

    private String cardToken;

    private String cardPan;

    private String cardExpiry;

    private String nameOnCard;

    private String cardCvv;

    private String installments;

    private String paymentSystem;

    private boolean forGroup;

    private String dealerTypeName;

    private QueryPointsRequest() {
    }

    public static QueryPointsRequestBuilder builder() {
        return new QueryPointsRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDPAN, this.cardPan);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAMEONCARD, this.nameOnCard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDCVV, this.cardCvv);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.FORGROUP, this.forGroup);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPOINTS;
    }

    public static final class QueryPointsRequestBuilder {
        private String merchantPaymentId;

        private BigDecimal amount;

        private String customer;

        private Currency currency;

        private String cardToken;

        private String cardPan;

        private String cardExpiry;

        private String nameOnCard;

        private String cardCvv;

        private String installments;

        private String paymentSystem;

        private boolean forGroup;

        private String dealerTypeName;

        private Authentication authentication;

        public QueryPointsRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPointsRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public QueryPointsRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public QueryPointsRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryPointsRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public QueryPointsRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryPointsRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public QueryPointsRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public QueryPointsRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public QueryPointsRequestBuilder withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return this;
        }

        public QueryPointsRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public QueryPointsRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryPointsRequestBuilder withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public QueryPointsRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryPointsRequest build() {
            QueryPointsRequest request = new QueryPointsRequest();
            request.authentication = this.authentication;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amount = this.amount;
            request.customer = this.customer;
            request.currency = this.currency;
            request.cardToken = this.cardToken;
            request.cardPan = this.cardPan;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.cardCvv = this.cardCvv;
            request.installments = this.installments;
            request.paymentSystem = this.paymentSystem;
            request.forGroup = this.forGroup;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
