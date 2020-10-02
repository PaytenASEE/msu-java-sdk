package com.github.msu.sdk.request.apiv2.pbl;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PayByLinkPaymentResendResponse.class
)
public class PayByLinkPaymentResendRequest extends ApiRequest {
    private String payByLinkToken;

    private String notificationChannels;

    private PayByLinkPaymentResendRequest() {
    }

    public static PayByLinkPaymentResendRequestBuilder builder() {
        return new PayByLinkPaymentResendRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYBYLINKTOKEN, this.payByLinkToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NOTIFICATIONCHANNELS, this.notificationChannels);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYBYLINKPAYMENTRESEND;
    }

    public static final class PayByLinkPaymentResendRequestBuilder {
        private String payByLinkToken;

        private String notificationChannels;

        private Authentication authentication;

        public PayByLinkPaymentResendRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PayByLinkPaymentResendRequestBuilder withPayByLinkToken(String payByLinkToken) {
            this.payByLinkToken = payByLinkToken;
            return this;
        }

        public PayByLinkPaymentResendRequestBuilder withNotificationChannels(
                String notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }

        public PayByLinkPaymentResendRequest build() {
            PayByLinkPaymentResendRequest request = new PayByLinkPaymentResendRequest();
            request.authentication = this.authentication;
            request.payByLinkToken = this.payByLinkToken;
            request.notificationChannels = this.notificationChannels;
            return request;
        }
    }
}
