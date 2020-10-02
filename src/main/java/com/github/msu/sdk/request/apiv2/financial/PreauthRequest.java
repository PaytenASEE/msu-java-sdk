package com.github.msu.sdk.request.apiv2.financial;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.CardPanType;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.YesNo;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;
import java.util.Map;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PreauthResponse.class
)
public class PreauthRequest extends ApiRequest {
    private String merchantPaymentId;

    private String customer;

    private String cardHolderPort;

    private BigDecimal amount;

    private Currency currency;

    private String auth3dToken;

    private String encryptedData;

    private String cardToken;

    private String cardPan;

    private String cardExpiry;

    private String nameOnCard;

    private String customerEmail;

    private String customerName;

    private String customerPhone;

    private String customerIp;

    private String customerUserAgent;

    private String installments;

    private String paymentSystem;

    private String cardCvv;

    private boolean saveCard;

    private boolean isRefundable;

    private YesNo reflectCommission;

    private String cardSaveName;

    private String billToAddressLine;

    private String billToCity;

    private String billToPostalCode;

    private String billToCountry;

    private String shipToAddressLine;

    private String shipToCity;

    private String shipToPostalCode;

    private String shipToCountry;

    private String threatMetrixSessionId;

    private String tmxSessionQueryInput;

    private Map<String, String> extra;

    private String dealerCode;

    private boolean forGroup;

    private String shipToPhone;

    private String billToPhone;

    private String dealerTypeName;

    private String campaignCode;

    private String customFields;

    private String cardCutoffday;

    private String dealerUserEmail;

    private CardPanType cardPanType;

    private PreauthRequest() {
    }

    public static PreauthRequestBuilder builder() {
        return new PreauthRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDHOLDERPORT, this.cardHolderPort);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AUTH3DTOKEN, this.auth3dToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENCRYPTEDDATA, this.encryptedData);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDPAN, this.cardPan);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAMEONCARD, this.nameOnCard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERNAME, this.customerName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERIP, this.customerIp);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERUSERAGENT, this.customerUserAgent);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDCVV, this.cardCvv);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SAVECARD, this.saveCard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISREFUNDABLE, this.isRefundable);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.REFLECTCOMMISSION, this.reflectCommission);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDSAVENAME, this.cardSaveName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BILLTOADDRESSLINE, this.billToAddressLine);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BILLTOCITY, this.billToCity);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BILLTOPOSTALCODE, this.billToPostalCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BILLTOCOUNTRY, this.billToCountry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SHIPTOADDRESSLINE, this.shipToAddressLine);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SHIPTOCITY, this.shipToCity);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SHIPTOPOSTALCODE, this.shipToPostalCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SHIPTOCOUNTRY, this.shipToCountry);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.THREATMETRIXSESSIONID, this.threatMetrixSessionId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TMXSESSIONQUERYINPUT, this.tmxSessionQueryInput);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.EXTRA, this.extra);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.FORGROUP, this.forGroup);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SHIPTOPHONE, this.shipToPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BILLTOPHONE, this.billToPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CAMPAIGNCODE, this.campaignCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMFIELDS, this.customFields);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDCUTOFFDAY, this.cardCutoffday);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERUSEREMAIL, this.dealerUserEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDPANTYPE, this.cardPanType);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PREAUTH;
    }

    public static final class PreauthRequestBuilder {
        private String merchantPaymentId;

        private String customer;

        private String cardHolderPort;

        private BigDecimal amount;

        private Currency currency;

        private String auth3dToken;

        private String encryptedData;

        private String cardToken;

        private String cardPan;

        private String cardExpiry;

        private String nameOnCard;

        private String customerEmail;

        private String customerName;

        private String customerPhone;

        private String customerIp;

        private String customerUserAgent;

        private String installments;

        private String paymentSystem;

        private String cardCvv;

        private boolean saveCard;

        private boolean isRefundable;

        private YesNo reflectCommission;

        private String cardSaveName;

        private String billToAddressLine;

        private String billToCity;

        private String billToPostalCode;

        private String billToCountry;

        private String shipToAddressLine;

        private String shipToCity;

        private String shipToPostalCode;

        private String shipToCountry;

        private String threatMetrixSessionId;

        private String tmxSessionQueryInput;

        private Map<String, String> extra;

        private String dealerCode;

        private boolean forGroup;

        private String shipToPhone;

        private String billToPhone;

        private String dealerTypeName;

        private String campaignCode;

        private String customFields;

        private String cardCutoffday;

        private String dealerUserEmail;

        private CardPanType cardPanType;

        private Authentication authentication;

        public PreauthRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PreauthRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public PreauthRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public PreauthRequestBuilder withCardHolderPort(String cardHolderPort) {
            this.cardHolderPort = cardHolderPort;
            return this;
        }

        public PreauthRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public PreauthRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public PreauthRequestBuilder withAuth3dToken(String auth3dToken) {
            this.auth3dToken = auth3dToken;
            return this;
        }

        public PreauthRequestBuilder withEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
            return this;
        }

        public PreauthRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public PreauthRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public PreauthRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public PreauthRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public PreauthRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public PreauthRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public PreauthRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public PreauthRequestBuilder withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }

        public PreauthRequestBuilder withCustomerUserAgent(String customerUserAgent) {
            this.customerUserAgent = customerUserAgent;
            return this;
        }

        public PreauthRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public PreauthRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PreauthRequestBuilder withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return this;
        }

        public PreauthRequestBuilder withSaveCard(boolean saveCard) {
            this.saveCard = saveCard;
            return this;
        }

        public PreauthRequestBuilder withIsRefundable(boolean isRefundable) {
            this.isRefundable = isRefundable;
            return this;
        }

        public PreauthRequestBuilder withReflectCommission(YesNo reflectCommission) {
            this.reflectCommission = reflectCommission;
            return this;
        }

        public PreauthRequestBuilder withCardSaveName(String cardSaveName) {
            this.cardSaveName = cardSaveName;
            return this;
        }

        public PreauthRequestBuilder withBillToAddressLine(String billToAddressLine) {
            this.billToAddressLine = billToAddressLine;
            return this;
        }

        public PreauthRequestBuilder withBillToCity(String billToCity) {
            this.billToCity = billToCity;
            return this;
        }

        public PreauthRequestBuilder withBillToPostalCode(String billToPostalCode) {
            this.billToPostalCode = billToPostalCode;
            return this;
        }

        public PreauthRequestBuilder withBillToCountry(String billToCountry) {
            this.billToCountry = billToCountry;
            return this;
        }

        public PreauthRequestBuilder withShipToAddressLine(String shipToAddressLine) {
            this.shipToAddressLine = shipToAddressLine;
            return this;
        }

        public PreauthRequestBuilder withShipToCity(String shipToCity) {
            this.shipToCity = shipToCity;
            return this;
        }

        public PreauthRequestBuilder withShipToPostalCode(String shipToPostalCode) {
            this.shipToPostalCode = shipToPostalCode;
            return this;
        }

        public PreauthRequestBuilder withShipToCountry(String shipToCountry) {
            this.shipToCountry = shipToCountry;
            return this;
        }

        public PreauthRequestBuilder withThreatMetrixSessionId(String threatMetrixSessionId) {
            this.threatMetrixSessionId = threatMetrixSessionId;
            return this;
        }

        public PreauthRequestBuilder withTmxSessionQueryInput(String tmxSessionQueryInput) {
            this.tmxSessionQueryInput = tmxSessionQueryInput;
            return this;
        }

        public PreauthRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public PreauthRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public PreauthRequestBuilder withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public PreauthRequestBuilder withShipToPhone(String shipToPhone) {
            this.shipToPhone = shipToPhone;
            return this;
        }

        public PreauthRequestBuilder withBillToPhone(String billToPhone) {
            this.billToPhone = billToPhone;
            return this;
        }

        public PreauthRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public PreauthRequestBuilder withCampaignCode(String campaignCode) {
            this.campaignCode = campaignCode;
            return this;
        }

        public PreauthRequestBuilder withCustomFields(String customFields) {
            this.customFields = customFields;
            return this;
        }

        public PreauthRequestBuilder withCardCutoffday(String cardCutoffday) {
            this.cardCutoffday = cardCutoffday;
            return this;
        }

        public PreauthRequestBuilder withDealerUserEmail(String dealerUserEmail) {
            this.dealerUserEmail = dealerUserEmail;
            return this;
        }

        public PreauthRequestBuilder withCardPanType(CardPanType cardPanType) {
            this.cardPanType = cardPanType;
            return this;
        }

        public PreauthRequest build() {
            PreauthRequest request = new PreauthRequest();
            request.authentication = this.authentication;
            request.merchantPaymentId = this.merchantPaymentId;
            request.customer = this.customer;
            request.cardHolderPort = this.cardHolderPort;
            request.amount = this.amount;
            request.currency = this.currency;
            request.auth3dToken = this.auth3dToken;
            request.encryptedData = this.encryptedData;
            request.cardToken = this.cardToken;
            request.cardPan = this.cardPan;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            request.customerIp = this.customerIp;
            request.customerUserAgent = this.customerUserAgent;
            request.installments = this.installments;
            request.paymentSystem = this.paymentSystem;
            request.cardCvv = this.cardCvv;
            request.saveCard = this.saveCard;
            request.isRefundable = this.isRefundable;
            request.reflectCommission = this.reflectCommission;
            request.cardSaveName = this.cardSaveName;
            request.billToAddressLine = this.billToAddressLine;
            request.billToCity = this.billToCity;
            request.billToPostalCode = this.billToPostalCode;
            request.billToCountry = this.billToCountry;
            request.shipToAddressLine = this.shipToAddressLine;
            request.shipToCity = this.shipToCity;
            request.shipToPostalCode = this.shipToPostalCode;
            request.shipToCountry = this.shipToCountry;
            request.threatMetrixSessionId = this.threatMetrixSessionId;
            request.tmxSessionQueryInput = this.tmxSessionQueryInput;
            request.extra = this.extra;
            request.dealerCode = this.dealerCode;
            request.forGroup = this.forGroup;
            request.shipToPhone = this.shipToPhone;
            request.billToPhone = this.billToPhone;
            request.dealerTypeName = this.dealerTypeName;
            request.campaignCode = this.campaignCode;
            request.customFields = this.customFields;
            request.cardCutoffday = this.cardCutoffday;
            request.dealerUserEmail = this.dealerUserEmail;
            request.cardPanType = this.cardPanType;
            return request;
        }
    }
}
