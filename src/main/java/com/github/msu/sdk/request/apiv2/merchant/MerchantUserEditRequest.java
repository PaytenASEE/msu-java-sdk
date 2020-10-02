package com.github.msu.sdk.request.apiv2.merchant;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.MerchantUserEditResponse.class
)
public class MerchantUserEditRequest extends ApiRequest {
    private String merchantUserEmail;

    private String userName;

    private String role;

    private String isLocked;

    private String merchantUserPassword;

    private String confirmPassword;

    private MerchantUserEditRequest() {
    }

    public static MerchantUserEditRequestBuilder builder() {
        return new MerchantUserEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.USERNAME, this.userName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ROLE, this.role);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISLOCKED, this.isLocked);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTUSERPASSWORD, this.merchantUserPassword);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONFIRMPASSWORD, this.confirmPassword);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTUSEREDIT;
    }

    public static final class MerchantUserEditRequestBuilder {
        private String merchantUserEmail;

        private String userName;

        private String role;

        private String isLocked;

        private String merchantUserPassword;

        private String confirmPassword;

        private Authentication authentication;

        public MerchantUserEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantUserEditRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public MerchantUserEditRequestBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public MerchantUserEditRequestBuilder withRole(String role) {
            this.role = role;
            return this;
        }

        public MerchantUserEditRequestBuilder withIsLocked(String isLocked) {
            this.isLocked = isLocked;
            return this;
        }

        public MerchantUserEditRequestBuilder withMerchantUserPassword(String merchantUserPassword) {
            this.merchantUserPassword = merchantUserPassword;
            return this;
        }

        public MerchantUserEditRequestBuilder withConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
            return this;
        }

        public MerchantUserEditRequest build() {
            MerchantUserEditRequest request = new MerchantUserEditRequest();
            request.authentication = this.authentication;
            request.merchantUserEmail = this.merchantUserEmail;
            request.userName = this.userName;
            request.role = this.role;
            request.isLocked = this.isLocked;
            request.merchantUserPassword = this.merchantUserPassword;
            request.confirmPassword = this.confirmPassword;
            return request;
        }
    }
}
