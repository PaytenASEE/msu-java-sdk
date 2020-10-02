package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryBkmTransactionResponse.class
)
public class QueryBkmTransactionRequest extends ApiRequest {
    private String bkmToken;

    private QueryBkmTransactionRequest() {
    }

    public static QueryBkmTransactionRequestBuilder builder() {
        return new QueryBkmTransactionRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BKMTOKEN, this.bkmToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYBKMTRANSACTION;
    }

    public static final class QueryBkmTransactionRequestBuilder {
        private String bkmToken;

        private Authentication authentication;

        public QueryBkmTransactionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryBkmTransactionRequestBuilder withBkmToken(String bkmToken) {
            this.bkmToken = bkmToken;
            return this;
        }

        public QueryBkmTransactionRequest build() {
            QueryBkmTransactionRequest request = new QueryBkmTransactionRequest();
            request.authentication = this.authentication;
            request.bkmToken = this.bkmToken;
            return request;
        }
    }
}
