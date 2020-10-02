package com.github.msu.sdk.request.apiv2.recurringplan;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.RecurringPlanStatus;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.RecurringPlanEditResponse.class
)
public class RecurringPlanEditRequest extends ApiRequest {
    private String recurringPlanCode;

    private RecurringPlanStatus recurringPlanStatus;

    private BigDecimal recurringAmount;

    private String paymentSystem;

    private RecurringPlanEditRequest() {
    }

    public static RecurringPlanEditRequestBuilder builder() {
        return new RecurringPlanEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGPLANSTATUS, this.recurringPlanStatus);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGAMOUNT, this.recurringAmount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECURRINGPLANEDIT;
    }

    public static final class RecurringPlanEditRequestBuilder {
        private String recurringPlanCode;

        private RecurringPlanStatus recurringPlanStatus;

        private BigDecimal recurringAmount;

        private String paymentSystem;

        private Authentication authentication;

        public RecurringPlanEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RecurringPlanEditRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public RecurringPlanEditRequestBuilder withRecurringPlanStatus(
                RecurringPlanStatus recurringPlanStatus) {
            this.recurringPlanStatus = recurringPlanStatus;
            return this;
        }

        public RecurringPlanEditRequestBuilder withRecurringAmount(BigDecimal recurringAmount) {
            this.recurringAmount = recurringAmount;
            return this;
        }

        public RecurringPlanEditRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public RecurringPlanEditRequest build() {
            RecurringPlanEditRequest request = new RecurringPlanEditRequest();
            request.authentication = this.authentication;
            request.recurringPlanCode = this.recurringPlanCode;
            request.recurringPlanStatus = this.recurringPlanStatus;
            request.recurringAmount = this.recurringAmount;
            request.paymentSystem = this.paymentSystem;
            return request;
        }
    }
}
