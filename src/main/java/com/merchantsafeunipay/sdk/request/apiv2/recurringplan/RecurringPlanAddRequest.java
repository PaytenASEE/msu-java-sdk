package com.merchantsafeunipay.sdk.request.apiv2.recurringplan;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Occurrence;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.RecurringPlanAddResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = RecurringPlanAddResponse.class
)
public class RecurringPlanAddRequest extends ApiRequest {
    private String cardToken;

    private String customer;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private String customerIp;

    private String tckn;

    private String recurringPlanCode;

    private BigDecimal firstamount;

    private BigDecimal recurringAmount;

    private BigDecimal recurrenceCount;

    private String frequency;

    private Occurrence occurrence;

    private String startDate;

    private Currency currency;

    private String paymentSystem;

    private String notificationChannels;

    private RecurringPlanAddRequest() {
    }

    public static RecurringPlanAddRequestBuilder builder() {
        return new RecurringPlanAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.CUSTOMERIP, this.customerIp);
        addToPayload(Param.TCKN, this.tckn);
        addToPayload(Param.RECURRINGPLANCODE, this.recurringPlanCode);
        addToPayload(Param.FIRSTAMOUNT, this.firstamount);
        addToPayload(Param.RECURRINGAMOUNT, this.recurringAmount);
        addToPayload(Param.RECURRENCECOUNT, this.recurrenceCount);
        addToPayload(Param.FREQUENCY, this.frequency);
        addToPayload(Param.OCCURRENCE, this.occurrence);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.NOTIFICATIONCHANNELS, this.notificationChannels);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECURRINGPLANADD;
    }

    public static final class RecurringPlanAddRequestBuilder {
        private String cardToken;

        private String customer;

        private String customerName;

        private String customerEmail;

        private String customerPhone;

        private String customerIp;

        private String tckn;

        private String recurringPlanCode;

        private BigDecimal firstamount;

        private BigDecimal recurringAmount;

        private BigDecimal recurrenceCount;

        private String frequency;

        private Occurrence occurrence;

        private String startDate;

        private Currency currency;

        private String paymentSystem;

        private String notificationChannels;

        private Authentication authentication;

        public RecurringPlanAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RecurringPlanAddRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public RecurringPlanAddRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public RecurringPlanAddRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public RecurringPlanAddRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public RecurringPlanAddRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public RecurringPlanAddRequestBuilder withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }

        public RecurringPlanAddRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public RecurringPlanAddRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public RecurringPlanAddRequestBuilder withFirstamount(BigDecimal firstamount) {
            this.firstamount = firstamount;
            return this;
        }

        public RecurringPlanAddRequestBuilder withRecurringAmount(BigDecimal recurringAmount) {
            this.recurringAmount = recurringAmount;
            return this;
        }

        public RecurringPlanAddRequestBuilder withRecurrenceCount(BigDecimal recurrenceCount) {
            this.recurrenceCount = recurrenceCount;
            return this;
        }

        public RecurringPlanAddRequestBuilder withFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }

        public RecurringPlanAddRequestBuilder withOccurrence(Occurrence occurrence) {
            this.occurrence = occurrence;
            return this;
        }

        public RecurringPlanAddRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public RecurringPlanAddRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public RecurringPlanAddRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public RecurringPlanAddRequestBuilder withNotificationChannels(String notificationChannels) {
            this.notificationChannels = notificationChannels;
            return this;
        }

        public RecurringPlanAddRequest build() {
            RecurringPlanAddRequest request = new RecurringPlanAddRequest();
            request.authentication = this.authentication;
            request.cardToken = this.cardToken;
            request.customer = this.customer;
            request.customerName = this.customerName;
            request.customerEmail = this.customerEmail;
            request.customerPhone = this.customerPhone;
            request.customerIp = this.customerIp;
            request.tckn = this.tckn;
            request.recurringPlanCode = this.recurringPlanCode;
            request.firstamount = this.firstamount;
            request.recurringAmount = this.recurringAmount;
            request.recurrenceCount = this.recurrenceCount;
            request.frequency = this.frequency;
            request.occurrence = this.occurrence;
            request.startDate = this.startDate;
            request.currency = this.currency;
            request.paymentSystem = this.paymentSystem;
            request.notificationChannels = this.notificationChannels;
            return request;
        }
    }
}
