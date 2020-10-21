package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryMerchantUserResponse;

public class QueryMerchantUserRequest extends ApiRequest<QueryMerchantUserResponse> {
    private String merchantUserEmail;

    private String role;

    private QueryMerchantUserRequest() {
    }

    public static QueryMerchantUserRequestBuilder builder() {
        return new QueryMerchantUserRequestBuilder();
    }

    @Override
    public Class<QueryMerchantUserResponse> responseClass() {
        return QueryMerchantUserResponse.class;
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
