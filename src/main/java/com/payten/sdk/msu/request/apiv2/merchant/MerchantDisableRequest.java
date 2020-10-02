package com.payten.sdk.msu.request.apiv2.merchant;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.response.MerchantDisableResponse;

@ResponseInfo(
        responseClass = MerchantDisableResponse.class
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
