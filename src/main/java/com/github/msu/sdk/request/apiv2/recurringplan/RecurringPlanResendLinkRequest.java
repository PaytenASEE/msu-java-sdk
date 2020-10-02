package com.github.msu.sdk.request.apiv2.recurringplan;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.RecurringPlanResendLinkResponse.class
)
public class RecurringPlanResendLinkRequest extends ApiRequest {
    private String recurringPlanCode;

    private String notificationChannels;

    private RecurringPlanResendLinkRequest() {
    }

    public static RecurringPlanResendLinkRequestBuilder builder() {
        return new RecurringPlanResendLinkRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NOTIFICATIONCHANNELS, this.notificationChannels);
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
