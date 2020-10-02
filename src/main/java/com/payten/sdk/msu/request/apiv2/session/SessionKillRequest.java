package com.payten.sdk.msu.request.apiv2.session;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.response.SessionKillResponse;

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
