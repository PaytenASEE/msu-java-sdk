package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryPsInstallmentResponse;
import java.math.BigDecimal;

public class QueryPsInstallmentRequest extends ApiRequest<QueryPsInstallmentResponse> {

    private String sessionToken;
    private String cardPan;
    private String cardExpiry;
    private String cardCvv;
    private String customer;
    private BigDecimal amount;
    private Currency currency;
    private String customerName;
    private String customerPhone;
    private String customerIp;
    private String nameOnCard;
    private String paymentSystemType;
    private String paymentSystem;
    private String merchantPaymentId;

    private QueryPsInstallmentRequest() {
    }

    public static QueryPsInstallmentRequestBuilder builder() {
        return new QueryPsInstallmentRequestBuilder();
    }

    @Override
    public Class<QueryPsInstallmentResponse> responseClass() {
        return QueryPsInstallmentResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.SESSIONTOKEN, this.sessionToken);
        addToPayload(Param.CARDCVV, this.cardCvv);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.CARDPAN, this.cardPan);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.CUSTOMERIP, this.customerIp);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);

    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPSINSTALLMENT;
    }

    public static final class QueryPsInstallmentRequestBuilder {
        private String sessionToken;
        private String cardPan;
        private String cardExpiry;
        private String cardCvv;
        private String customer;
        private BigDecimal amount;
        private Currency currency;
        private String customerName;
        private String customerPhone;
        private String customerIp;
        private String nameOnCard;
        private String paymentSystemType;
        private String paymentSystem;
        private Authentication authentication;
        private String merchantPaymentId;

        public QueryPsInstallmentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPsInstallmentRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }
        public QueryPsInstallmentRequestBuilder withPaymentSystemType(String paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public QueryPsInstallmentRequestBuilder withDealerCode(String paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }
        public QueryPsInstallmentRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }


        public QueryPsInstallmentRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryPsInstallmentRequestBuilder withSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        public QueryPsInstallmentRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }
        public QueryPsInstallmentRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }
        public QueryPsInstallmentRequestBuilder withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return this;
        }


        public QueryPsInstallmentRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public QueryPsInstallmentRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public QueryPsInstallmentRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public QueryPsInstallmentRequestBuilder withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }


        public QueryPsInstallmentRequest build() {
            QueryPsInstallmentRequest request = new QueryPsInstallmentRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.cardCvv = this.cardCvv;
            request.cardExpiry = this.cardExpiry;
            request.cardPan = this.cardPan;
            request.amount = this.amount;
            request.currency = this.currency;
            request.customer = this.customer;
            request.customerIp = this.customerIp;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            request.paymentSystemType = this.paymentSystemType;
            request.sessionToken = this.sessionToken;
            request.nameOnCard = this.nameOnCard;
            request.merchantPaymentId =this.merchantPaymentId;

            return request;
        }
    }
}