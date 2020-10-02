package com.payten.sdk.msu.request.apiv2.recurringplan;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.RecurringPaymentStatus;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.RecurringPaymentEditResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = RecurringPaymentEditResponse.class
)
public class RecurringPaymentEditRequest extends ApiRequest {
    private String recurringPlanCode;

    private BigDecimal recurrence;

    private BigDecimal amount;

    private RecurringPaymentStatus recurringPaymentStatus;

    private RecurringPaymentEditRequest() {
    }

    public static RecurringPaymentEditRequestBuilder builder() {
        return new RecurringPaymentEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(Param.RECURRENCE, this.recurrence);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.RECURRINGPAYMENTSTATUS, this.recurringPaymentStatus);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECURRINGPAYMENTEDIT;
    }

    public static final class RecurringPaymentEditRequestBuilder {
        private String recurringPlanCode;

        private BigDecimal recurrence;

        private BigDecimal amount;

        private RecurringPaymentStatus recurringPaymentStatus;

        private Authentication authentication;

        public RecurringPaymentEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RecurringPaymentEditRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public RecurringPaymentEditRequestBuilder withRecurrence(BigDecimal recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        public RecurringPaymentEditRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public RecurringPaymentEditRequestBuilder withRecurringPaymentStatus(
                RecurringPaymentStatus recurringPaymentStatus) {
            this.recurringPaymentStatus = recurringPaymentStatus;
            return this;
        }

        public RecurringPaymentEditRequest build() {
            RecurringPaymentEditRequest request = new RecurringPaymentEditRequest();
            request.authentication = this.authentication;
            request.recurringPlanCode = this.recurringPlanCode;
            request.recurrence = this.recurrence;
            request.amount = this.amount;
            request.recurringPaymentStatus = this.recurringPaymentStatus;
            return request;
        }
    }
}
