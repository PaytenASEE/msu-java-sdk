package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.QueryMaxInstallmentCountsResponse;

public class QueryMaxInstallmentCountsRequest extends ApiRequest<QueryMaxInstallmentCountsResponse> {
    private QueryMaxInstallmentCountsRequest() {
    }

    public static QueryMaxInstallmentCountsRequestBuilder builder() {
        return new QueryMaxInstallmentCountsRequestBuilder();
    }

    @Override
    public Class<QueryMaxInstallmentCountsResponse> responseClass() {
        return QueryMaxInstallmentCountsResponse.class;
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
