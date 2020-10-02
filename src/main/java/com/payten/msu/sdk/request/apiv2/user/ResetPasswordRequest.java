package com.payten.msu.sdk.request.apiv2.user;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.ResetPasswordResponse;

@ResponseInfo(
        responseClass = ResetPasswordResponse.class
)
public class ResetPasswordRequest extends ApiRequest {
    private String oldPassword;

    private String recoveryToken;

    private String userEmail;

    private String newPassword;

    private String newPasswordConfirm;

    private ResetPasswordRequest() {
    }

    public static ResetPasswordRequestBuilder builder() {
        return new ResetPasswordRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.OLDPASSWORD, this.oldPassword);
        addToPayload(Param.RECOVERYTOKEN, this.recoveryToken);
        addToPayload(Param.USEREMAIL, this.userEmail);
        addToPayload(Param.NEWPASSWORD, this.newPassword);
        addToPayload(Param.NEWPASSWORDCONFIRM, this.newPasswordConfirm);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RESETPASSWORD;
    }

    public static final class ResetPasswordRequestBuilder {
        private String oldPassword;

        private String recoveryToken;

        private String userEmail;

        private String newPassword;

        private String newPasswordConfirm;

        private Authentication authentication;

        public ResetPasswordRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public ResetPasswordRequestBuilder withOldPassword(String oldPassword) {
            this.oldPassword = oldPassword;
            return this;
        }

        public ResetPasswordRequestBuilder withRecoveryToken(String recoveryToken) {
            this.recoveryToken = recoveryToken;
            return this;
        }

        public ResetPasswordRequestBuilder withUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public ResetPasswordRequestBuilder withNewPassword(String newPassword) {
            this.newPassword = newPassword;
            return this;
        }

        public ResetPasswordRequestBuilder withNewPasswordConfirm(String newPasswordConfirm) {
            this.newPasswordConfirm = newPasswordConfirm;
            return this;
        }

        public ResetPasswordRequest build() {
            ResetPasswordRequest request = new ResetPasswordRequest();
            request.authentication = this.authentication;
            request.oldPassword = this.oldPassword;
            request.recoveryToken = this.recoveryToken;
            request.userEmail = this.userEmail;
            request.newPassword = this.newPassword;
            request.newPasswordConfirm = this.newPasswordConfirm;
            return request;
        }
    }
}
