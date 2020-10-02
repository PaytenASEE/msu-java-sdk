package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryCampaignResponse;

@ResponseInfo(
        responseClass = QueryCampaignResponse.class
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
