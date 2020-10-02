package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryTransactionRuleResponse;

@ResponseInfo(
        responseClass = QueryTransactionRuleResponse.class
)
public class QueryTransactionRuleRequest extends ApiRequest {
    private String dealerCode;

    private String dealerTypeName;

    private QueryTransactionRuleRequest() {
    }

    public static QueryTransactionRuleRequestBuilder builder() {
        return new QueryTransactionRuleRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYTRANSACTIONRULE;
    }

    public static final class QueryTransactionRuleRequestBuilder {
        private String dealerCode;

        private String dealerTypeName;

        private Authentication authentication;

        public QueryTransactionRuleRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryTransactionRuleRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryTransactionRuleRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryTransactionRuleRequest build() {
            QueryTransactionRuleRequest request = new QueryTransactionRuleRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
