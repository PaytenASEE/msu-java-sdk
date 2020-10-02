package com.payten.sdk.msu.request.apiv2.merchant;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.MerchantUserDealerAddResponse;

@ResponseInfo(
        responseClass = MerchantUserDealerAddResponse.class
)
public class MerchantUserDealerAddRequest extends ApiRequest {
    private String merchantUserEmail;

    private String dealerCodes;

    private MerchantUserDealerAddRequest() {
    }

    public static MerchantUserDealerAddRequestBuilder builder() {
        return new MerchantUserDealerAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(Param.DEALERCODES, this.dealerCodes);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTUSERDEALERADD;
    }

    public static final class MerchantUserDealerAddRequestBuilder {
        private String merchantUserEmail;

        private String dealerCodes;

        private Authentication authentication;

        public MerchantUserDealerAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantUserDealerAddRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public MerchantUserDealerAddRequestBuilder withDealerCodes(String dealerCodes) {
            this.dealerCodes = dealerCodes;
            return this;
        }

        public MerchantUserDealerAddRequest build() {
            MerchantUserDealerAddRequest request = new MerchantUserDealerAddRequest();
            request.authentication = this.authentication;
            request.merchantUserEmail = this.merchantUserEmail;
            request.dealerCodes = this.dealerCodes;
            return request;
        }
    }
}
