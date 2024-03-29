package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryCardResponse;

public class QueryCardRequest extends ApiRequest<QueryCardResponse> {
    private String cardToken;

    private String cardSaveName;

    private String customer;

    private boolean forGroup;

    private String offset;

    private String limit;

    private String dealerCode;

    private String startDate;

    private String endDate;

    private String encryptedPan;

    private QueryCardRequest() {
    }

    public static QueryCardRequestBuilder builder() {
        return new QueryCardRequestBuilder();
    }

    @Override
    public Class<QueryCardResponse> responseClass() {
        return QueryCardResponse.class;
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
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
        addToPayload(Param.ENCRYPTEDPAN, this.encryptedPan);
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

        private String startDate;

        private String endDate;

        private String encryptedPan;

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

        public QueryCardRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryCardRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
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

        public QueryCardRequestBuilder withEncryptedPan(String encryptedPan) {
            this.encryptedPan = encryptedPan;
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
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.encryptedPan = this.encryptedPan;
            return request;
        }
    }
}
