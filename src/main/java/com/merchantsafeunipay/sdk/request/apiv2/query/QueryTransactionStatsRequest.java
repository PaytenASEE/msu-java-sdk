package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.TransactionType;
import com.merchantsafeunipay.sdk.response.QueryTransactionStatsResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = QueryTransactionStatsResponse.class
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
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.TRANSACTIONTYPE, this.transactionType);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INCLUDEDEALERS, this.includedEAlers);
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
