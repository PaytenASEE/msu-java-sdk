package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.InvoiceStatus;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryInvoiceResponse.class
)
public class QueryInvoiceRequest extends ApiRequest {
    private String dealerCode;

    private String invoiceId;

    private String issueDate;

    private String issueDateEnd;

    private String dueDate;

    private String dueDateEnd;

    private InvoiceStatus invoiceStatus;

    private QueryInvoiceRequest() {
    }

    public static QueryInvoiceRequestBuilder builder() {
        return new QueryInvoiceRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INVOICEID, this.invoiceId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISSUEDATE, this.issueDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISSUEDATEEND, this.issueDateEnd);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DUEDATE, this.dueDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DUEDATEEND, this.dueDateEnd);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INVOICESTATUS, this.invoiceStatus);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYINVOICE;
    }

    public static final class QueryInvoiceRequestBuilder {
        private String dealerCode;

        private String invoiceId;

        private String issueDate;

        private String issueDateEnd;

        private String dueDate;

        private String dueDateEnd;

        private InvoiceStatus invoiceStatus;

        private Authentication authentication;

        public QueryInvoiceRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryInvoiceRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryInvoiceRequestBuilder withInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public QueryInvoiceRequestBuilder withIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public QueryInvoiceRequestBuilder withIssueDateEnd(String issueDateEnd) {
            this.issueDateEnd = issueDateEnd;
            return this;
        }

        public QueryInvoiceRequestBuilder withDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public QueryInvoiceRequestBuilder withDueDateEnd(String dueDateEnd) {
            this.dueDateEnd = dueDateEnd;
            return this;
        }

        public QueryInvoiceRequestBuilder withInvoiceStatus(InvoiceStatus invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            return this;
        }

        public QueryInvoiceRequest build() {
            QueryInvoiceRequest request = new QueryInvoiceRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.invoiceId = this.invoiceId;
            request.issueDate = this.issueDate;
            request.issueDateEnd = this.issueDateEnd;
            request.dueDate = this.dueDate;
            request.dueDateEnd = this.dueDateEnd;
            request.invoiceStatus = this.invoiceStatus;
            return request;
        }
    }
}
