package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryCampaignOnlineResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

import java.math.BigDecimal;
import java.util.Map;

@ResponseInfo(
        responseClass = QueryCampaignOnlineResponse.class
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
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDPAN, this.cardPan);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CUSTOMERIP, this.customerIp);
        addToPayload(Param.CUSTOMERUSERAGENT, this.customerUserAgent);
        addToPayload(Param.CARDCVV, this.cardCvv);
        addToPayload(Param.EXTRA, this.extra);
        addToPayload(Param.FORGROUP, this.forGroup);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
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
