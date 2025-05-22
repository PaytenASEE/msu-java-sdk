package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryTransactionResponse;

public class QueryTransactionRequest extends ApiRequest<QueryTransactionResponse> {
    private String pgTranId;
    private String walletPaymentTool;

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

    private String encryptedPan;

    private QueryTransactionRequest() {
    }

    public static QueryTransactionRequestBuilder builder() {
        return new QueryTransactionRequestBuilder();
    }

    @Override
    public Class<QueryTransactionResponse> responseClass() {
        return QueryTransactionResponse.class;
    }

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
        addToPayload(Param.ENCRYPTEDPAN, this.encryptedPan);
        addToPayload(Param.WALLETPAYMENTTOOL,this.walletPaymentTool);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYTRANSACTION;
    }

    public static final class QueryTransactionRequestBuilder {
        private String pgTranId;
        private String walletPaymentTool;

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

        private String encryptedPan;

        private Authentication authentication;

        public QueryTransactionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryTransactionRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }
        public QueryTransactionRequestBuilder withWalletPaymentTool(String walletPaymentTool) {
            this.walletPaymentTool = walletPaymentTool;
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

        public QueryTransactionRequestBuilder withEncryptedPan(String encryptedPan) {
            this.encryptedPan = encryptedPan;
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
            request.encryptedPan = this.encryptedPan;
            request.walletPaymentTool = this.walletPaymentTool;
            return request;
        }
    }
}
