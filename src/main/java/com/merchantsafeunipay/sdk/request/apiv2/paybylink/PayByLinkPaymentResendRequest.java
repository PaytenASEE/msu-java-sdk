package com.merchantsafeunipay.sdk.request.apiv2.paybylink;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.PayByLinkPaymentResendResponse;

public class PayByLinkPaymentResendRequest extends ApiRequest<PayByLinkPaymentResendResponse> {
    private String payByLinkToken;

    private String notificationChannels;

    private PayByLinkPaymentResendRequest() {
    }

    public static PayByLinkPaymentResendRequestBuilder builder() {
        return new PayByLinkPaymentResendRequestBuilder();
    }

    @Override
    public Class<PayByLinkPaymentResendResponse> responseClass() {
        return PayByLinkPaymentResendResponse.class;
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
