package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryTransactionResponse.class
)
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

    private QueryTransactionRequest() {
    }

    public static QueryTransactionRequestBuilder builder() {
        return new QueryTransactionRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANID, this.pgTranId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TRANSACTIONSTATUS, this.transactionStatus);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STARTDATE, this.startDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENDDATE, this.endDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.OFFSET, this.offset);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.LIMIT, this.limit);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERNAME, this.customerName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERPHONE, this.customerPhone);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYTRANSACTION;
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

        private Authentication authentication;

        public QueryTransactionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
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
            QueryTransactionRequest request = new QueryTransactionRequest();
            request.authentication = this.authentication;
            request.pgTranId = this.pgTranId;
            request.transactionStatus = this.transactionStatus;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.offset = this.offset;
            request.limit = this.limit;
            request.merchantPaymentId = this.merchantPaymentId;
            request.customer = this.customer;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            return request;
        }
    }
}
