package com.merchantsafeunipay.sdk.request.apiv2.financial.internal;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.*;
import com.merchantsafeunipay.sdk.request.model.Point;
import com.merchantsafeunipay.sdk.response.model.CustomField;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class PrimaryTransactionRequest<R> extends ApiRequest<R> {
    private String merchantPaymentId;

    private String customer;

    private BigDecimal amount;

    private Currency currency;

    private String auth3dToken;

    private String customerEmail;

    private String customerName;

    private String customerPhone;

    private String customerIp;

    private String cardHolderPort;

    private String customerUserAgent;

    private String encryptedData;

    private String cardToken;

    private String cardPan;

    private String cardExpiry;

    private String nameOnCard;

    private String cardCvv;

    private String cvv;

    private String cardSaveName;

    private String saveCard;

    private boolean isRefundable = true;

    private YesNo reflectCommission;

    private String installments;

    private String paymentSystem;

    private List<Point> points = new ArrayList<>();

    private String campaigns;

    private String campaignCode;

    private String billToAddressLine;

    private String billToPhone;

    private String billToCity;

    private String billToPostalCode;

    private String billToCountry;

    private String shipToAddressLine;

    private String shipToPhone;

    private String shipToCity;

    private String shipToPostalCode;

    private String shipToCountry;

    private String threatMetrixSessionId;

    private String tmxSessionQueryInput;

    private Map<String, String> extra = new LinkedHashMap<>();

    private String dealerCode;

    private String dealerTypeName;

    private boolean forGroup;

    private List<CustomField> customFields = new ArrayList<>();

    private String cardCutoffDay;

    private String dealerUserEmail;

    private CardPanType cardPanType;

    protected PrimaryTransactionRequest(PrimaryTransactionBuilder builder) {
        this.authentication = builder.authentication;
        this.merchantPaymentId = builder.merchantPaymentId;
        this.customer = builder.customer;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.auth3dToken = builder.auth3dToken;
        this.customerEmail = builder.customerEmail;
        this.customerName = builder.customerName;
        this.customerPhone = builder.customerPhone;
        this.customerIp = builder.customerIp;
        this.cardHolderPort = builder.cardHolderPort;
        this.customerUserAgent = builder.customerUserAgent;
        this.encryptedData = builder.encryptedData;
        this.cardToken = builder.cardToken;
        this.cardPan = builder.cardPan;
        this.cardExpiry = builder.cardExpiry;
        this.nameOnCard = builder.nameOnCard;
        this.cardCvv = builder.cardCvv;
        this.cvv = builder.cvv;
        this.cardSaveName = builder.cardSaveName;
        this.saveCard = builder.saveCard;
        this.isRefundable = builder.isRefundable;
        this.reflectCommission = builder.reflectCommission;
        this.installments = builder.installments;
        this.paymentSystem = builder.paymentSystem;
        this.points = builder.points;
        this.campaigns = builder.campaigns;
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
        this.threatMetrixSessionId = builder.threatMetrixSessionId;
        this.tmxSessionQueryInput = builder.tmxSessionQueryInput;
        this.extra = builder.extra;
        this.dealerCode = builder.dealerCode;
        this.dealerTypeName = builder.dealerTypeName;
        this.forGroup = builder.forGroup;
        this.customFields = builder.customFields;
        this.cardCutoffDay = builder.cardCutoffDay;
        this.dealerUserEmail = builder.dealerUserEmail;
        this.cardPanType = builder.cardPanType;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.AUTH3DTOKEN, this.auth3dToken);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.CUSTOMERIP, this.customerIp);
        addToPayload(Param.CARDHOLDERPORT, this.cardHolderPort);
        addToPayload(Param.CUSTOMERUSERAGENT, this.customerUserAgent);
        addToPayload(Param.ENCRYPTEDDATA, this.encryptedData);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.CARDPAN, this.cardPan);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CARDCVV, this.cardCvv);
        addToPayload(Param.CVV, this.cvv);
        addToPayload(Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(Param.SAVECARD, this.saveCard);
        addToPayload(Param.ISREFUNDABLE, this.isRefundable);
        addToPayload(Param.REFLECTCOMMISSION, this.reflectCommission);
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.POINTS, this.points);
        addToPayload(Param.CAMPAIGNS, this.campaigns);
        addToPayload(Param.CAMPAIGNCODE, this.campaignCode);
        addToPayload(Param.BILLTOADDRESSLINE, this.billToAddressLine);
        addToPayload(Param.BILLTOPHONE, this.billToPhone);
        addToPayload(Param.BILLTOCITY, this.billToCity);
        addToPayload(Param.BILLTOPOSTALCODE, this.billToPostalCode);
        addToPayload(Param.BILLTOCOUNTRY, this.billToCountry);
        addToPayload(Param.SHIPTOADDRESSLINE, this.shipToAddressLine);
        addToPayload(Param.SHIPTOPHONE, this.shipToPhone);
        addToPayload(Param.SHIPTOCITY, this.shipToCity);
        addToPayload(Param.SHIPTOPOSTALCODE, this.shipToPostalCode);
        addToPayload(Param.SHIPTOCOUNTRY, this.shipToCountry);
        addToPayload(Param.THREATMETRIXSESSIONID, this.threatMetrixSessionId);
        addToPayload(Param.TMXSESSIONQUERYINPUT, this.tmxSessionQueryInput);
        addToPayload(Param.EXTRA, this.extra);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.FORGROUP, this.forGroup);
        addToPayload(Param.CUSTOMFIELDS, this.customFields);
        addToPayload(Param.CARDCUTOFFDAY, this.cardCutoffDay);
        addToPayload(Param.DEALERUSEREMAIL, this.dealerUserEmail);
        addToPayload(Param.CARDPANTYPE, this.cardPanType);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SALE;
    }

    public static abstract class PrimaryTransactionBuilder<B extends PrimaryTransactionBuilder<B>> {
        String merchantPaymentId;

        String customer;

        BigDecimal amount;

        Currency currency;

        String auth3dToken;

        String customerEmail;

        String customerName;

        String customerPhone;

        String customerIp;

        String cardHolderPort;

        String customerUserAgent;

        String encryptedData;

        String cardToken;

        String cardPan;

        String cardExpiry;

        String nameOnCard;

        String cardCvv;

        String cvv;

        String cardSaveName;

        String saveCard;

        boolean isRefundable = true;

        YesNo reflectCommission;

        String installments;

        String paymentSystem;

        List<Point> points = new ArrayList<>();

        String campaigns;

        String campaignCode;

        String billToAddressLine;

        String billToPhone;

        String billToCity;

        String billToPostalCode;

        String billToCountry;

        String shipToAddressLine;

        String shipToPhone;

        String shipToCity;

        String shipToPostalCode;

        String shipToCountry;

        String threatMetrixSessionId;

        String tmxSessionQueryInput;

        Map<String, String> extra = new LinkedHashMap<>();

        String dealerCode;

        String dealerTypeName;

        boolean forGroup;

        List<CustomField> customFields = new ArrayList<>();

        String cardCutoffDay;

        String dealerUserEmail;

        CardPanType cardPanType;

        Authentication authentication;

        public abstract PrimaryTransactionRequest build();

        public abstract B self();

        public B withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return self();
        }

        public B withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return self();
        }

        public B withCustomer(String customer) {
            this.customer = customer;
            return self();
        }

        public B withAmount(BigDecimal amount) {
            this.amount = amount;
            return self();
        }

        public B withCurrency(Currency currency) {
            this.currency = currency;
            return self();
        }

        public B withAuth3dToken(String auth3dToken) {
            this.auth3dToken = auth3dToken;
            return self();
        }

        public B withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return self();
        }

        public B withCustomerName(String customerName) {
            this.customerName = customerName;
            return self();
        }

        public B withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return self();
        }

        public B withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return self();
        }

        public B withCardHolderPort(String cardHolderPort) {
            this.cardHolderPort = cardHolderPort;
            return self();
        }

        public B withCustomerUserAgent(String customerUserAgent) {
            this.customerUserAgent = customerUserAgent;
            return self();
        }

        public B withEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
            return self();
        }

        public B withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return self();
        }

        public B withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return self();
        }

        public B withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return self();
        }

        public B withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return self();
        }

        public B withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return self();
        }

        public B withCvv(String cardCvv) {
            this.cvv = cvv;
            return self();
        }

        public B withCardSaveName(String cardSaveName) {
            this.cardSaveName = cardSaveName;
            return self();
        }

        public B withSaveCard(String saveCard) {
            this.saveCard = saveCard;
            return self();
        }

        public B withIsRefundable(boolean isRefundable) {
            this.isRefundable = isRefundable;
            return self();
        }

        public B withReflectCommission(YesNo reflectCommission) {
            this.reflectCommission = reflectCommission;
            return self();
        }

        public B withInstallments(String installments) {
            this.installments = installments;
            return self();
        }

        public B withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return self();
        }

        public B withPoints(List<Point> points) {
            this.points = points;
            return self();
        }

        public B withCampaigns(String campaigns) {
            this.campaigns = campaigns;
            return self();
        }

        public B withCampaignCode(String campaignCode) {
            this.campaignCode = campaignCode;
            return self();
        }

        public B withBillToAddressLine(String billToAddressLine) {
            this.billToAddressLine = billToAddressLine;
            return self();
        }

        public B withBillToPhone(String billToPhone) {
            this.billToPhone = billToPhone;
            return self();
        }

        public B withBillToCity(String billToCity) {
            this.billToCity = billToCity;
            return self();
        }

        public B withBillToPostalCode(String billToPostalCode) {
            this.billToPostalCode = billToPostalCode;
            return self();
        }

        public B withBillToCountry(String billToCountry) {
            this.billToCountry = billToCountry;
            return self();
        }

        public B withShipToAddressLine(String shipToAddressLine) {
            this.shipToAddressLine = shipToAddressLine;
            return self();
        }

        public B withShipToPhone(String shipToPhone) {
            this.shipToPhone = shipToPhone;
            return self();
        }

        public B withShipToCity(String shipToCity) {
            this.shipToCity = shipToCity;
            return self();
        }

        public B withShipToPostalCode(String shipToPostalCode) {
            this.shipToPostalCode = shipToPostalCode;
            return self();
        }

        public B withShipToCountry(String shipToCountry) {
            this.shipToCountry = shipToCountry;
            return self();
        }

        public B withThreatMetrixSessionId(String threatMetrixSessionId) {
            this.threatMetrixSessionId = threatMetrixSessionId;
            return self();
        }

        public B withTmxSessionQueryInput(String tmxSessionQueryInput) {
            this.tmxSessionQueryInput = tmxSessionQueryInput;
            return self();
        }

        public B withExtra(Map<String, String> extra) {
            this.extra = extra;
            return self();
        }

        public B withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return self();
        }

        public B withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return self();
        }

        public B withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return self();
        }

        public B withCustomFields(List<CustomField> customFields) {
            this.customFields = customFields;
            return self();
        }

        public B withCardCutOffDay(String cardCutoffDay) {
            this.cardCutoffDay = cardCutoffDay;
            return self();
        }

        public B withDealerUserEmail(String dealerUserEmail) {
            this.dealerUserEmail = dealerUserEmail;
            return self();
        }

        public B withCardPanType(CardPanType cardPanType) {
            this.cardPanType = cardPanType;
            return self();
        }
    }
}
