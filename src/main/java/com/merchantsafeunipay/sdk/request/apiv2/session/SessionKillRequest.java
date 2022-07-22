package com.merchantsafeunipay.sdk.request.apiv2.session;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.SessionKillResponse;

public class SessionKillRequest extends ApiRequest<SessionKillResponse> {
    private String sessionToken;

    private SessionKillRequest() {
    }

    public static SessionKillRequestBuilder builder() {
        return new SessionKillRequestBuilder();
    }

    @Override
    public Class<SessionKillResponse> responseClass() {
        return SessionKillResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.TOKEN, this.sessionToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SESSIONKILL;
    }

    public static final class SessionKillRequestBuilder {
        private Authentication authentication;
        private String sessionToken;

        public SessionKillRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SessionKillRequestBuilder withSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        public SessionKillRequest build() {
            SessionKillRequest request = new SessionKillRequest();
            request.authentication = this.authentication;
            request.sessionToken = this.sessionToken;
            return request;
        }
    }
}
