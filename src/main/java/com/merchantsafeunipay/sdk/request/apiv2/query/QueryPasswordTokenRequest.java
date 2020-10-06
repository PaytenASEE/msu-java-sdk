package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryPasswordTokenResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = QueryPasswordTokenResponse.class
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
        addToPayload(Param.RECOVERYTOKEN, this.recoveryToken);
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
