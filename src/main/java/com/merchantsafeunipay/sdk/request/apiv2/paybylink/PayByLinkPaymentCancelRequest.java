package com.merchantsafeunipay.sdk.request.apiv2.paybylink;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.PayByLinkPaymentCancelResponse;

public class PayByLinkPaymentCancelRequest extends ApiRequest<PayByLinkPaymentCancelResponse> {
    private String payByLinkToken;

    private PayByLinkPaymentCancelRequest() {
    }

    public static PayByLinkPaymentCancelRequestBuilder builder() {
        return new PayByLinkPaymentCancelRequestBuilder();
    }

    @Override
    public Class<PayByLinkPaymentCancelResponse> responseClass() {
        return PayByLinkPaymentCancelResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYBYLINKTOKEN, this.payByLinkToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYBYLINKPAYMENTCANCEL;
    }

    public static final class PayByLinkPaymentCancelRequestBuilder {
        private String payByLinkToken;

        private Authentication authentication;

        public PayByLinkPaymentCancelRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PayByLinkPaymentCancelRequestBuilder withPayByLinkToken(String payByLinkToken) {
            this.payByLinkToken = payByLinkToken;
            return this;
        }

        public PayByLinkPaymentCancelRequest build() {
            PayByLinkPaymentCancelRequest request = new PayByLinkPaymentCancelRequest();
            request.authentication = this.authentication;
            request.payByLinkToken = this.payByLinkToken;
            return request;
        }
    }
}
