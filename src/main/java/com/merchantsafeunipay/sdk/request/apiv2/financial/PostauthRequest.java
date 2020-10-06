package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.PostauthResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = PostauthResponse.class
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
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
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
