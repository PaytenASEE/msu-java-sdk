package com.payten.sdk.msu.request.apiv2.merchant;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.MerchantUserDealerRemoveResponse;

@ResponseInfo(
        responseClass = MerchantUserDealerRemoveResponse.class
)
public class MerchantUserDealerRemoveRequest extends ApiRequest {
    private String merchantUserEmail;

    private String dealerCodes;

    private MerchantUserDealerRemoveRequest() {
    }

    public static MerchantUserDealerRemoveRequestBuilder builder() {
        return new MerchantUserDealerRemoveRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(Param.DEALERCODES, this.dealerCodes);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTUSERDEALERREMOVE;
    }

    public static final class MerchantUserDealerRemoveRequestBuilder {
        private String merchantUserEmail;

        private String dealerCodes;

        private Authentication authentication;

        public MerchantUserDealerRemoveRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantUserDealerRemoveRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public MerchantUserDealerRemoveRequestBuilder withDealerCodes(String dealerCodes) {
            this.dealerCodes = dealerCodes;
            return this;
        }

        public MerchantUserDealerRemoveRequest build() {
            MerchantUserDealerRemoveRequest request = new MerchantUserDealerRemoveRequest();
            request.authentication = this.authentication;
            request.merchantUserEmail = this.merchantUserEmail;
            request.dealerCodes = this.dealerCodes;
            return request;
        }
    }
}
