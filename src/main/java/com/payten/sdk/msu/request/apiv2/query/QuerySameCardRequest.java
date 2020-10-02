package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.response.QuerySameCardResponse;
import com.payten.sdk.msu.util.ResponseInfo;

@ResponseInfo(
        responseClass = QuerySameCardResponse.class
)
public class QuerySameCardRequest extends ApiRequest {
    private QuerySameCardRequest() {
    }

    public static QuerySameCardRequestBuilder builder() {
        return new QuerySameCardRequestBuilder();
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
