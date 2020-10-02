package com.payten.sdk.msu.request.apiv2.dealer;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.DealerTransactionRuleEditResponse;

@ResponseInfo(
        responseClass = DealerTransactionRuleEditResponse.class
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
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.RULE, this.rule);
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
