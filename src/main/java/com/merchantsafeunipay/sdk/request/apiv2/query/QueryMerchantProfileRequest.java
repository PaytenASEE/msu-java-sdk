package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.QueryMerchantProfileResponse;

public class QueryMerchantProfileRequest extends ApiRequest<QueryMerchantProfileResponse> {
    private QueryMerchantProfileRequest() {
    }

    public static QueryMerchantProfileRequestBuilder builder() {
        return new QueryMerchantProfileRequestBuilder();
    }

    @Override
    public Class<QueryMerchantProfileResponse> responseClass() {
        return QueryMerchantProfileResponse.class;
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
