package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.QueryMerchantResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

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
