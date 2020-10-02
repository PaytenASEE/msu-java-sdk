package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryCityResponse.class
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
