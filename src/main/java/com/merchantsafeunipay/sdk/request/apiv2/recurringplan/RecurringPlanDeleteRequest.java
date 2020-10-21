package com.merchantsafeunipay.sdk.request.apiv2.recurringplan;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.RecurringPlanDeleteResponse;

public class RecurringPlanDeleteRequest extends ApiRequest<RecurringPlanDeleteResponse> {
    private String recurringPlanCode;

    private RecurringPlanDeleteRequest() {
    }

    public static RecurringPlanDeleteRequestBuilder builder() {
        return new RecurringPlanDeleteRequestBuilder();
    }

    @Override
    public Class<RecurringPlanDeleteResponse> responseClass() {
        return RecurringPlanDeleteResponse.class;
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
