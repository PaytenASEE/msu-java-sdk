package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryPaymentSystemRuleResponse;

public class QueryPaymentSystemRuleRequest extends ApiRequest<QueryPaymentSystemRuleResponse> {
    private String ruleType;

    private String ruleCode;

    private QueryPaymentSystemRuleRequest() {
    }

    public static QueryPaymentSystemRuleRequestBuilder builder() {
        return new QueryPaymentSystemRuleRequestBuilder();
    }

    @Override
    public Class<QueryPaymentSystemRuleResponse> responseClass() {
        return QueryPaymentSystemRuleResponse.class;
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
