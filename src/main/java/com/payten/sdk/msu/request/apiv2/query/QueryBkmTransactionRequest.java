package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryBkmTransactionResponse;

@ResponseInfo(
        responseClass = QueryBkmTransactionResponse.class
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
        addToPayload(Param.BKMTOKEN, this.bkmToken);
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
