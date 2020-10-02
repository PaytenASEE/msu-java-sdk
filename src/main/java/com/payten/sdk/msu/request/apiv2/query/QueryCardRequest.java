package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryCardResponse;

@ResponseInfo(
        responseClass = QueryCardResponse.class
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
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.FORGROUP, this.forGroup);
        addToPayload(Param.OFFSET, this.offset);
        addToPayload(Param.LIMIT, this.limit);
        addToPayload(Param.DEALERCODE, this.dealerCode);
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
