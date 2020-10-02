package com.payten.sdk.msu.request.apiv2.dealer;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.DealerTransactionRuleAddResponse;

@ResponseInfo(
        responseClass = DealerTransactionRuleAddResponse.class
)
public class DealerTransactionRuleAddRequest extends ApiRequest {
    private String dealerCode;

    private String rule;

    private DealerTransactionRuleAddRequest() {
    }

    public static DealerTransactionRuleAddRequestBuilder builder() {
        return new DealerTransactionRuleAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.RULE, this.rule);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERTRANSACTIONRULEADD;
    }

    public static final class DealerTransactionRuleAddRequestBuilder {
        private String dealerCode;

        private String rule;

        private Authentication authentication;

        public DealerTransactionRuleAddRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerTransactionRuleAddRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerTransactionRuleAddRequestBuilder withRule(String rule) {
            this.rule = rule;
            return this;
        }

        public DealerTransactionRuleAddRequest build() {
            DealerTransactionRuleAddRequest request = new DealerTransactionRuleAddRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.rule = this.rule;
            return request;
        }
    }
}
