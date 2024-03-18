package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.FinancialResponse;

import java.math.BigDecimal;

public class ExternalRefundRequest extends ApiRequest<FinancialResponse> {
    private String paymentSystem;

    private BigDecimal amount;

    private Currency currency;

    private String customer;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private String tckn;

    private String vkn;

    private String merchantPaymentId;

    private ExternalRefundRequest() {
    }

    public static ExternalRefundRequestBuilder builder() {
        return new ExternalRefundRequestBuilder();
    }

    @Override
    public Class<FinancialResponse> responseClass() {
        return FinancialResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.TCKN, this.tckn);
        addToPayload(Param.VKN, this.vkn);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.EXTERNALREFUND;
    }

    public static final class ExternalRefundRequestBuilder {
        private String paymentSystem;

        private BigDecimal amount;

        private Currency currency;

        private String customer;

        private String customerName;

        private String customerEmail;

        private String customerPhone;

        private String tckn;
        private String vkn;
        private String merchantPaymentId;

        private Authentication authentication;

        public ExternalRefundRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public ExternalRefundRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public ExternalRefundRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public ExternalRefundRequestBuilder withVkn(String vkn) {
            this.vkn = vkn;
            return this;
        }

        public ExternalRefundRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ExternalRefundRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public ExternalRefundRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public ExternalRefundRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public ExternalRefundRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public ExternalRefundRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public ExternalRefundRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public ExternalRefundRequest build() {
            ExternalRefundRequest request = new ExternalRefundRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.amount = this.amount;
            request.currency = this.currency;
            request.customer = this.customer;
            request.customerName = this.customerName;
            request.customerEmail = this.customerEmail;
            request.customerPhone = this.customerPhone;
            request.tckn = this.tckn;
            request.vkn = this.vkn;
            request.merchantPaymentId = this.merchantPaymentId;
            return request;
        }
    }
}
