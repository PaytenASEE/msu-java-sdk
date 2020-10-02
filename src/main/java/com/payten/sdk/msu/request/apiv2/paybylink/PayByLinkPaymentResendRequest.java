package com.payten.sdk.msu.request.apiv2.paybylink;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.PayByLinkPaymentResendResponse;

@ResponseInfo(
        responseClass = PayByLinkPaymentResendResponse.class
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
        addToPayload(Param.PAYBYLINKTOKEN, this.payByLinkToken);
        addToPayload(Param.NOTIFICATIONCHANNELS, this.notificationChannels);
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
