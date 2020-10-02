package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.response.QueryMerchantProfileResponse;

@ResponseInfo(
        responseClass = QueryMerchantProfileResponse.class
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
