package com.github.msu.sdk.request.apiv2.session;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.SessionExtendResponse.class
)
public class SessionExtendRequest extends ApiRequest {
    private String token;

    private String sessionExpiry;

    private SessionExtendRequest() {
    }

    public static SessionExtendRequestBuilder builder() {
        return new SessionExtendRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TOKEN, this.token);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SESSIONEXPIRY, this.sessionExpiry);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SESSIONEXTEND;
    }

    public static final class SessionExtendRequestBuilder {
        private String token;

        private String sessionExpiry;

        private Authentication authentication;

        public SessionExtendRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SessionExtendRequestBuilder withToken(String token) {
            this.token = token;
            return this;
        }

        public SessionExtendRequestBuilder withSessionExpiry(String sessionExpiry) {
            this.sessionExpiry = sessionExpiry;
            return this;
        }

        public SessionExtendRequest build() {
            SessionExtendRequest request = new SessionExtendRequest();
            request.authentication = this.authentication;
            request.token = this.token;
            request.sessionExpiry = this.sessionExpiry;
            return request;
        }
    }
}
