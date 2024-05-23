package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryMerchantFeatureResponse;

public class QueryMerchantFeatureRequest extends ApiRequest<QueryMerchantFeatureResponse> {
    private String feature;

    private QueryMerchantFeatureRequest() {
    }

    public static QueryMerchantFeatureRequestBuilder builder() {
        return new QueryMerchantFeatureRequestBuilder();
    }

    @Override
    public Class<QueryMerchantFeatureResponse> responseClass() {
        return QueryMerchantFeatureResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.FEATURE, this.feature);
    }

    @Override
    public ApiAction apiAction() {
    return ApiAction.QUERYMERCHANTFEATURE;
    }

    public static final class QueryMerchantFeatureRequestBuilder {
        private Authentication authentication;

        private String feature;

        public QueryMerchantFeatureRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantFeatureRequestBuilder withFeature(String feature) {
            this.feature = feature;
            return this;
        }


        public QueryMerchantFeatureRequest build() {
            QueryMerchantFeatureRequest request = new QueryMerchantFeatureRequest();
            request.authentication = this.authentication;
            request.feature = this.feature;
            return request;
        }
    }
}
