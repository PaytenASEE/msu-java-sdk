package com.github.msu.sdk.request.apiv2.financial;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.FinancialResponse.class
)
public class ExternalRefundRequest extends ApiRequest {
    private String paymentSystem;

    private BigDecimal amount;

    private Currency currency;

    private String customer;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private String tckn;

    private String merchantPaymentId;

    private ExternalRefundRequest() {
    }

    public static ExternalRefundRequestBuilder builder() {
        return new ExternalRefundRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERNAME, this.customerName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TCKN, this.tckn);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
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
            request.merchantPaymentId = this.merchantPaymentId;
            return request;
        }
    }
}
