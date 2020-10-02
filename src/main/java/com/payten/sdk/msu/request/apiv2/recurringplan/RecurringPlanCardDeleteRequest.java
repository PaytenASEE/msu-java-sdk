package com.payten.sdk.msu.request.apiv2.recurringplan;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.RecurringPlanCardDeleteResponse;

@ResponseInfo(
        responseClass = RecurringPlanCardDeleteResponse.class
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
        addToPayload(Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(Param.CARDTOKEN, this.cardToken);
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
