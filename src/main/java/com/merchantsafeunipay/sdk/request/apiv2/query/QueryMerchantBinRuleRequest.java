package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryMerchantBinRuleResponse;

public class QueryMerchantBinRuleRequest extends ApiRequest<QueryMerchantBinRuleResponse> {
    private String ruleName;

    private QueryMerchantBinRuleRequest() {
    }

    public static QueryMerchantBinRuleRequestBuilder builder() {
        return new QueryMerchantBinRuleRequestBuilder();
    }

    @Override
    public Class<QueryMerchantBinRuleResponse> responseClass() {
        return QueryMerchantBinRuleResponse.class;
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
