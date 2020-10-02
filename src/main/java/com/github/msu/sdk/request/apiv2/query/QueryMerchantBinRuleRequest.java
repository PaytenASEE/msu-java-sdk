package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMerchantBinRuleResponse.class
)
public class QueryMerchantBinRuleRequest extends ApiRequest {
    private String ruleName;

    private QueryMerchantBinRuleRequest() {
    }

    public static QueryMerchantBinRuleRequestBuilder builder() {
        return new QueryMerchantBinRuleRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RULENAME, this.ruleName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTBINRULE;
    }

    public static final class QueryMerchantBinRuleRequestBuilder {
        private String ruleName;

        private Authentication authentication;

        public QueryMerchantBinRuleRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantBinRuleRequestBuilder withRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public QueryMerchantBinRuleRequest build() {
            QueryMerchantBinRuleRequest request = new QueryMerchantBinRuleRequest();
            request.authentication = this.authentication;
            request.ruleName = this.ruleName;
            return request;
        }
    }
}
