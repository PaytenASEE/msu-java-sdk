package com.github.msu.sdk.request.apiv2.merchant;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.MerchantBinRuleDeleteResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RULENAME, this.ruleName);
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
