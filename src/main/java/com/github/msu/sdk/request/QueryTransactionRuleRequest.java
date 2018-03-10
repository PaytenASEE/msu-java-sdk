package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryTransactionRuleResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass =  QueryTransactionRuleResponse.class)
public class QueryTransactionRuleRequest extends ApiRequest{
    String dealerCode;

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
    }

    @Override
    public Action action() {
        return Action.QUERYTRANSACTIONRULE;
    }

    public static QueryTransactionRuleRequestBuilder builder() {
        return new QueryTransactionRuleRequestBuilder();
    }

    public static final class QueryTransactionRuleRequestBuilder {
        String dealerCode;

        private QueryTransactionRuleRequestBuilder() {
        }

        public QueryTransactionRuleRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryTransactionRuleRequest build() {
            QueryTransactionRuleRequest queryTransactionRuleRequest = new QueryTransactionRuleRequest();
            queryTransactionRuleRequest.dealerCode = this.dealerCode;
            return queryTransactionRuleRequest;
        }
    }
}
