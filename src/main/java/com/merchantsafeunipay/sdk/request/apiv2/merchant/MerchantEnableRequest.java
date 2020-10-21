package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.MerchantEnableResponse;

public class MerchantEnableRequest extends ApiRequest<MerchantEnableResponse> {
    private MerchantEnableRequest() {
    }

    public static MerchantEnableRequestBuilder builder() {
        return new MerchantEnableRequestBuilder();
    }

    @Override
    public Class<MerchantEnableResponse> responseClass() {
        return MerchantEnableResponse.class;
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
