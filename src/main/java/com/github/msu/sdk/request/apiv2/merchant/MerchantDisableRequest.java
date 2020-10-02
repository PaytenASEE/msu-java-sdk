package com.github.msu.sdk.request.apiv2.merchant;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.MerchantDisableResponse.class
)
public class MerchantDisableRequest extends ApiRequest {
    private MerchantDisableRequest() {
    }

    public static MerchantDisableRequestBuilder builder() {
        return new MerchantDisableRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTDISABLE;
    }

    public static final class MerchantDisableRequestBuilder {
        private Authentication authentication;

        public MerchantDisableRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantDisableRequest build() {
            MerchantDisableRequest request = new MerchantDisableRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
