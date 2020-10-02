package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryPasswordTokenResponse.class
)
public class QueryPasswordTokenRequest extends ApiRequest {
    private String recoveryToken;

    private QueryPasswordTokenRequest() {
    }

    public static QueryPasswordTokenRequestBuilder builder() {
        return new QueryPasswordTokenRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECOVERYTOKEN, this.recoveryToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPASSWORDTOKEN;
    }

    public static final class QueryPasswordTokenRequestBuilder {
        private String recoveryToken;

        private Authentication authentication;

        public QueryPasswordTokenRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPasswordTokenRequestBuilder withRecoveryToken(String recoveryToken) {
            this.recoveryToken = recoveryToken;
            return this;
        }

        public QueryPasswordTokenRequest build() {
            QueryPasswordTokenRequest request = new QueryPasswordTokenRequest();
            request.authentication = this.authentication;
            request.recoveryToken = this.recoveryToken;
            return request;
        }
    }
}
