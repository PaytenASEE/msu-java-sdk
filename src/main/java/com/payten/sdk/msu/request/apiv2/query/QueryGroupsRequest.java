package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryGroupsResponse;

@ResponseInfo(
        responseClass = QueryGroupsResponse.class
)
public class QueryGroupsRequest extends ApiRequest {
    private String merchantGroupName;

    private String merchantBusinessId;

    private QueryGroupsRequest() {
    }

    public static QueryGroupsRequestBuilder builder() {
        return new QueryGroupsRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTGROUPNAME, this.merchantGroupName);
        addToPayload(Param.MERCHANTBUSINESSID, this.merchantBusinessId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYGROUPS;
    }

    public static final class QueryGroupsRequestBuilder {
        private String merchantGroupName;

        private String merchantBusinessId;

        private Authentication authentication;

        public QueryGroupsRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryGroupsRequestBuilder withMerchantGroupName(String merchantGroupName) {
            this.merchantGroupName = merchantGroupName;
            return this;
        }

        public QueryGroupsRequestBuilder withMerchantBusinessId(String merchantBusinessId) {
            this.merchantBusinessId = merchantBusinessId;
            return this;
        }

        public QueryGroupsRequest build() {
            QueryGroupsRequest request = new QueryGroupsRequest();
            request.authentication = this.authentication;
            request.merchantGroupName = this.merchantGroupName;
            request.merchantBusinessId = this.merchantBusinessId;
            return request;
        }
    }
}
