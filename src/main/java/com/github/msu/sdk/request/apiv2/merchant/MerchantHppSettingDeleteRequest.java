package com.github.msu.sdk.request.apiv2.merchant;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.response.MerchantHppSettingDeleteResponse;
import com.github.msu.sdk.util.ResponseInfo;

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
