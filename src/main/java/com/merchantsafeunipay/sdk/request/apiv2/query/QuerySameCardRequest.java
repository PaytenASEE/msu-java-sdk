package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.QuerySameCardResponse;

public class QuerySameCardRequest extends ApiRequest<QuerySameCardResponse> {
    private QuerySameCardRequest() {
    }

    public static QuerySameCardRequestBuilder builder() {
        return new QuerySameCardRequestBuilder();
    }

    @Override
    public Class<QuerySameCardResponse> responseClass() {
        return QuerySameCardResponse.class;
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYSAMECARD;
    }

    public static final class QuerySameCardRequestBuilder {
        private Authentication authentication;

        public QuerySameCardRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QuerySameCardRequest build() {
            QuerySameCardRequest request = new QuerySameCardRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
