package com.payten.msu.sdk.request.apiv2.user;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.RecoverPasswordResponse;

@ResponseInfo(
        responseClass = RecoverPasswordResponse.class
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
        addToPayload(Param.USEREMAIL, this.userEmail);
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
