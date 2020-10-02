package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryCustomerResponse.class
)
public class QuerySameCardCustomersRequest extends ApiRequest {
    private String panIin;

    private String panLast4;

    private String cardHash;

    private QuerySameCardCustomersRequest() {
    }

    public static QuerySameCardCustomersRequestBuilder builder() {
        return new QuerySameCardCustomersRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PANIIN, this.panIin);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PANLAST4, this.panLast4);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDHASH, this.cardHash);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYSAMECARDCUSTOMERS;
    }

    public static final class QuerySameCardCustomersRequestBuilder {
        private String panIin;

        private String panLast4;

        private String cardHash;

        private Authentication authentication;

        public QuerySameCardCustomersRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QuerySameCardCustomersRequestBuilder withPanIin(String panIin) {
            this.panIin = panIin;
            return this;
        }

        public QuerySameCardCustomersRequestBuilder withPanLast4(String panLast4) {
            this.panLast4 = panLast4;
            return this;
        }

        public QuerySameCardCustomersRequestBuilder withCardHash(String cardHash) {
            this.cardHash = cardHash;
            return this;
        }

        public QuerySameCardCustomersRequest build() {
            QuerySameCardCustomersRequest request = new QuerySameCardCustomersRequest();
            request.authentication = this.authentication;
            request.panIin = this.panIin;
            request.panLast4 = this.panLast4;
            request.cardHash = this.cardHash;
            return request;
        }
    }
}
