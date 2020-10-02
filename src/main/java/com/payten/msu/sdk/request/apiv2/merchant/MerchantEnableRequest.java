package com.payten.msu.sdk.request.apiv2.merchant;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.response.MerchantEnableResponse;

@ResponseInfo(
        responseClass = MerchantEnableResponse.class
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
