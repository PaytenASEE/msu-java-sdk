package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.PayByLinkStatus;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryPayByLinkPaymentResponse.class
)
public class QueryPayByLinkPaymentRequest extends ApiRequest {
    private String payByLinkToken;

    private String startDate;

    private String endDate;

    private String dueDate;

    private String customerEmail;

    private PayByLinkStatus payByLinkStatus;

    private String dealerCode;

    private QueryPayByLinkPaymentRequest() {
    }

    public static QueryPayByLinkPaymentRequestBuilder builder() {
        return new QueryPayByLinkPaymentRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYBYLINKTOKEN, this.payByLinkToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STARTDATE, this.startDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENDDATE, this.endDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DUEDATE, this.dueDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYBYLINKSTATUS, this.payByLinkStatus);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPAYBYLINKPAYMENT;
    }

    public static final class QueryPayByLinkPaymentRequestBuilder {
        private String payByLinkToken;

        private String startDate;

        private String endDate;

        private String dueDate;

        private String customerEmail;

        private PayByLinkStatus payByLinkStatus;

        private String dealerCode;

        private Authentication authentication;

        public QueryPayByLinkPaymentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPayByLinkPaymentRequestBuilder withPayByLinkToken(String payByLinkToken) {
            this.payByLinkToken = payByLinkToken;
            return this;
        }

        public QueryPayByLinkPaymentRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryPayByLinkPaymentRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryPayByLinkPaymentRequestBuilder withDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public QueryPayByLinkPaymentRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public QueryPayByLinkPaymentRequestBuilder withPayByLinkStatus(
                PayByLinkStatus payByLinkStatus) {
            this.payByLinkStatus = payByLinkStatus;
            return this;
        }

        public QueryPayByLinkPaymentRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryPayByLinkPaymentRequest build() {
            QueryPayByLinkPaymentRequest request = new QueryPayByLinkPaymentRequest();
            request.authentication = this.authentication;
            request.payByLinkToken = this.payByLinkToken;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.dueDate = this.dueDate;
            request.customerEmail = this.customerEmail;
            request.payByLinkStatus = this.payByLinkStatus;
            request.dealerCode = this.dealerCode;
            return request;
        }
    }
}
