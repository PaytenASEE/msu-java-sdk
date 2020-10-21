package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.DealerTransactionRuleEditResponse;

public class DealerTransactionRuleEditRequest extends ApiRequest<DealerTransactionRuleEditResponse> {
    private String dealerCode;

    private String rule;

    private DealerTransactionRuleEditRequest() {
    }

    public static DealerTransactionRuleEditRequestBuilder builder() {
        return new DealerTransactionRuleEditRequestBuilder();
    }

    @Override
    public Class<DealerTransactionRuleEditResponse> responseClass() {
        return DealerTransactionRuleEditResponse.class;
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
