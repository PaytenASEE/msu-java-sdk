package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryMerchantUserResponse;

@ResponseInfo(
        responseClass = QueryMerchantUserResponse.class
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
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(Param.ROLE, this.role);
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
