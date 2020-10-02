package com.payten.sdk.msu.request.apiv2.paybylink;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.PayByLinkPaymentCancelResponse;

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
