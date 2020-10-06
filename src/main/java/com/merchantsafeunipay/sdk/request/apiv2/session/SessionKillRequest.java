package com.merchantsafeunipay.sdk.request.apiv2.session;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.response.SessionKillResponse;

@ResponseInfo(
        responseClass = SessionKillResponse.class
)
public class SessionKillRequest extends ApiRequest {
    private SessionKillRequest() {
    }

    public static SessionKillRequestBuilder builder() {
        return new SessionKillRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SESSIONKILL;
    }

    public static final class SessionKillRequestBuilder {
        private Authentication authentication;

        public SessionKillRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SessionKillRequest build() {
            SessionKillRequest request = new SessionKillRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
