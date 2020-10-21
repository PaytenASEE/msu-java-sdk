package com.merchantsafeunipay.sdk.request.apiv2.recurringplan;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.RecurringPlanResendLinkResponse;

public class RecurringPlanResendLinkRequest extends ApiRequest<RecurringPlanResendLinkResponse> {
    private String recurringPlanCode;

    private String notificationChannels;

    private RecurringPlanResendLinkRequest() {
    }

    public static RecurringPlanResendLinkRequestBuilder builder() {
        return new RecurringPlanResendLinkRequestBuilder();
    }

    @Override
    public Class<RecurringPlanResendLinkResponse> responseClass() {
        return RecurringPlanResendLinkResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(Param.NOTIFICATIONCHANNELS, this.notificationChannels);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECURRINGPLANRESENDLINK;
    }

    public static final class RecurringPlanResendLinkRequestBuilder {
        private String recurringPlanCode;

        private String notificationChannels;

        private Authentication authentication;

        public RecurringPlanResendLinkRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RecurringPlanResendLinkRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public RecurringPlanResendLinkRequestBuilder withNotificationChannels(
                String notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }

        public RecurringPlanResendLinkRequest build() {
            RecurringPlanResendLinkRequest request = new RecurringPlanResendLinkRequest();
            request.authentication = this.authentication;
            request.recurringPlanCode = this.recurringPlanCode;
            request.notificationChannels = this.notificationChannels;
            return request;
        }
    }
}
