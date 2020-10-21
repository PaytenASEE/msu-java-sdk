package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.MerchantUserDealerAddResponse;

public class MerchantUserDealerAddRequest extends ApiRequest<MerchantUserDealerAddResponse> {
    private String merchantUserEmail;

    private String dealerCodes;

    private MerchantUserDealerAddRequest() {
    }

    public static MerchantUserDealerAddRequestBuilder builder() {
        return new MerchantUserDealerAddRequestBuilder();
    }

    @Override
    public Class<MerchantUserDealerAddResponse> responseClass() {
        return MerchantUserDealerAddResponse.class;
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
