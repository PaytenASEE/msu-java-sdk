package com.github.msu.sdk.request.apiv2.user;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.RecoverPasswordResponse.class
)
public class RecoverPasswordRequest extends ApiRequest {
    private String userEmail;

    private RecoverPasswordRequest() {
    }

    public static RecoverPasswordRequestBuilder builder() {
        return new RecoverPasswordRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.USEREMAIL, this.userEmail);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECOVERPASSWORD;
    }

    public static final class RecoverPasswordRequestBuilder {
        private String userEmail;

        private Authentication authentication;

        public RecoverPasswordRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RecoverPasswordRequestBuilder withUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }

        public RecoverPasswordRequest build() {
            RecoverPasswordRequest request = new RecoverPasswordRequest();
            request.authentication = this.authentication;
            request.userEmail = this.userEmail;
            return request;
        }
    }
}
