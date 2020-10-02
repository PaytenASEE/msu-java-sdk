package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryMerchantBinRuleResponse;

@ResponseInfo(
        responseClass = QueryMerchantBinRuleResponse.class
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
        addToPayload(Param.RULENAME, this.ruleName);
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
