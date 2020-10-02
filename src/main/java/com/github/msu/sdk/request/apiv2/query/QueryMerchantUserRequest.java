package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMerchantUserResponse.class
)
public class QueryMerchantUserRequest extends ApiRequest {
    private String merchantUserEmail;

    private String role;

    private QueryMerchantUserRequest() {
    }

    public static QueryMerchantUserRequestBuilder builder() {
        return new QueryMerchantUserRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ROLE, this.role);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTUSER;
    }

    public static final class QueryMerchantUserRequestBuilder {
        private String merchantUserEmail;

        private String role;

        private Authentication authentication;

        public QueryMerchantUserRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
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
            QueryMerchantUserRequest request = new QueryMerchantUserRequest();
            request.authentication = this.authentication;
            request.merchantUserEmail = this.merchantUserEmail;
            request.role = this.role;
            return request;
        }
    }
}
