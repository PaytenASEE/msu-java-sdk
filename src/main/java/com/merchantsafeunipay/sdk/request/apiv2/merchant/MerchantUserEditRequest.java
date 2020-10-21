package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.MerchantUserEditResponse;

public class MerchantUserEditRequest extends ApiRequest<MerchantUserEditResponse> {
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
    public Class<MerchantUserEditResponse> responseClass() {
        return MerchantUserEditResponse.class;
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
