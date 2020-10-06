package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.response.MerchantDisableResponse;

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
