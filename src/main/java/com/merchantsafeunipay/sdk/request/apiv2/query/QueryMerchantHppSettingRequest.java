package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.QueryMerchantHppSettingResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

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
