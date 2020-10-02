package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryBinResponse.class
)
public class QueryBinRequest extends ApiRequest {
    private String bin;

    private String cardToken;

    private String dealerTypeName;

    private QueryBinRequest() {
    }

    public static QueryBinRequestBuilder builder() {
        return new QueryBinRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BIN, this.bin);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYBIN;
    }

    public static final class QueryBinRequestBuilder {
        private String bin;

        private String cardToken;

        private String dealerTypeName;

        private Authentication authentication;

        public QueryBinRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryBinRequestBuilder withBin(String bin) {
            this.bin = bin;
            return this;
        }

        public QueryBinRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryBinRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryBinRequest build() {
            QueryBinRequest request = new QueryBinRequest();
            request.authentication = this.authentication;
            request.bin = this.bin;
            request.cardToken = this.cardToken;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
