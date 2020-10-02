package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryCustomerResponse;

@ResponseInfo(
        responseClass = QueryCustomerResponse.class
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
        addToPayload(Param.PANIIN, this.panIin);
        addToPayload(Param.PANLAST4, this.panLast4);
        addToPayload(Param.CARDHASH, this.cardHash);
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
