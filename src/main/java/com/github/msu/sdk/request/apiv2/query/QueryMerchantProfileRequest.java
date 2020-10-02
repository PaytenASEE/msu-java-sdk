package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMerchantProfileResponse.class
)
public class QueryMerchantProfileRequest extends ApiRequest {
    private QueryMerchantProfileRequest() {
    }

    public static QueryMerchantProfileRequestBuilder builder() {
        return new QueryMerchantProfileRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTPROFILE;
    }

    public static final class QueryMerchantProfileRequestBuilder {
        private Authentication authentication;

        public QueryMerchantProfileRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantProfileRequest build() {
            QueryMerchantProfileRequest request = new QueryMerchantProfileRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
