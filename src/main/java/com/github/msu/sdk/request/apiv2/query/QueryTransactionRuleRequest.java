package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryTransactionRuleResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
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
