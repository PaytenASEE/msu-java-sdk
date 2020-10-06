package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryGroupsResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

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
