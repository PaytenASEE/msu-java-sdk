package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryMerchantUserResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryMerchantUserResponse.class)
public class QueryMerchantUserRequest extends ApiRequest {

    private String merchantUserEmail;
    private String role;

    @Override
    public Action action() {
        return Action.QUERYMERCHANTUSER;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(Param.ROLE, this.role);
    }

    public static QueryMerchantUserRequestBuilder builder() {
        return new QueryMerchantUserRequestBuilder();
    }

    public static final class QueryMerchantUserRequestBuilder {
        private String merchantUserEmail;
        private String role;

        private QueryMerchantUserRequestBuilder() {
        }

        public QueryMerchantUserRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public QueryMerchantUserRequestBuilder withRole(String role) {
            this.role = role;
            return this;
        }

        public QueryMerchantUserRequest build() {
            QueryMerchantUserRequest queryMerchantUserRequest = new QueryMerchantUserRequest();
            queryMerchantUserRequest.role = this.role;
            queryMerchantUserRequest.merchantUserEmail = this.merchantUserEmail;
            return queryMerchantUserRequest;
        }
    }
}
