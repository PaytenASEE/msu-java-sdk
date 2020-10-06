package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.response.QuerySessionResponse;

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
