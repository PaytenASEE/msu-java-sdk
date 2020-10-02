package com.github.msu.sdk.request.apiv2.financial;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PostauthResponse.class
)
public class PostauthRequest extends ApiRequest {
    private String pgTranId;

    private String merchantPaymentId;

    private BigDecimal amount;

    private String initiatorMerchantBusinessId;

    private PostauthRequest() {
    }

    public static PostauthRequestBuilder builder() {
        return new PostauthRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANID, this.pgTranId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.POSTAUTH;
    }

    public static final class PostauthRequestBuilder {
        private String pgTranId;

        private String merchantPaymentId;

        private BigDecimal amount;

        private String initiatorMerchantBusinessId;

        private Authentication authentication;

        public PostauthRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PostauthRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public PostauthRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public PostauthRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public PostauthRequestBuilder withInitiatorMerchantBusinessId(
                String initiatorMerchantBusinessId) {
            this.initiatorMerchantBusinessId = initiatorMerchantBusinessId;
            return this;
        }

        public PostauthRequest build() {
            PostauthRequest request = new PostauthRequest();
            request.authentication = this.authentication;
            request.pgTranId = this.pgTranId;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amount = this.amount;
            request.initiatorMerchantBusinessId = this.initiatorMerchantBusinessId;
            return request;
        }
    }
}
