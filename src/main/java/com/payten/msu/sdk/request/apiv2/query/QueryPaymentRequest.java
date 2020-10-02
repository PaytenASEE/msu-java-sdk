package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Currency;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryPaymentResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = QueryPaymentResponse.class
)
public class QueryPaymentRequest extends ApiRequest {
    private String dealerCodes;

    private String customer;

    private Currency currency;

    private String startDate;

    private String endDate;

    private String merchantPaymentId;

    private BigDecimal amountLowerLimit;

    private BigDecimal amountUpperLimit;

    private QueryPaymentRequest() {
    }

    public static QueryPaymentRequestBuilder builder() {
        return new QueryPaymentRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODES, this.dealerCodes);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.AMOUNTLOWERLIMIT, this.amountLowerLimit);
        addToPayload(Param.AMOUNTUPPERLIMIT, this.amountUpperLimit);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPAYMENT;
    }

    public static final class QueryPaymentRequestBuilder {
        private String dealerCodes;

        private String customer;

        private Currency currency;

        private String startDate;

        private String endDate;

        private String merchantPaymentId;

        private BigDecimal amountLowerLimit;

        private BigDecimal amountUpperLimit;

        private Authentication authentication;

        public QueryPaymentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPaymentRequestBuilder withDealerCodes(String dealerCodes) {
            this.dealerCodes = dealerCodes;
            return this;
        }

        public QueryPaymentRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryPaymentRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public QueryPaymentRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryPaymentRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryPaymentRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public QueryPaymentRequestBuilder withAmountLowerLimit(BigDecimal amountLowerLimit) {
            this.amountLowerLimit = amountLowerLimit;
            return this;
        }

        public QueryPaymentRequestBuilder withAmountUpperLimit(BigDecimal amountUpperLimit) {
            this.amountUpperLimit = amountUpperLimit;
            return this;
        }

        public QueryPaymentRequest build() {
            QueryPaymentRequest request = new QueryPaymentRequest();
            request.authentication = this.authentication;
            request.dealerCodes = this.dealerCodes;
            request.customer = this.customer;
            request.currency = this.currency;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amountLowerLimit = this.amountLowerLimit;
            request.amountUpperLimit = this.amountUpperLimit;
            return request;
        }
    }
}
