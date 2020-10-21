package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.PayByLinkStatus;
import com.merchantsafeunipay.sdk.response.QueryPayByLinkPaymentResponse;

public class QueryPayByLinkPaymentRequest extends ApiRequest<QueryPayByLinkPaymentResponse> {
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
    public Class<QueryPayByLinkPaymentResponse> responseClass() {
        return QueryPayByLinkPaymentResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYBYLINKTOKEN, this.payByLinkToken);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
        addToPayload(Param.DUEDATE, this.dueDate);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.PAYBYLINKSTATUS, this.payByLinkStatus);
        addToPayload(Param.DEALERCODE, this.dealerCode);
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
