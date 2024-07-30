package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.PostauthResponse;

import java.math.BigDecimal;
import java.util.Map;

public class PostauthRequest extends ApiRequest<PostauthResponse> {
    private String pgTranId;
    private String merchantPaymentId;
    private String initiatorMerchantBusinessId;
    private BigDecimal amount;
    private String invoiceId;
    private Map<String, String> extra;

    private PostauthRequest(PostauthRequestBuilder builder) {
        super();
        this.pgTranId = builder.pgTranId;
        this.merchantPaymentId = builder.merchantPaymentId;
        this.initiatorMerchantBusinessId = builder.initiatorMerchantBusinessId;
        this.amount = builder.amount;
        this.authentication = builder.authentication;
        this.invoiceId = builder.invoiceId;
        this.extra = builder.extra;
    }

    public static PostauthRequestBuilder builder() {
        return new PostauthRequestBuilder();
    }

    @Override
    public Class<PostauthResponse> responseClass() {
        return PostauthResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.INVOICEID, this.invoiceId);
        addToPayload(Param.EXTRA, this.extra);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.POSTAUTH;
    }

    public static class PostauthRequestBuilder {
        private String pgTranId;
        private String merchantPaymentId;
        private String initiatorMerchantBusinessId;
        private BigDecimal amount;
        private Authentication authentication;
        private String invoiceId;
        private Map<String, String> extra;

        public PostauthRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }
        public PostauthRequest.PostauthRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public PostauthRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public PostauthRequestBuilder withInitiatorMerchantBusinessId(String initiatorMerchantBusinessId) {
            this.initiatorMerchantBusinessId = initiatorMerchantBusinessId;
            return this;
        }

        public PostauthRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public PostauthRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PostauthRequestBuilder withInvoiceId(String invoiceId){
            this.invoiceId = invoiceId;
            return this;
        }

        public PostauthRequest build() {
            return new PostauthRequest(this);
        }
    }
}
