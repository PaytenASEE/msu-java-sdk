package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.response.QuerySameCardResponse;
import com.github.msu.sdk.util.ResponseInfo;

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
