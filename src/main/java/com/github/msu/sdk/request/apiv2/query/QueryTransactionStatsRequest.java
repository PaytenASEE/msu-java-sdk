package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.TransactionType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryTransactionStatsResponse.class
)
public class QueryTransactionStatsRequest extends ApiRequest {
    private String startDate;

    private String endDate;

    private Currency currency;

    private TransactionType transactionType;

    private String dealerCode;

    private boolean includedEAlers;

    private QueryTransactionStatsRequest() {
    }

    public static QueryTransactionStatsRequestBuilder builder() {
        return new QueryTransactionStatsRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STARTDATE, this.startDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENDDATE, this.endDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TRANSACTIONTYPE, this.transactionType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INCLUDEDEALERS, this.includedEAlers);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYTRANSACTIONSTATS;
    }

    public static final class QueryTransactionStatsRequestBuilder {
        private String startDate;

        private String endDate;

        private Currency currency;

        private TransactionType transactionType;

        private String dealerCode;

        private boolean includedEAlers;

        private Authentication authentication;

        public QueryTransactionStatsRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryTransactionStatsRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryTransactionStatsRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryTransactionStatsRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public QueryTransactionStatsRequestBuilder withTransactionType(
                TransactionType transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public QueryTransactionStatsRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryTransactionStatsRequestBuilder withIncludedEAlers(boolean includedEAlers) {
            this.includedEAlers = includedEAlers;
            return this;
        }

        public QueryTransactionStatsRequest build() {
            QueryTransactionStatsRequest request = new QueryTransactionStatsRequest();
            request.authentication = this.authentication;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.currency = this.currency;
            request.transactionType = this.transactionType;
            request.dealerCode = this.dealerCode;
            request.includedEAlers = this.includedEAlers;
            return request;
        }
    }
}
