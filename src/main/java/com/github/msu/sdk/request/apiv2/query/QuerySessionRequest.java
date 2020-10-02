package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QuerySessionResponse.class
)
public class QuerySessionRequest extends ApiRequest {
    private QuerySessionRequest() {
    }

    public static QuerySessionRequestBuilder builder() {
        return new QuerySessionRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYSESSION;
    }

    public static final class QuerySessionRequestBuilder {
        private Authentication authentication;

        public QuerySessionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QuerySessionRequest build() {
            QuerySessionRequest request = new QuerySessionRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
