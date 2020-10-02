package com.payten.msu.sdk.request.apiv2.merchant;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.MerchantUserReInviteResponse;

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
