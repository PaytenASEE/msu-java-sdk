package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryOfflineCampaignDataResponse;

import java.math.BigDecimal;
import java.util.Map;

public class QueryOfflineCampaignDataRequest extends ApiRequest<QueryOfflineCampaignDataResponse> {
    private String installments;
    private String cardToken;
    private String dealerCode;
    private String paymentSystem;
    private String dealerTypeName;
    private Map<String, String> extra;

    private QueryOfflineCampaignDataRequest() {
    }

    public static QueryOfflineCampaignDataRequestBuilder builder() {
        return new QueryOfflineCampaignDataRequestBuilder();
    }

    @Override
    public Class<QueryOfflineCampaignDataResponse> responseClass() {
        return QueryOfflineCampaignDataResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYOFFLINECAMPAIGNDATA;
    }

    public static final class QueryOfflineCampaignDataRequestBuilder {
        private String installments;
        private String cardToken;
        private String dealerCode;
        private String paymentSystem;
        private String dealerTypeName;
        private Map<String, String> extra;

        private Authentication authentication;

        public QueryOfflineCampaignDataRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public QueryOfflineCampaignDataRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryOfflineCampaignDataRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public QueryOfflineCampaignDataRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }


        public QueryOfflineCampaignDataRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }


        public QueryOfflineCampaignDataRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryOfflineCampaignDataRequest build() {
            QueryOfflineCampaignDataRequest request = new QueryOfflineCampaignDataRequest();
            request.authentication = this.authentication;
            request.installments = this.installments;
            request.paymentSystem = this.paymentSystem;
            request.cardToken = this.cardToken;
            request.extra = this.extra;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
