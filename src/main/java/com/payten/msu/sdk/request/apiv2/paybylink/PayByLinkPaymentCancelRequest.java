package com.payten.msu.sdk.request.apiv2.paybylink;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.PayByLinkPaymentCancelResponse;

@ResponseInfo(
        responseClass = PayByLinkPaymentCancelResponse.class
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
