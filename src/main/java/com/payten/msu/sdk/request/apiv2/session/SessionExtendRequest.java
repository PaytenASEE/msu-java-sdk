package com.payten.msu.sdk.request.apiv2.session;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.SessionExtendResponse;

@ResponseInfo(
        responseClass = SessionExtendResponse.class
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
        addToPayload(Param.TOKEN, this.token);
        addToPayload(Param.SESSIONEXPIRY, this.sessionExpiry);
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
