package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;
import java.util.Map;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryCampaignOnlineResponse.class
)
public class QueryCampaignOnlineRequest extends ApiRequest {
    private String installments;

    private String merchantPaymentId;

    private BigDecimal amount;

    private String customer;

    private Currency currency;

    private String cardToken;

    private String cardPan;

    private String cardExpiry;

    private String nameOnCard;

    private String customerIp;

    private String customerUserAgent;

    private String cardCvv;

    private Map<String, String> extra;

    private boolean forGroup;

    private String dealerTypeName;

    private QueryCampaignOnlineRequest() {
    }

    public static QueryCampaignOnlineRequestBuilder builder() {
        return new QueryCampaignOnlineRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDPAN, this.cardPan);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAMEONCARD, this.nameOnCard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERIP, this.customerIp);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERUSERAGENT, this.customerUserAgent);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDCVV, this.cardCvv);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.EXTRA, this.extra);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.FORGROUP, this.forGroup);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCAMPAIGNONLINE;
    }

    public static final class QueryCampaignOnlineRequestBuilder {
        private String installments;

        private String merchantPaymentId;

        private BigDecimal amount;

        private String customer;

        private Currency currency;

        private String cardToken;

        private String cardPan;

        private String cardExpiry;

        private String nameOnCard;

        private String customerIp;

        private String customerUserAgent;

        private String cardCvv;

        private Map<String, String> extra;

        private boolean forGroup;

        private String dealerTypeName;

        private Authentication authentication;

        public QueryCampaignOnlineRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withCustomerUserAgent(String customerUserAgent) {
            this.customerUserAgent = customerUserAgent;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public QueryCampaignOnlineRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryCampaignOnlineRequest build() {
            QueryCampaignOnlineRequest request = new QueryCampaignOnlineRequest();
            request.authentication = this.authentication;
            request.installments = this.installments;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amount = this.amount;
            request.customer = this.customer;
            request.currency = this.currency;
            request.cardToken = this.cardToken;
            request.cardPan = this.cardPan;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.customerIp = this.customerIp;
            request.customerUserAgent = this.customerUserAgent;
            request.cardCvv = this.cardCvv;
            request.extra = this.extra;
            request.forGroup = this.forGroup;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
