package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMaxInstallmentCountsResponse.class
)
public class QueryMaxInstallmentCountsRequest extends ApiRequest {
    private QueryMaxInstallmentCountsRequest() {
    }

    public static QueryMaxInstallmentCountsRequestBuilder builder() {
        return new QueryMaxInstallmentCountsRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMAXINSTALLMENTCOUNTS;
    }

    public static final class QueryMaxInstallmentCountsRequestBuilder {
        private Authentication authentication;

        public QueryMaxInstallmentCountsRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMaxInstallmentCountsRequest build() {
            QueryMaxInstallmentCountsRequest request = new QueryMaxInstallmentCountsRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
