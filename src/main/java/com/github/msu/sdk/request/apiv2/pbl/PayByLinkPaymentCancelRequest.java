package com.github.msu.sdk.request.apiv2.pbl;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PayByLinkPaymentCancelResponse.class
)
public class PayByLinkPaymentCancelRequest extends ApiRequest {
    private String payByLinkToken;

    private PayByLinkPaymentCancelRequest() {
    }

    public static PayByLinkPaymentCancelRequestBuilder builder() {
        return new PayByLinkPaymentCancelRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYBYLINKTOKEN, this.payByLinkToken);
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
