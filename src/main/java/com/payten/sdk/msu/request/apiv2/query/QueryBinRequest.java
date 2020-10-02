package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryBinResponse;

@ResponseInfo(
        responseClass = QueryBinResponse.class
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
        addToPayload(Param.BIN, this.bin);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
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
