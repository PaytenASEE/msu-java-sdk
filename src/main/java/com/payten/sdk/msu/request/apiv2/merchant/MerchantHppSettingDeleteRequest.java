package com.payten.sdk.msu.request.apiv2.merchant;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.response.MerchantHppSettingDeleteResponse;
import com.payten.sdk.msu.util.ResponseInfo;

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
