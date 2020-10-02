package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMerchantResponse.class
)
public class QueryMerchantRequest extends ApiRequest {
    private QueryMerchantRequest() {
    }

    public static QueryMerchantRequestBuilder builder() {
        return new QueryMerchantRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANT;
    }

    public static final class QueryMerchantRequestBuilder {
        private Authentication authentication;

        public QueryMerchantRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantRequest build() {
            QueryMerchantRequest request = new QueryMerchantRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
