package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryPaymentSystemRuleResponse.class
)
public class QueryPaymentSystemRuleRequest extends ApiRequest {
    private String ruleType;

    private String ruleCode;

    private QueryPaymentSystemRuleRequest() {
    }

    public static QueryPaymentSystemRuleRequestBuilder builder() {
        return new QueryPaymentSystemRuleRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RULETYPE, this.ruleType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RULECODE, this.ruleCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPAYMENTSYSTEMRULE;
    }

    public static final class QueryPaymentSystemRuleRequestBuilder {
        private String ruleType;

        private String ruleCode;

        private Authentication authentication;

        public QueryPaymentSystemRuleRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPaymentSystemRuleRequestBuilder withRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        public QueryPaymentSystemRuleRequestBuilder withRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }

        public QueryPaymentSystemRuleRequest build() {
            QueryPaymentSystemRuleRequest request = new QueryPaymentSystemRuleRequest();
            request.authentication = this.authentication;
            request.ruleType = this.ruleType;
            request.ruleCode = this.ruleCode;
            return request;
        }
    }
}
