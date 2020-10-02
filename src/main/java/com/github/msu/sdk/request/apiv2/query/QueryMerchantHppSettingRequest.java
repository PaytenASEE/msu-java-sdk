package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.response.QueryMerchantHppSettingResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = QueryMerchantHppSettingResponse.class
)
public class QueryMerchantHppSettingRequest extends ApiRequest {
    private QueryMerchantHppSettingRequest() {
    }

    public static QueryMerchantHppsettingRequestBuilder builder() {
        return new QueryMerchantHppsettingRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTHPPSETTING;
    }

    public static final class QueryMerchantHppsettingRequestBuilder {
        private Authentication authentication;

        public QueryMerchantHppsettingRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantHppSettingRequest build() {
            QueryMerchantHppSettingRequest request = new QueryMerchantHppSettingRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
