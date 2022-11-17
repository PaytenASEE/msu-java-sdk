package com.merchantsafeunipay.sdk.request.apiv2.session;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.apiv2.financial.PostauthRequest;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.complex.OrderItem;
import com.merchantsafeunipay.sdk.request.enumerated.*;
import com.merchantsafeunipay.sdk.response.SessionTokenResponse;
import com.merchantsafeunipay.sdk.response.model.CustomField;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class SessionTokenRequest extends ApiRequest<SessionTokenResponse> {
    private SessionType sessionType;

    private String customer;

    private String returnUrl;

    private String merchantPaymentId;

    private BigDecimal amount;

    private Currency currency;

    private CardPanType cardPanType;

    private String paymentSystem;

    private String customerEmail;

    private String customerName;

    private String customerPhone;

    private String customerIp;

    private String customerUserAgent;

    private String sessionExpiry;

    private String language;

    private String campaignCode;

    private List<OrderItem> orderItems;

    private String tmxSessionQueryInput;

    private Map<String, String> extra;

    private Map<String, List<String>> extraAsJsonArray;

    private String maxInstallmentCount;

    private String businessMaxInstallmentCount;

    private String installments;

    private String splitPaymentType;

    private String dealerTypeName;

    private String billToAddressLine;

    private String billToCity;

    private String billToPostalCode;

    private String billToCountry;

    private String shipToAddressLine;

    private String shipToCity;

    private String shipToPostalCode;

    private String shipToCountry;

    private String shipToPhone;

    private String billToPhone;

    private List<CustomField> customFields;

    private String merchantOrderId;

    private String paymentSystemType;

    private String cardPan;

    private String setInstallment;

    private String initiatorMerchantBusinessId;

    protected SessionTokenRequest() {
    }

    protected SessionTokenRequest(SessionTokenRequestBuilder builder){
        this.sessionType = builder.sessionType;
        this.returnUrl = builder.returnUrl;
        this.authentication = builder.authentication;
        this.merchantPaymentId = builder.merchantPaymentId;
        this.customer = builder.customer;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.customerEmail = builder.customerEmail;
        this.customerName = builder.customerName;
        this.customerPhone = builder.customerPhone;
        this.customerIp = builder.customerIp;
        this.customerUserAgent = builder.customerUserAgent;
        this.installments = builder.installments;
        this.paymentSystem = builder.paymentSystem;
        this.campaignCode = builder.campaignCode;
        this.billToAddressLine = builder.billToAddressLine;
        this.billToPhone = builder.billToPhone;
        this.billToCity = builder.billToCity;
        this.billToPostalCode = builder.billToPostalCode;
        this.billToCountry = builder.billToCountry;
        this.shipToAddressLine = builder.shipToAddressLine;
        this.shipToPhone = builder.shipToPhone;
        this.shipToCity = builder.shipToCity;
        this.shipToPostalCode = builder.shipToPostalCode;
        this.shipToCountry = builder.shipToCountry;
        this.tmxSessionQueryInput = builder.tmxSessionQueryInput;
        this.extra = builder.extra;
        this.extraAsJsonArray = builder.extraAsJsonArray;
        this.dealerTypeName = builder.dealerTypeName;
        this.customFields = builder.customFields;
        this.cardPanType = builder.cardPanType;
        this.orderItems = builder.orderItems;
        this.paymentSystemType = builder.paymentSystemType;
        this.cardPan = builder.cardPan;
        this.setInstallment = builder.setInstallment;
        this.initiatorMerchantBusinessId = builder.initiatorMerchantBusinessId;
    }

    public static SessionTokenRequestBuilder builder() {
        return new SessionTokenRequestBuilder();
    }

    @Override
    public Class<SessionTokenResponse> responseClass() {
        return SessionTokenResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SESSIONTYPE, this.sessionType);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.RETURNURL, this.returnUrl);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.CARDPANTYPE, this.cardPanType);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.CUSTOMERIP, this.customerIp);
        addToPayload(Param.CUSTOMERUSERAGENT, this.customerUserAgent);
        addToPayload(Param.SESSIONEXPIRY, this.sessionExpiry);
        addToPayload(Param.LANGUAGE, this.language);
        addToPayload(Param.CAMPAIGNCODE, this.campaignCode);
        addToPayload(Param.ORDERITEMS, this.orderItems);
        addToPayload(Param.TMXSESSIONQUERYINPUT, this.tmxSessionQueryInput);
        addToPayload(Param.EXTRA, this.extra);
        addToPayload(Param.EXTRA, this.extraAsJsonArray);
        addToPayload(Param.MAXINSTALLMENTCOUNT, this.maxInstallmentCount);
        addToPayload(Param.BUSINESSMAXINSTALLMENTCOUNT, this.businessMaxInstallmentCount);
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.SPLITPAYMENTTYPE, this.splitPaymentType);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.BILLTOADDRESSLINE, this.billToAddressLine);
        addToPayload(Param.BILLTOCITY, this.billToCity);
        addToPayload(Param.BILLTOPOSTALCODE, this.billToPostalCode);
        addToPayload(Param.BILLTOCOUNTRY, this.billToCountry);
        addToPayload(Param.SHIPTOADDRESSLINE, this.shipToAddressLine);
        addToPayload(Param.SHIPTOCITY, this.shipToCity);
        addToPayload(Param.SHIPTOPOSTALCODE, this.shipToPostalCode);
        addToPayload(Param.SHIPTOCOUNTRY, this.shipToCountry);
        addToPayload(Param.SHIPTOPHONE, this.shipToPhone);
        addToPayload(Param.BILLTOPHONE, this.billToPhone);
        addToPayload(Param.CUSTOMFIELDS, this.customFields);
        addToPayload(Param.MERCHANTORDERID, this.merchantOrderId);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.CARDPAN, this.cardPan);
        addToPayload(Param.SETINSTALLMENT, this.setInstallment);
        addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SESSIONTOKEN;
    }

    public static class SessionTokenRequestBuilder {
        private SessionType sessionType;

        private String customer;

        private String returnUrl;

        private String merchantPaymentId;

        private BigDecimal amount;

        private Currency currency;

        private CardPanType cardPanType;

        private String paymentSystem;

        private String customerEmail;

        private String customerName;

        private String customerPhone;

        private String customerIp;

        private String customerUserAgent;

        private String sessionExpiry;

        private String language;

        private String campaignCode;

        private List<OrderItem> orderItems;

        private String tmxSessionQueryInput;

        private Map<String, String> extra;

        private Map<String, List<String>> extraAsJsonArray;

        private String maxInstallmentCount;

        private String businessMaxInstallmentCount;

        private String installments;

        private String splitPaymentType;

        private String dealerTypeName;

        private String billToAddressLine;

        private String billToCity;

        private String billToPostalCode;

        private String billToCountry;

        private String shipToAddressLine;

        private String shipToCity;

        private String shipToPostalCode;

        private String shipToCountry;

        private String shipToPhone;

        private String billToPhone;

        private Authentication authentication;

        private List<CustomField> customFields;

        private String merchantOrderId;

        private String paymentSystemType;

        private String cardPan;

        private String setInstallment;

        private String initiatorMerchantBusinessId;

        public SessionTokenRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SessionTokenRequestBuilder withSessionType(SessionType sessionType) {
            this.sessionType = sessionType;
            return this;
        }

        public SessionTokenRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public SessionTokenRequestBuilder withReturnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        public SessionTokenRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public SessionTokenRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public SessionTokenRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public SessionTokenRequestBuilder withCardPanType(CardPanType cardPanType) {
            this.cardPanType = cardPanType;
            return this;
        }

        public SessionTokenRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public SessionTokenRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public SessionTokenRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public SessionTokenRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public SessionTokenRequestBuilder withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }

        public SessionTokenRequestBuilder withCustomerUserAgent(String customerUserAgent) {
            this.customerUserAgent = customerUserAgent;
            return this;
        }

        public SessionTokenRequestBuilder withSessionExpiry(String sessionExpiry) {
            this.sessionExpiry = sessionExpiry;
            return this;
        }

        public SessionTokenRequestBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public SessionTokenRequestBuilder withCampaignCode(String campaignCode) {
            this.campaignCode = campaignCode;
            return this;
        }

        public SessionTokenRequestBuilder withOrderItems(List<OrderItem> orderItems) {
            this.orderItems = orderItems;
            return this;
        }

        public SessionTokenRequestBuilder withTmxSessionQueryInput(String tmxSessionQueryInput) {
            this.tmxSessionQueryInput = tmxSessionQueryInput;
            return this;
        }

        public SessionTokenRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public SessionTokenRequestBuilder withExtraAsJsonArray(Map<String, List<String>> extraAsJsonArray) {
            this.extraAsJsonArray = extraAsJsonArray;
            return this;
        }

        public SessionTokenRequestBuilder withMaxInstallmentCount(String maxInstallmentCount) {
            this.maxInstallmentCount = maxInstallmentCount;
            return this;
        }

        public SessionTokenRequestBuilder withBusinessMaxInstallmentCount(
                String businessMaxInstallmentCount) {
            this.businessMaxInstallmentCount = businessMaxInstallmentCount;
            return this;
        }

        public SessionTokenRequestBuilder withInstallments(String installments){
            this.installments= installments;
            return this;
        }

        public SessionTokenRequestBuilder withSplitPaymentType(String splitPaymentType) {
            this.splitPaymentType = splitPaymentType;
            return this;
        }

        public SessionTokenRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public SessionTokenRequestBuilder withBillToAddressLine(String billToAddressLine) {
            this.billToAddressLine = billToAddressLine;
            return this;
        }

        public SessionTokenRequestBuilder withBillToCity(String billToCity) {
            this.billToCity = billToCity;
            return this;
        }

        public SessionTokenRequestBuilder withBillToPostalCode(String billToPostalCode) {
            this.billToPostalCode = billToPostalCode;
            return this;
        }

        public SessionTokenRequestBuilder withBillToCountry(String billToCountry) {
            this.billToCountry = billToCountry;
            return this;
        }

        public SessionTokenRequestBuilder withShipToAddressLine(String shipToAddressLine) {
            this.shipToAddressLine = shipToAddressLine;
            return this;
        }

        public SessionTokenRequestBuilder withShipToCity(String shipToCity) {
            this.shipToCity = shipToCity;
            return this;
        }

        public SessionTokenRequestBuilder withShipToPostalCode(String shipToPostalCode) {
            this.shipToPostalCode = shipToPostalCode;
            return this;
        }

        public SessionTokenRequestBuilder withShipToCountry(String shipToCountry) {
            this.shipToCountry = shipToCountry;
            return this;
        }

        public SessionTokenRequestBuilder withShipToPhone(String shipToPhone) {
            this.shipToPhone = shipToPhone;
            return this;
        }

        public SessionTokenRequestBuilder withBillToPhone(String billToPhone) {
            this.billToPhone = billToPhone;
            return this;
        }

        public SessionTokenRequestBuilder withCustomFields(List<CustomField> customFields){
            this.customFields = customFields;
            return this;
        }

        public SessionTokenRequestBuilder withMerchantOrderId(String merchantOrderId){
            this.merchantOrderId = merchantOrderId;
            return this;
        }

        public SessionTokenRequestBuilder withPaymentSystemType(String paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public SessionTokenRequestBuilder withCardPan(String cardPan){
            this.cardPan = cardPan;
            return this;
        }

        public SessionTokenRequestBuilder withSetInstallment(String setInstallment) {
            this.setInstallment = setInstallment;
            return this;
        }


        public SessionTokenRequestBuilder withInitiatorMerchantBusinessId(String initiatorMerchantBusinessId) {
            this.initiatorMerchantBusinessId = initiatorMerchantBusinessId;
            return this;
        }

        public SessionTokenRequest build() {
            SessionTokenRequest request = new SessionTokenRequest();
            request.authentication = this.authentication;
            request.sessionType = this.sessionType;
            request.customer = this.customer;
            request.returnUrl = this.returnUrl;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amount = this.amount;
            request.currency = this.currency;
            request.cardPanType = this.cardPanType;
            request.paymentSystem = this.paymentSystem;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            request.customerIp = this.customerIp;
            request.customerUserAgent = this.customerUserAgent;
            request.sessionExpiry = this.sessionExpiry;
            request.language = this.language;
            request.campaignCode = this.campaignCode;
            request.orderItems = this.orderItems;
            request.tmxSessionQueryInput = this.tmxSessionQueryInput;
            request.extra = this.extra;
            request.extraAsJsonArray = this.extraAsJsonArray;
            request.maxInstallmentCount = this.maxInstallmentCount;
            request.businessMaxInstallmentCount = this.businessMaxInstallmentCount;
            request.installments = this.installments;
            request.splitPaymentType = this.splitPaymentType;
            request.dealerTypeName = this.dealerTypeName;
            request.billToAddressLine = this.billToAddressLine;
            request.billToCity = this.billToCity;
            request.billToPostalCode = this.billToPostalCode;
            request.billToCountry = this.billToCountry;
            request.shipToAddressLine = this.shipToAddressLine;
            request.shipToCity = this.shipToCity;
            request.shipToPostalCode = this.shipToPostalCode;
            request.shipToCountry = this.shipToCountry;
            request.shipToPhone = this.shipToPhone;
            request.billToPhone = this.billToPhone;
            request.customFields = this.customFields;
            request.merchantOrderId = this.merchantOrderId;
            request.paymentSystemType = this.paymentSystemType;
            request.cardPan = this.cardPan;
            request.setInstallment = this.setInstallment;
            request.initiatorMerchantBusinessId = this.initiatorMerchantBusinessId;
            return request;
        }
    }
}
