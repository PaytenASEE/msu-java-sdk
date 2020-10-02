package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryCampaignResponse.class
)
public class QueryCampaignRequest extends ApiRequest {
    private String bin;

    private String cardToken;

    private String dealerTypeName;

    private QueryCampaignRequest() {
    }

    public static QueryCampaignRequestBuilder builder() {
        return new QueryCampaignRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BIN, this.bin);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
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
