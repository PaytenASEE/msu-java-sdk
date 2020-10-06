package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.MerchantUserReInviteResponse;

@ResponseInfo(
        responseClass = MerchantUserReInviteResponse.class
)
public class MerchantUserReInviteRequest extends ApiRequest {
    private String merchantUserEmail;

    private MerchantUserReInviteRequest() {
    }

    public static MerchantUserReInviteRequestBuilder builder() {
        return new MerchantUserReInviteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTUSERREINVITE;
    }

    public static final class MerchantUserReInviteRequestBuilder {
        private String merchantUserEmail;

        private Authentication authentication;

        public MerchantUserReInviteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantUserReInviteRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public MerchantUserReInviteRequest build() {
            MerchantUserReInviteRequest request = new MerchantUserReInviteRequest();
            request.authentication = this.authentication;
            request.merchantUserEmail = this.merchantUserEmail;
            return request;
        }
    }
}
