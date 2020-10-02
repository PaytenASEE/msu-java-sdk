package com.payten.sdk.msu.request.apiv2.user;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.AuthMerchantUserResponse;

@ResponseInfo(
        responseClass = AuthMerchantUserResponse.class
)
public class AuthMerchantUserRequest extends ApiRequest {
    private String merchantUserEmail;

    private String merchantUserPassword;

    private AuthMerchantUserRequest() {
    }

    public static AuthMerchantUserRequestBuilder builder() {
        return new AuthMerchantUserRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(Param.MERCHANTUSERPASSWORD, this.merchantUserPassword);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.AUTHMERCHANTUSER;
    }

    public static final class AuthMerchantUserRequestBuilder {
        private String merchantUserEmail;

        private String merchantUserPassword;

        private Authentication authentication;

        public AuthMerchantUserRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public AuthMerchantUserRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public AuthMerchantUserRequestBuilder withMerchantUserPassword(String merchantUserPassword) {
            this.merchantUserPassword = merchantUserPassword;
            return this;
        }

        public AuthMerchantUserRequest build() {
            AuthMerchantUserRequest request = new AuthMerchantUserRequest();
            request.authentication = this.authentication;
            request.merchantUserEmail = this.merchantUserEmail;
            request.merchantUserPassword = this.merchantUserPassword;
            return request;
        }
    }
}
