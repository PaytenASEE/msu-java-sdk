package com.github.msu.sdk.request.apiv2.merchant;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.MerchantEnableResponse.class
)
public class MerchantEnableRequest extends ApiRequest {
    private MerchantEnableRequest() {
    }

    public static MerchantEnableRequestBuilder builder() {
        return new MerchantEnableRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTENABLE;
    }

    public static final class MerchantEnableRequestBuilder {
        private Authentication authentication;

        public MerchantEnableRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantEnableRequest build() {
            MerchantEnableRequest request = new MerchantEnableRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
