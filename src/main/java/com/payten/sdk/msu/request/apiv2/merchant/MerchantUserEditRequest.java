package com.payten.sdk.msu.request.apiv2.merchant;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.MerchantUserEditResponse;

@ResponseInfo(
        responseClass = MerchantUserEditResponse.class
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
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(Param.USERNAME, this.userName);
        addToPayload(Param.ROLE, this.role);
        addToPayload(Param.ISLOCKED, this.isLocked);
        addToPayload(Param.MERCHANTUSERPASSWORD, this.merchantUserPassword);
        addToPayload(Param.CONFIRMPASSWORD, this.confirmPassword);
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
