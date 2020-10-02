package com.payten.sdk.msu.request.apiv2.recurringplan;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.RecurringPlanDeleteResponse;

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
