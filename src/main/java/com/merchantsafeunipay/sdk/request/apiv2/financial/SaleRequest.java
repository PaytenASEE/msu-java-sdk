package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.CardPanType;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.YesNo;
import com.merchantsafeunipay.sdk.request.model.Point;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.response.SaleResponse;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@ResponseInfo(
        responseClass = SaleResponse.class
)
public class SaleRequest extends ApiRequest {
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

    private String cardSaveName;

    private boolean saveCard;

    private boolean isRefundable = true;

    private YesNo reflectCommission;

    private String installments;

    private String paymentSystem;

    private List<Point> points;

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

    private Map<String, String> extra;

    private String dealerCode;

    private String dealerTypeName;

    private boolean forGroup;

    private String customFields;

    private String cardCutoffDay;

    private String dealerUserEmail;

    private CardPanType cardPanType;

    private SaleRequest() {
    }

    public static SaleRequestBuilder builder() {
        return new SaleRequestBuilder();
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

    public static final class SaleRequestBuilder {
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

        private String cardSaveName;

        private boolean saveCard;

        private boolean isRefundable = true;

        private YesNo reflectCommission;

        private String installments;

        private String paymentSystem;

        private List<Point> points;

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

        private Map<String, String> extra;

        private String dealerCode;

        private String dealerTypeName;

        private boolean forGroup;

        private String customFields;

        private String cardCutoffDay;

        private String dealerUserEmail;

        private CardPanType cardPanType;

        private Authentication authentication;

        public SaleRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SaleRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public SaleRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public SaleRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public SaleRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public SaleRequestBuilder withAuth3dToken(String auth3dToken) {
            this.auth3dToken = auth3dToken;
            return this;
        }

        public SaleRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public SaleRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public SaleRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public SaleRequestBuilder withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }

        public SaleRequestBuilder withCardHolderPort(String cardHolderPort) {
            this.cardHolderPort = cardHolderPort;
            return this;
        }

        public SaleRequestBuilder withCustomerUserAgent(String customerUserAgent) {
            this.customerUserAgent = customerUserAgent;
            return this;
        }

        public SaleRequestBuilder withEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
            return this;
        }

        public SaleRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public SaleRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public SaleRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public SaleRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public SaleRequestBuilder withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return this;
        }

        public SaleRequestBuilder withCardSaveName(String cardSaveName) {
            this.cardSaveName = cardSaveName;
            return this;
        }

        public SaleRequestBuilder withSaveCard(boolean saveCard) {
            this.saveCard = saveCard;
            return this;
        }

        public SaleRequestBuilder withIsRefundable(boolean isRefundable) {
            this.isRefundable = isRefundable;
            return this;
        }

        public SaleRequestBuilder withReflectCommission(YesNo reflectCommission) {
            this.reflectCommission = reflectCommission;
            return this;
        }

        public SaleRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public SaleRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public SaleRequestBuilder withPoints(List<Point> points) {
            this.points = points;
            return this;
        }

        public SaleRequestBuilder withCampaigns(String campaigns) {
            this.campaigns = campaigns;
            return this;
        }

        public SaleRequestBuilder withCampaignCode(String campaignCode) {
            this.campaignCode = campaignCode;
            return this;
        }

        public SaleRequestBuilder withBillToAddressLine(String billToAddressLine) {
            this.billToAddressLine = billToAddressLine;
            return this;
        }

        public SaleRequestBuilder withBillToPhone(String billToPhone) {
            this.billToPhone = billToPhone;
            return this;
        }

        public SaleRequestBuilder withBillToCity(String billToCity) {
            this.billToCity = billToCity;
            return this;
        }

        public SaleRequestBuilder withBillToPostalCode(String billToPostalCode) {
            this.billToPostalCode = billToPostalCode;
            return this;
        }

        public SaleRequestBuilder withBillToCountry(String billToCountry) {
            this.billToCountry = billToCountry;
            return this;
        }

        public SaleRequestBuilder withShipToAddressLine(String shipToAddressLine) {
            this.shipToAddressLine = shipToAddressLine;
            return this;
        }

        public SaleRequestBuilder withShipToPhone(String shipToPhone) {
            this.shipToPhone = shipToPhone;
            return this;
        }

        public SaleRequestBuilder withShipToCity(String shipToCity) {
            this.shipToCity = shipToCity;
            return this;
        }

        public SaleRequestBuilder withShipToPostalCode(String shipToPostalCode) {
            this.shipToPostalCode = shipToPostalCode;
            return this;
        }

        public SaleRequestBuilder withShipToCountry(String shipToCountry) {
            this.shipToCountry = shipToCountry;
            return this;
        }

        public SaleRequestBuilder withThreatMetrixSessionId(String threatMetrixSessionId) {
            this.threatMetrixSessionId = threatMetrixSessionId;
            return this;
        }

        public SaleRequestBuilder withTmxSessionQueryInput(String tmxSessionQueryInput) {
            this.tmxSessionQueryInput = tmxSessionQueryInput;
            return this;
        }

        public SaleRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public SaleRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public SaleRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public SaleRequestBuilder withForGroup(boolean forGroup) {
            this.forGroup = forGroup;
            return this;
        }

        public SaleRequestBuilder withCustomFields(String customFields) {
            this.customFields = customFields;
            return this;
        }

        public SaleRequestBuilder withCardCutOffDay(String cardCutoffDay) {
            this.cardCutoffDay = cardCutoffDay;
            return this;
        }

        public SaleRequestBuilder withDealerUserEmail(String dealerUserEmail) {
            this.dealerUserEmail = dealerUserEmail;
            return this;
        }

        public SaleRequestBuilder withCardPanType(CardPanType cardPanType) {
            this.cardPanType = cardPanType;
            return this;
        }

        public SaleRequest build() {
            SaleRequest request = new SaleRequest();
            request.authentication = this.authentication;
            request.merchantPaymentId = this.merchantPaymentId;
            request.customer = this.customer;
            request.amount = this.amount;
            request.currency = this.currency;
            request.auth3dToken = this.auth3dToken;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            request.customerIp = this.customerIp;
            request.cardHolderPort = this.cardHolderPort;
            request.customerUserAgent = this.customerUserAgent;
            request.encryptedData = this.encryptedData;
            request.cardToken = this.cardToken;
            request.cardPan = this.cardPan;
            request.cardExpiry = this.cardExpiry;
            request.nameOnCard = this.nameOnCard;
            request.cardCvv = this.cardCvv;
            request.cardSaveName = this.cardSaveName;
            request.saveCard = this.saveCard;
            request.isRefundable = this.isRefundable;
            request.reflectCommission = this.reflectCommission;
            request.installments = this.installments;
            request.paymentSystem = this.paymentSystem;
            request.points = this.points;
            request.campaigns = this.campaigns;
            request.campaignCode = this.campaignCode;
            request.billToAddressLine = this.billToAddressLine;
            request.billToPhone = this.billToPhone;
            request.billToCity = this.billToCity;
            request.billToPostalCode = this.billToPostalCode;
            request.billToCountry = this.billToCountry;
            request.shipToAddressLine = this.shipToAddressLine;
            request.shipToPhone = this.shipToPhone;
            request.shipToCity = this.shipToCity;
            request.shipToPostalCode = this.shipToPostalCode;
            request.shipToCountry = this.shipToCountry;
            request.threatMetrixSessionId = this.threatMetrixSessionId;
            request.tmxSessionQueryInput = this.tmxSessionQueryInput;
            request.extra = this.extra;
            request.dealerCode = this.dealerCode;
            request.dealerTypeName = this.dealerTypeName;
            request.forGroup = this.forGroup;
            request.customFields = this.customFields;
            request.cardCutoffDay = this.cardCutoffDay;
            request.dealerUserEmail = this.dealerUserEmail;
            request.cardPanType = this.cardPanType;
            return request;
        }
    }
}
