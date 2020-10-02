package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.response.QueryMerchantResponse;

@ResponseInfo(
        responseClass = QueryMerchantResponse.class
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
