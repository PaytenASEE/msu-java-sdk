package com.merchantsafeunipay.sdk.request.apiv2.paybylink;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.PayByLinkPaymentEditResponse;

import java.math.BigDecimal;

public class PayByLinkPaymentEditRequest extends ApiRequest<PayByLinkPaymentEditResponse> {

    private BigDecimal amount;
    private String returnUrl;
    private String sessionToken;

    private PayByLinkPaymentEditRequest() {
    }

    public static PayByLinkPaymentRequestBuilder builder() {
        return new PayByLinkPaymentRequestBuilder();
    }

    @Override
    public Class<PayByLinkPaymentEditResponse> responseClass() {
        return PayByLinkPaymentEditResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.RETURNURL, this.returnUrl);
        addToPayload(Param.SESSIONTOKEN, this.sessionToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYBYLINKPAYMENTEDIT;
    }

    public static final class PayByLinkPaymentRequestBuilder {
        private BigDecimal amount;

        private String returnUrl;

        private String payByLinkToken;

        private Authentication authentication;

        public PayByLinkPaymentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withPayByLinkToken(String payByLinkToken) {
            this.payByLinkToken = payByLinkToken;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        public PayByLinkPaymentEditRequest build() {
            PayByLinkPaymentEditRequest request = new PayByLinkPaymentEditRequest();
            request.authentication = this.authentication;
            request.amount = this.amount;
            request.returnUrl = this.returnUrl;
            request.sessionToken = this.payByLinkToken;
            return request;
        }
    }
}
