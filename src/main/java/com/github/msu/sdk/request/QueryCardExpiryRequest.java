package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryCardResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryCardResponse.class)
public class QueryCardExpiryRequest extends ApiRequest {
    private String customer;
    private Integer offset;
    private Integer limit;

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.OFFSET, this.offset);
        addToPayload(Param.LIMIT, this.limit);
    }

    public static QueryCardExpiryRequestBuilder builder() {
        return new QueryCardExpiryRequestBuilder();
    }

    @Override
    public Action action() {
        return Action.QUERYCARDEXPIRY;
    }

    public static final class QueryCardExpiryRequestBuilder {
        private String customer;
        private Integer offset;
        private Integer limit;

        private QueryCardExpiryRequestBuilder() {
        }

        public QueryCardExpiryRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryCardExpiryRequestBuilder withOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public QueryCardExpiryRequestBuilder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public QueryCardExpiryRequest build() {
            QueryCardExpiryRequest queryCardExpiryRequest = new QueryCardExpiryRequest();
            queryCardExpiryRequest.customer = this.customer;
            queryCardExpiryRequest.offset = this.offset;
            queryCardExpiryRequest.limit = this.limit;
            return queryCardExpiryRequest;
        }
    }
}
