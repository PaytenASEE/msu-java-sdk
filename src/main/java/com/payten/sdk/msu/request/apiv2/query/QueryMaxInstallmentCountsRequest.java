package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.response.QueryMaxInstallmentCountsResponse;

@ResponseInfo(
        responseClass = QueryMaxInstallmentCountsResponse.class
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
