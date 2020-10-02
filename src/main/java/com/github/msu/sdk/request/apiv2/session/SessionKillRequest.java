package com.github.msu.sdk.request.apiv2.session;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.SessionKillResponse.class
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
