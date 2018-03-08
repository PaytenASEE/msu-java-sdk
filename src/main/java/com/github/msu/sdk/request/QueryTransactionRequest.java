package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryTransactionResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryTransactionResponse.class)
public class QueryTransactionRequest extends ApiRequest {
    private String pgTranId;
    private String transactionStatus;
    private String startDate;
    private String endDate;
    private String offset;
    private String limit;
    private String merchantPaymentId;
    private String customer;
    private String customerEmail;
    private String customerName;
    private String customerPhone;

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.TRANSACTIONSTATUS, this.transactionStatus);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
        addToPayload(Param.OFFSET, this.offset);
        addToPayload(Param.LIMIT, this.limit);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
    }

    public static QueryTransactionRequestBuilder builder() {
        return new QueryTransactionRequestBuilder();
    }

    @Override
    public Action action() {
        return Action.QUERYTRANSACTION;
    }

    public static final class QueryTransactionRequestBuilder {
        private String pgTranId;
        private String transactionStatus;
        private String startDate;
        private String endDate;
        private String offset;
        private String limit;
        private String merchantPaymentId;
        private String customer;
        private String customerEmail;
        private String customerName;
        private String customerPhone;

        private QueryTransactionRequestBuilder() {
        }

        public QueryTransactionRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public QueryTransactionRequestBuilder withTransactionStatus(String transactionStatus) {
            this.transactionStatus = transactionStatus;
            return this;
        }

        public QueryTransactionRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryTransactionRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryTransactionRequestBuilder withOffset(String offset) {
            this.offset = offset;
            return this;
        }

        public QueryTransactionRequestBuilder withLimit(String limit) {
            this.limit = limit;
            return this;
        }

        public QueryTransactionRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public QueryTransactionRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryTransactionRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public QueryTransactionRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public QueryTransactionRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public QueryTransactionRequest build() {
            QueryTransactionRequest queryTransactionRequest = new QueryTransactionRequest();
            queryTransactionRequest.customerEmail = this.customerEmail;
            queryTransactionRequest.startDate = this.startDate;
            queryTransactionRequest.limit = this.limit;
            queryTransactionRequest.endDate = this.endDate;
            queryTransactionRequest.customer = this.customer;
            queryTransactionRequest.customerName = this.customerName;
            queryTransactionRequest.transactionStatus = this.transactionStatus;
            queryTransactionRequest.offset = this.offset;
            queryTransactionRequest.merchantPaymentId = this.merchantPaymentId;
            queryTransactionRequest.pgTranId = this.pgTranId;
            queryTransactionRequest.customerPhone = this.customerPhone;
            return queryTransactionRequest;
        }
    }
}
