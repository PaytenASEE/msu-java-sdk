package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerTransactionRuleEditResponse.class
)
public class DealerTransactionRuleEditRequest extends ApiRequest {
    private String dealerCode;

    private String rule;

    private DealerTransactionRuleEditRequest() {
    }

    public static DealerTransactionRuleEditRequestBuilder builder() {
        return new DealerTransactionRuleEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RULE, this.rule);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERTRANSACTIONRULEEDIT;
    }

    public static final class DealerTransactionRuleEditRequestBuilder {
        private String dealerCode;

        private String rule;

        private Authentication authentication;

        public DealerTransactionRuleEditRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerTransactionRuleEditRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerTransactionRuleEditRequestBuilder withRule(String rule) {
            this.rule = rule;
            return this;
        }

        public DealerTransactionRuleEditRequest build() {
            DealerTransactionRuleEditRequest request = new DealerTransactionRuleEditRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.rule = this.rule;
            return request;
        }
    }
}
