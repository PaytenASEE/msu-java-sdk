package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.InvoiceStatus;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryInvoiceResponse;

public class QueryInvoiceRequest extends ApiRequest<QueryInvoiceResponse> {
    private String dealerCode;

    private String invoiceId;

    private String issueDate;

    private String issueDateEnd;

    private String dueDate;

    private String dueDateEnd;

    private InvoiceStatus invoiceStatus;

    private String invoiceType;

    private String sortBy;

    private String order;

    private String limit;

    private String offset;

    private String merchantOrderID;


    private QueryInvoiceRequest() {
    }

    public static QueryInvoiceRequestBuilder builder() {
        return new QueryInvoiceRequestBuilder();
    }

    @Override
    public Class<QueryInvoiceResponse> responseClass() {
        return QueryInvoiceResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INVOICEID, this.invoiceId);
        addToPayload(Param.ISSUEDATE, this.issueDate);
        addToPayload(Param.ISSUEDATEEND, this.issueDateEnd);
        addToPayload(Param.DUEDATE, this.dueDate);
        addToPayload(Param.DUEDATEEND, this.dueDateEnd);
        addToPayload(Param.INVOICESTATUS, this.invoiceStatus);
        addToPayload(Param.INVOICETYPE, this.invoiceType);
        addToPayload(Param.SORTBY, this.sortBy);
        addToPayload(Param.ORDER, this.order);
        addToPayload(Param.LIMIT, this.limit);
        addToPayload(Param.OFFSET, this.offset);
        addToPayload(Param.MERCHANTORDERID,this.merchantOrderID);

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

        private String invoiceType;

        private String sortBy;

        private String order;

        private String limit;

        private String offset;

        private String merchantOrderId;

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

        public QueryInvoiceRequestBuilder withInvoiceType(String invoiceType){
            this.invoiceType = invoiceType;
            return this;
        }
        public QueryInvoiceRequestBuilder withMerchantOrderID(String merchantOrderID){
            this.merchantOrderId = merchantOrderID;
            return this;
        }

        public QueryInvoiceRequestBuilder withOffset(String offset) {
            this.offset = offset;
            return this;
        }

        public QueryInvoiceRequestBuilder withOrder(String order) {
            this.order = order;
            return this;
        }

        public QueryInvoiceRequestBuilder withLimit(String limit) {
            this.limit = limit;
            return this;
        }

        public QueryInvoiceRequestBuilder withSortBy(String sortBy) {
            this.sortBy = sortBy;
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
            request.invoiceType = this.invoiceType;
            request.limit = this.limit;
            request.order = this.order;
            request.offset = this.offset;
            request.sortBy = this.sortBy;
            request.merchantOrderID = this.merchantOrderId;
            return request;
        }
    }
}
