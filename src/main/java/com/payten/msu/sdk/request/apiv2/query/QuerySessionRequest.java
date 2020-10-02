package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.response.QuerySessionResponse;

@ResponseInfo(
        responseClass = QuerySessionResponse.class
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
