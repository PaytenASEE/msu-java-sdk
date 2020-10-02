package com.payten.sdk.msu.request.apiv2.merchant;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.MerchantBinRuleDeleteResponse;

@ResponseInfo(
        responseClass = MerchantBinRuleDeleteResponse.class
)
public class MerchantBinRuleDeleteRequest extends ApiRequest {
    private String ruleName;

    private MerchantBinRuleDeleteRequest() {
    }

    public static MerchantBinRuleDeleteRequestBuilder builder() {
        return new MerchantBinRuleDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RULENAME, this.ruleName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTBINRULEDELETE;
    }

    public static final class MerchantBinRuleDeleteRequestBuilder {
        private String ruleName;

        private Authentication authentication;

        public MerchantBinRuleDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantBinRuleDeleteRequestBuilder withRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public MerchantBinRuleDeleteRequest build() {
            MerchantBinRuleDeleteRequest request = new MerchantBinRuleDeleteRequest();
            request.authentication = this.authentication;
            request.ruleName = this.ruleName;
            return request;
        }
    }
}
