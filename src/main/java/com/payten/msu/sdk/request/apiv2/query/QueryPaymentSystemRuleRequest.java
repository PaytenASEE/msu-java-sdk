package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryPaymentSystemRuleResponse;

@ResponseInfo(
        responseClass = QueryPaymentSystemRuleResponse.class
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
        addToPayload(Param.RULETYPE, this.ruleType);
        addToPayload(Param.RULECODE, this.ruleCode);
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
