package com.payten.msu.sdk.request.apiv2.recurringplan;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.RecurringPlanDeleteResponse;

@ResponseInfo(
        responseClass = RecurringPlanDeleteResponse.class
)
public class RecurringPlanDeleteRequest extends ApiRequest {
    private String recurringPlanCode;

    private RecurringPlanDeleteRequest() {
    }

    public static RecurringPlanDeleteRequestBuilder builder() {
        return new RecurringPlanDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RECURRINGPLANCODE, this.recurringPlanCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECURRINGPLANDELETE;
    }

    public static final class RecurringPlanDeleteRequestBuilder {
        private String recurringPlanCode;

        private Authentication authentication;

        public RecurringPlanDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RecurringPlanDeleteRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public RecurringPlanDeleteRequest build() {
            RecurringPlanDeleteRequest request = new RecurringPlanDeleteRequest();
            request.authentication = this.authentication;
            request.recurringPlanCode = this.recurringPlanCode;
            return request;
        }
    }
}
