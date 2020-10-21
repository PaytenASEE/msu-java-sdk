package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.MerchantBinRuleDeleteResponse;

public class MerchantBinRuleDeleteRequest extends ApiRequest<MerchantBinRuleDeleteResponse> {
    private String ruleName;

    private MerchantBinRuleDeleteRequest() {
    }

    public static MerchantBinRuleDeleteRequestBuilder builder() {
        return new MerchantBinRuleDeleteRequestBuilder();
    }

    @Override
    public Class<MerchantBinRuleDeleteResponse> responseClass() {
        return MerchantBinRuleDeleteResponse.class;
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
