package com.merchantsafeunipay.sdk.request.apiv2.user;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.RecoverPasswordResponse;

public class RecoverPasswordRequest extends ApiRequest<RecoverPasswordResponse> {
    private String userEmail;

    private RecoverPasswordRequest() {
    }

    public static RecoverPasswordRequestBuilder builder() {
        return new RecoverPasswordRequestBuilder();
    }

    @Override
    public Class<RecoverPasswordResponse> responseClass() {
        return RecoverPasswordResponse.class;
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
