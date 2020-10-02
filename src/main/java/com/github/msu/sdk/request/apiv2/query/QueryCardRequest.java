package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryCardResponse.class
)
public class QueryCardRequest extends ApiRequest {
    private String cardToken;

    private String cardSaveName;

    private String customer;

    private boolean forGroup;

    private String offset;

    private String limit;

    private String dealerCode;

    private QueryCardRequest() {
    }

    public static QueryCardRequestBuilder builder() {
        return new QueryCardRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.FORGROUP, this.forGroup);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.OFFSET, this.offset);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.LIMIT, this.limit);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCARD;
    }

    public static final class QueryCardRequestBuilder {
        private String cardToken;

        private String cardSaveName;

        private String customer;

        private boolean forGroup;

        private String offset;

        private String limit;

        private String dealerCode;

        private Authentication authentication;

        public QueryCardRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
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

        public QueryCardRequestBuilder withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public QueryCardRequestBuilder withOffset(String offset) {
            this.offset = offset;
            return this;
        }

        public QueryCardRequestBuilder withLimit(String limit) {
            this.limit = limit;
            return this;
        }

        public QueryCardRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryCardRequest build() {
            QueryCardRequest request = new QueryCardRequest();
            request.authentication = this.authentication;
            request.cardToken = this.cardToken;
            request.cardSaveName = this.cardSaveName;
            request.customer = this.customer;
            request.forGroup = this.forGroup;
            request.offset = this.offset;
            request.limit = this.limit;
            request.dealerCode = this.dealerCode;
            return request;
        }
    }
}
