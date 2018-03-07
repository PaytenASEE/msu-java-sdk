package com.github.msu.sdk.request;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryMerchantResponse;
import com.github.msu.sdk.util.ResponseInfo;

import java.util.Map;


@ResponseInfo(responseClass = QueryMerchantResponse.class)
public class QueryMerchantRequest extends ApiRequest {

    private QueryMerchantRequest(QueryMerchantRequestBuilder builder) {
        this.authentication = builder.authentication;
    }

    @Override
    public Map<String, String> getFormUrlEncodedData() {
        payload.put(Param.ACTION.name(), Action.QUERYMERCHANT.name());
        return payload;
    }

    public static class QueryMerchantRequestBuilder {
        private Authentication authentication;

        public QueryMerchantRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantRequest build() {
            return new QueryMerchantRequest(this);
        }
    }
}
