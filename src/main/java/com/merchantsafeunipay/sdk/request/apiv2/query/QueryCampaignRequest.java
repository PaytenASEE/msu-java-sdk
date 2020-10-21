package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryCampaignResponse;

public class QueryCampaignRequest extends ApiRequest<QueryCampaignResponse> {
    private String bin;

    private String cardToken;

    private String dealerTypeName;

    private QueryCampaignRequest() {
    }

    public static QueryCampaignRequestBuilder builder() {
        return new QueryCampaignRequestBuilder();
    }

    @Override
    public Class<QueryCampaignResponse> responseClass() {
        return QueryCampaignResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.BIN, this.bin);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCAMPAIGN;
    }

    public static final class QueryCampaignRequestBuilder {
        private String bin;

        private String cardToken;

        private String dealerTypeName;

        private Authentication authentication;

        public QueryCampaignRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryCampaignRequestBuilder withBin(String bin) {
            this.bin = bin;
            return this;
        }

        public QueryCampaignRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryCampaignRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryCampaignRequest build() {
            QueryCampaignRequest request = new QueryCampaignRequest();
            request.authentication = this.authentication;
            request.bin = this.bin;
            request.cardToken = this.cardToken;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
