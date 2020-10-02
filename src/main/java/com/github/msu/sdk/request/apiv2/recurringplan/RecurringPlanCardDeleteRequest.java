package com.github.msu.sdk.request.apiv2.recurringplan;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.RecurringPlanCardDeleteResponse.class
)
public class RecurringPlanCardDeleteRequest extends ApiRequest {
    private String recurringPlanCode;

    private String cardToken;

    private RecurringPlanCardDeleteRequest() {
    }

    public static RecurringPlanCardDeleteRequestBuilder builder() {
        return new RecurringPlanCardDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECURRINGPLANCARDDELETE;
    }

    public static final class RecurringPlanCardDeleteRequestBuilder {
        private String recurringPlanCode;

        private String cardToken;

        private Authentication authentication;

        public RecurringPlanCardDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RecurringPlanCardDeleteRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public RecurringPlanCardDeleteRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public RecurringPlanCardDeleteRequest build() {
            RecurringPlanCardDeleteRequest request = new RecurringPlanCardDeleteRequest();
            request.authentication = this.authentication;
            request.recurringPlanCode = this.recurringPlanCode;
            request.cardToken = this.cardToken;
            return request;
        }
    }
}
