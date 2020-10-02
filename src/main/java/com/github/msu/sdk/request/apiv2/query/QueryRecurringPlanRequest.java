package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.RecurringPlanStatus;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryRecurringPlanResponse.class
)
public class QueryRecurringPlanRequest extends ApiRequest {
    private String recurringPlanCode;

    private RecurringPlanStatus recurringPlanStatus;

    private String startDate;

    private String endDate;

    private String cardPan;

    private String customer;

    private String cardToken;

    private String customerEmail;

    private String customerName;

    private String customerPhone;

    private QueryRecurringPlanRequest() {
    }

    public static QueryRecurringPlanRequestBuilder builder() {
        return new QueryRecurringPlanRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGPLANSTATUS, this.recurringPlanStatus);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STARTDATE, this.startDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENDDATE, this.endDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDPAN, this.cardPan);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERNAME, this.customerName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERPHONE, this.customerPhone);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYRECURRINGPLAN;
    }

    public static final class QueryRecurringPlanRequestBuilder {
        private String recurringPlanCode;

        private RecurringPlanStatus recurringPlanStatus;

        private String startDate;

        private String endDate;

        private String cardPan;

        private String customer;

        private String cardToken;

        private String customerEmail;

        private String customerName;

        private String customerPhone;

        private Authentication authentication;

        public QueryRecurringPlanRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withRecurringPlanStatus(
                RecurringPlanStatus recurringPlanStatus) {
            this.recurringPlanStatus = recurringPlanStatus;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public QueryRecurringPlanRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public QueryRecurringPlanRequest build() {
            QueryRecurringPlanRequest request = new QueryRecurringPlanRequest();
            request.authentication = this.authentication;
            request.recurringPlanCode = this.recurringPlanCode;
            request.recurringPlanStatus = this.recurringPlanStatus;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.cardPan = this.cardPan;
            request.customer = this.customer;
            request.cardToken = this.cardToken;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            return request;
        }
    }
}
