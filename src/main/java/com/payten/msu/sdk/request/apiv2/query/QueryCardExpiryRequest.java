package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryCardExpiryResponse;

@ResponseInfo(
        responseClass = QueryCardExpiryResponse.class
)
public class QueryCardExpiryRequest extends ApiRequest {
    private String customer;

    private String offset;

    private String limit;

    private QueryCardExpiryRequest() {
    }

    public static QueryCardExpiryRequestBuilder builder() {
        return new QueryCardExpiryRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.OFFSET, this.offset);
        addToPayload(Param.LIMIT, this.limit);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCARDEXPIRY;
    }

    public static final class QueryCardExpiryRequestBuilder {
        private String customer;

        private String offset;

        private String limit;

        private Authentication authentication;

        public QueryCardExpiryRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryCardExpiryRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryCardExpiryRequestBuilder withOffset(String offset) {
            this.offset = offset;
            return this;
        }

        public QueryCardExpiryRequestBuilder withLimit(String limit) {
            this.limit = limit;
            return this;
        }

        public QueryCardExpiryRequest build() {
            QueryCardExpiryRequest request = new QueryCardExpiryRequest();
            request.authentication = this.authentication;
            request.customer = this.customer;
            request.offset = this.offset;
            request.limit = this.limit;
            return request;
        }
    }
}
