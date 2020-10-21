package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.QueryCityResponse;

public class QueryCityRequest extends ApiRequest<QueryCityResponse> {
    private QueryCityRequest() {
    }

    public static QueryCityRequestBuilder builder() {
        return new QueryCityRequestBuilder();
    }

    @Override
    public Class<QueryCityResponse> responseClass() {
        return QueryCityResponse.class;
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCITY;
    }

    public static final class QueryCityRequestBuilder {
        private Authentication authentication;

        public QueryCityRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryCityRequest build() {
            QueryCityRequest request = new QueryCityRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
