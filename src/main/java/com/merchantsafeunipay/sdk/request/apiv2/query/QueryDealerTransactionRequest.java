package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryDealerTransactionResponse;

import java.math.BigDecimal;

public class QueryDealerTransactionRequest extends ApiRequest<QueryDealerTransactionResponse> {
    private String dealerCode;

    private String dealerCodes;

    private String paymentSystem;

    private String pgTranId;

    private String merchantPaymentId;

    private String customer;

    private String transactionStatus;

    private String transactionType;

    private String startDate;

    private String endDate;

    private String maxResult;

    private BigDecimal amountLowerLimit;

    private BigDecimal amountUpperLimit;

    private Currency currency;

    private String transactionId;

    private String cardPan;

    private QueryDealerTransactionRequest() {
    }

    public static QueryDealerTransactionRequestBuilder builder() {
        return new QueryDealerTransactionRequestBuilder();
    }

    @Override
    public Class<QueryDealerTransactionResponse> responseClass() {
        return QueryDealerTransactionResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.DEALERCODES, this.dealerCodes);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.TRANSACTIONSTATUS, this.transactionStatus);
        addToPayload(Param.TRANSACTIONTYPE, this.transactionType);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
        addToPayload(Param.MAXRESULT, this.maxResult);
        addToPayload(Param.AMOUNTLOWERLIMIT, this.amountLowerLimit);
        addToPayload(Param.AMOUNTUPPERLIMIT, this.amountUpperLimit);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.TRANSACTIONID, this.transactionId);
        addToPayload(Param.CARDPAN, this.cardPan);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYDEALERTRANSACTION;
    }

    public static final class QueryDealerTransactionRequestBuilder {
        private String dealerCode;

        private String dealerCodes;

        private String paymentSystem;

        private String pgTranId;

        private String merchantPaymentId;

        private String customer;

        private String transactionStatus;

        private String transactionType;

        private String startDate;

        private String endDate;

        private String maxResult;

        private BigDecimal amountLowerLimit;

        private BigDecimal amountUpperLimit;

        private Currency currency;

        private String transactionId;

        private String cardPan;

        private Authentication authentication;

        public QueryDealerTransactionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withDealerCodes(String dealerCodes) {
            this.dealerCodes = dealerCodes;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withTransactionStatus(String transactionStatus) {
            this.transactionStatus = transactionStatus;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withTransactionType(String transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withMaxResult(String maxResult) {
            this.maxResult = maxResult;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withAmountLowerLimit(BigDecimal amountLowerLimit) {
            this.amountLowerLimit = amountLowerLimit;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withAmountUpperLimit(BigDecimal amountUpperLimit) {
            this.amountUpperLimit = amountUpperLimit;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public QueryDealerTransactionRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public QueryDealerTransactionRequest build() {
            QueryDealerTransactionRequest request = new QueryDealerTransactionRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.dealerCodes = this.dealerCodes;
            request.paymentSystem = this.paymentSystem;
            request.pgTranId = this.pgTranId;
            request.merchantPaymentId = this.merchantPaymentId;
            request.customer = this.customer;
            request.transactionStatus = this.transactionStatus;
            request.transactionType = this.transactionType;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.maxResult = this.maxResult;
            request.amountLowerLimit = this.amountLowerLimit;
            request.amountUpperLimit = this.amountUpperLimit;
            request.currency = this.currency;
            request.transactionId = this.transactionId;
            request.cardPan = this.cardPan;
            return request;
        }
    }
}
