package com.payten.msu.sdk.request.apiv2.merchant;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.MerchantUserAddResponse;

@ResponseInfo(
        responseClass = MerchantUserAddResponse.class
)
public class MerchantUserAddRequest extends ApiRequest {
    private String userName;

    private String merchantUserEmail;

    private String role;

    private String timeZone;

    private String merchantUserPassword;

    private String confirmPassword;

    private MerchantUserAddRequest() {
    }

    public static MerchantUserAddRequestBuilder builder() {
        return new MerchantUserAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.USERNAME, this.userName);
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(Param.ROLE, this.role);
        addToPayload(Param.TIMEZONE, this.timeZone);
        addToPayload(Param.MERCHANTUSERPASSWORD, this.merchantUserPassword);
        addToPayload(Param.CONFIRMPASSWORD, this.confirmPassword);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTUSERADD;
    }

    public static final class MerchantUserAddRequestBuilder {
        private String userName;

        private String merchantUserEmail;

        private String role;

        private String timeZone;

        private String merchantUserPassword;

        private String confirmPassword;

        private Authentication authentication;

        public MerchantUserAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantUserAddRequestBuilder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public MerchantUserAddRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public MerchantUserAddRequestBuilder withRole(String role) {
            this.role = role;
            return this;
        }

        public MerchantUserAddRequestBuilder withTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public MerchantUserAddRequestBuilder withMerchantUserPassword(String merchantUserPassword) {
            this.merchantUserPassword = merchantUserPassword;
            return this;
        }

        public MerchantUserAddRequestBuilder withConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
            return this;
        }

        public MerchantUserAddRequest build() {
            MerchantUserAddRequest request = new MerchantUserAddRequest();
            request.authentication = this.authentication;
            request.userName = this.userName;
            request.merchantUserEmail = this.merchantUserEmail;
            request.role = this.role;
            request.timeZone = this.timeZone;
            request.merchantUserPassword = this.merchantUserPassword;
            request.confirmPassword = this.confirmPassword;
            return request;
        }
    }
}
