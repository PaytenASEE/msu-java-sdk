package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryCardResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryCardResponse.class)
public class QueryCardRequest extends ApiRequest {
    private String cardToken;
    private String cardSaveName;
    private String customer;
    private String forGroup;
    private Integer offset;
    private Integer limit;

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.FORGROUP, this.forGroup);
        addToPayload(Param.OFFSET, this.offset);
        addToPayload(Param.LIMIT, this.limit);
    }

    @Override
    public Action action() {
        return Action.QUERYCARD;
    }

    public static QueryCardRequestBuilder builder() {
        return new QueryCardRequestBuilder();
    }


    public static final class QueryCardRequestBuilder {
        private String cardToken;
        private String cardSaveName;
        private String customer;
        private String forGroup;
        private Integer offset;
        private Integer limit;

        private QueryCardRequestBuilder() {
        }

        public QueryCardRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryCardRequestBuilder withCardSaveName(String cardSaveName) {
            this.cardSaveName = cardSaveName;
            return this;
        }

        public QueryCardRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryCardRequestBuilder withForGroup(String forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public QueryCardRequestBuilder withOffset(Integer offset) {
            this.offset = offset;
            return this;
        }

        public QueryCardRequestBuilder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public QueryCardRequest build() {
            QueryCardRequest queryCardRequest = new QueryCardRequest();
            queryCardRequest.customer = this.customer;
            queryCardRequest.forGroup = this.forGroup;
            queryCardRequest.limit = this.limit;
            queryCardRequest.cardSaveName = this.cardSaveName;
            queryCardRequest.cardToken = this.cardToken;
            queryCardRequest.offset = this.offset;
            return queryCardRequest;
        }
    }
}
