package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.MerchantUserDealerRemoveResponse;

public class MerchantUserDealerRemoveRequest extends ApiRequest<MerchantUserDealerRemoveResponse> {
    private String merchantUserEmail;

    private String dealerCodes;

    private MerchantUserDealerRemoveRequest() {
    }

    public static MerchantUserDealerRemoveRequestBuilder builder() {
        return new MerchantUserDealerRemoveRequestBuilder();
    }

    @Override
    public Class<MerchantUserDealerRemoveResponse> responseClass() {
        return MerchantUserDealerRemoveResponse.class;
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
