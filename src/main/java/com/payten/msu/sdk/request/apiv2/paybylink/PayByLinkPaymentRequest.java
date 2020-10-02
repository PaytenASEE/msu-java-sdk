package com.payten.msu.sdk.request.apiv2.paybylink;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.complex.OrderItem;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.*;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Currency;
import com.payten.msu.sdk.request.enumerated.SessionType;
import com.payten.msu.sdk.response.PayByLinkPaymentResponse;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ResponseInfo(
        responseClass = PayByLinkPaymentResponse.class
)
public class PayByLinkPaymentRequest extends ApiRequest {
    private String sessionExpiry;

    private SessionType sessionType;

    private String merchantPaymentId;

    private BigDecimal amount;

    private Currency currency;

    private String returnUrl;

    private String customer;

    private String customerEmail;

    private String customerName;

    private String customerPhone;

    private String tckn;

    private String language;

    private List<OrderItem> orderItems;

    private String notificationChannels;

    private String maxInstallmentCount;

    private String businessMaxInstallmentCount;

    private String dealerTypeName;

    private Map<String, String> extra;

    private PayByLinkPaymentRequest() {
    }

    public static PayByLinkPaymentRequestBuilder builder() {
        return new PayByLinkPaymentRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SESSIONEXPIRY, this.sessionExpiry);
        addToPayload(Param.SESSIONTYPE, this.sessionType);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.RETURNURL, this.returnUrl);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.TCKN, this.tckn);
        addToPayload(Param.LANGUAGE, this.language);
        addToPayload(Param.ORDERITEMS, this.orderItems);
        addToPayload(Param.NOTIFICATIONCHANNELS, this.notificationChannels);
        addToPayload(Param.MAXINSTALLMENTCOUNT, this.maxInstallmentCount);
        addToPayload(Param.BUSINESSMAXINSTALLMENTCOUNT, this.businessMaxInstallmentCount);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.EXTRA, this.extra);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYBYLINKPAYMENT;
    }

    public static final class PayByLinkPaymentRequestBuilder {
        private String sessionExpiry;

        private SessionType sessionType;

        private String merchantPaymentId;

        private BigDecimal amount;

        private Currency currency;

        private String returnUrl;

        private String customer;

        private String customerEmail;

        private String customerName;

        private String customerPhone;

        private String tckn;

        private String language;

        private List<OrderItem> orderItems;

        private String notificationChannels;

        private String maxInstallmentCount;

        private String businessMaxInstallmentCount;

        private String dealerTypeName;

        private Map<String, String> extra;

        private Authentication authentication;

        public PayByLinkPaymentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withSessionExpiry(String sessionExpiry) {
            this.sessionExpiry = sessionExpiry;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withSessionType(SessionType sessionType) {
            this.sessionType = sessionType;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withOrderItems(List<OrderItem> orderItems) {
            this.orderItems = orderItems;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withNotificationChannels(String notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withMaxInstallmentCount(String maxInstallmentCount) {
            this.maxInstallmentCount = maxInstallmentCount;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withBusinessMaxInstallmentCount(
                String businessMaxInstallmentCount) {
            this.businessMaxInstallmentCount = businessMaxInstallmentCount;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public PayByLinkPaymentRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public PayByLinkPaymentRequest build() {
            PayByLinkPaymentRequest request = new PayByLinkPaymentRequest();
            request.authentication = this.authentication;
            request.sessionExpiry = this.sessionExpiry;
            request.sessionType = this.sessionType;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amount = this.amount;
            request.currency = this.currency;
            request.returnUrl = this.returnUrl;
            request.customer = this.customer;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            request.tckn = this.tckn;
            request.language = this.language;
            request.orderItems = this.orderItems;
            request.notificationChannels = this.notificationChannels;
            request.maxInstallmentCount = this.maxInstallmentCount;
            request.businessMaxInstallmentCount = this.businessMaxInstallmentCount;
            request.dealerTypeName = this.dealerTypeName;
            request.extra = this.extra;
            return request;
        }
    }
}
