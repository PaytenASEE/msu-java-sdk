package com.github.msu.sdk.request.apiv2.pbl;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.complex.OrderItem;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.SessionType;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PayByLinkPaymentResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SESSIONEXPIRY, this.sessionExpiry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SESSIONTYPE, this.sessionType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RETURNURL, this.returnUrl);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERNAME, this.customerName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TCKN, this.tckn);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.LANGUAGE, this.language);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ORDERITEMS, this.orderItems);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NOTIFICATIONCHANNELS, this.notificationChannels);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MAXINSTALLMENTCOUNT, this.maxInstallmentCount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BUSINESSMAXINSTALLMENTCOUNT, this.businessMaxInstallmentCount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.EXTRA, this.extra);
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
