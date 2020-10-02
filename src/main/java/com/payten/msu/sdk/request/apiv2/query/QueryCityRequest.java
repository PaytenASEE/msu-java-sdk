package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.response.QueryCityResponse;

@ResponseInfo(
        responseClass = QueryCityResponse.class
)
public class QueryCityRequest extends ApiRequest {
    private QueryCityRequest() {
    }

    public static QueryCityRequestBuilder builder() {
        return new QueryCityRequestBuilder();
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
