package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.MerchantHppSettingDeleteResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = MerchantHppSettingDeleteResponse.class
)
public class MerchantHppSettingDeleteRequest extends ApiRequest {
    private MerchantHppSettingDeleteRequest() {
    }

    public static MerchantHppsettingdeleteRequestBuilder builder() {
        return new MerchantHppsettingdeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTHPPSETTINGDELETE;
    }

    public static final class MerchantHppsettingdeleteRequestBuilder {
        private Authentication authentication;

        public MerchantHppsettingdeleteRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantHppSettingDeleteRequest build() {
            MerchantHppSettingDeleteRequest request = new MerchantHppSettingDeleteRequest();
            request.authentication = this.authentication;
            return request;
        }
    }
}
