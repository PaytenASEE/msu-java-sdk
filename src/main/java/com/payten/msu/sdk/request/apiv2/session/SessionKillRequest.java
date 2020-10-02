package com.payten.msu.sdk.request.apiv2.session;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.response.SessionKillResponse;

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
