package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.response.QueryMerchantHppSettingResponse;
import com.payten.sdk.msu.util.ResponseInfo;

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
