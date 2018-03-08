package com.github.msu.sdk.request.financial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.request.model.Point;
import com.github.msu.sdk.response.model.SaleResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = SaleResponse.class)
public class SaleRequest extends ApiRequest {
	protected String merchantPaymentId;
	protected String customer;
	protected String amount;
	protected Currency currency;
	protected String customerEmail;
	protected String customerName;
	protected String customerIp;
	protected String cardHolderPort;
	protected String customerUserAgent;
	protected String cardToken;
	protected String cardPan;
	protected String cardExpiry;
	protected String nameOnCard;
	protected String cardCvv;
	protected String customerPhone;
	protected boolean saveCard;
	protected boolean isRefundable;
	protected boolean isCommissionIncluded;
	protected String cardSaveName;
	protected int installments;
	protected String paymentSystem;
	protected List<Point> points = new ArrayList<>();
	protected String campaigns;
	protected String billToPhone;
	protected String billToAddressLine;
	protected String billToCity;
	protected String billToPostalCode;
	protected String billToCountry;
	protected String shipToPhone;
	protected String shipToAddressLine;
	protected String shipToCity;
	protected String shipToPostalCode;
	protected String shipToCountry;
	protected String threatMetrixSessionId;
	protected String threatMetrixSessionQueryInput;
	protected Map<String, String> extra = new HashMap<>();
	protected String dealerCode;
	protected boolean forGroup;

	protected SaleRequest(SaleRequestBuilder builder) {
		super();
		this.merchantPaymentId = builder.merchantPaymentId;
		this.customer = builder.customer;
		this.amount = builder.amount;
		this.currency = builder.currency;
		this.customerEmail = builder.customerEmail;
		this.customerName = builder.customerName;
		this.customerIp = builder.customerIp;
		this.cardHolderPort = builder.cardHolderPort;
		this.customerUserAgent = builder.customerUserAgent;
		this.cardToken = builder.cardToken;
		this.cardPan = builder.cardPan;
		this.cardExpiry = builder.cardExpiry;
		this.nameOnCard = builder.nameOnCard;
		this.cardCvv = builder.cardCvv;
		this.customerPhone = builder.customerPhone;
		this.saveCard = builder.saveCard;
		this.isRefundable = builder.isRefundable;
		this.isCommissionIncluded = builder.isCommissionIncluded;
		this.cardSaveName = builder.cardSaveName;
		this.installments = builder.installments;
		this.paymentSystem = builder.paymentSystem;
		this.points = builder.points;
		this.campaigns = builder.campaigns;
		this.billToPhone = builder.billToPhone;
		this.billToAddressLine = builder.billToAddressLine;
		this.billToCity = builder.billToCity;
		this.billToPostalCode = builder.billToPostalCode;
		this.billToCountry = builder.billToCountry;
		this.shipToPhone = builder.shipToPhone;
		this.shipToAddressLine = builder.shipToAddressLine;
		this.shipToCity = builder.shipToCity;
		this.shipToPostalCode = builder.shipToPostalCode;
		this.shipToCountry = builder.shipToCountry;
		this.threatMetrixSessionId = builder.threatMetrixSessionId;
		this.threatMetrixSessionQueryInput = builder.threatMetrixSessionQueryInput;
		this.extra = builder.extra;
		this.dealerCode = builder.dealerCode;
		this.forGroup = builder.forGroup;
		this.authentication = builder.authentication;
	}

	@Override
	public Action action() {
		return Action.SALE;
	}
	
	@Override
	public void applyRequestParams() {
		addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
		addToPayload(Param.CUSTOMER, this.customer);
		addToPayload(Param.AMOUNT, this.amount);
		addToPayload(Param.CURRENCY, this.currency);
		addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
		addToPayload(Param.CUSTOMERNAME, this.customerName);
		addToPayload(Param.CUSTOMERIP, this.customerIp);
		addToPayload(Param.CARDHOLDERPORT, this.cardHolderPort);
		addToPayload(Param.CUSTOMERUSERAGENT, this.customerUserAgent);
		addToPayload(Param.CARDTOKEN, this.cardToken);
		addToPayload(Param.CARDPAN, this.cardPan);
		addToPayload(Param.CARDEXPIRY, this.cardExpiry);
		addToPayload(Param.NAMEONCARD, this.nameOnCard);
		addToPayload(Param.CARDCVV, this.cardCvv);
		addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
		addToPayload(Param.SAVECARD, this.saveCard);
		addToPayload(Param.ISREFUNDABLE, this.isRefundable);
		addToPayload(Param.ISCOMMISSIONINCLUDED, this.isCommissionIncluded);
		addToPayload(Param.CARDSAVENAME, this.cardSaveName);
		addToPayload(Param.INSTALLMENTS, this.installments);
		addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
		addToPayload(Param.POINTS, this.points);
		addToPayload(Param.CAMPAIGNS, this.campaigns);
		addToPayload(Param.BILLTOPHONE, this.billToPhone);
		addToPayload(Param.BILLTOADDRESSLINE, this.billToAddressLine);
		addToPayload(Param.BILLTOCITY, this.billToCity);
		addToPayload(Param.BILLTOPOSTALCODE, this.billToPostalCode);
		addToPayload(Param.BILLTOCOUNTRY, this.billToCountry);
		addToPayload(Param.SHIPTOPHONE, this.shipToPhone);
		addToPayload(Param.SHIPTOADDRESSLINE, this.shipToAddressLine);
		addToPayload(Param.SHIPTOCITY, this.shipToCity);
		addToPayload(Param.SHIPTOPOSTALCODE, this.shipToPostalCode);
		addToPayload(Param.SHIPTOCOUNTRY, this.shipToCountry);
		addToPayload(Param.THREATMETRIXSESSIONID, this.threatMetrixSessionId);
		addToPayload(Param.TMXSESSIONQUERYINPUT, this.threatMetrixSessionQueryInput);
		addToPayload(Param.EXTRA, this.extra);
		addToPayload(Param.DEALERCODE, this.dealerCode);
		addToPayload(Param.FORGROUP, this.forGroup);
	}


	public static class SaleRequestBuilder {
		protected Authentication authentication;
		protected String merchantPaymentId;
		protected String customer;
		protected String amount;
		protected Currency currency;
		protected String customerEmail;
		protected String customerName;
		protected String customerIp;
		protected String cardHolderPort;
		protected String customerUserAgent;
		protected String cardToken;
		protected String cardPan;
		protected String cardExpiry;
		protected String nameOnCard;
		protected String cardCvv;
		protected String customerPhone;
		protected boolean saveCard;
		protected boolean isRefundable;
		protected boolean isCommissionIncluded;
		protected String cardSaveName;
		protected int installments = 1;
		protected String paymentSystem;
		protected List<Point> points;
		protected String campaigns;
		protected String billToPhone;
		protected String billToAddressLine;
		protected String billToCity;
		protected String billToPostalCode;
		protected String billToCountry;
		protected String shipToPhone;
		protected String shipToAddressLine;
		protected String shipToCity;
		protected String shipToPostalCode;
		protected String shipToCountry;
		protected String threatMetrixSessionId;
		protected String threatMetrixSessionQueryInput;
		protected Map<String, String> extra;
		protected String dealerCode;
		protected boolean forGroup;
		
		public SaleRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
			this.merchantPaymentId = merchantPaymentId;
			return this;
		}
		
		public SaleRequestBuilder withCustomer(String customer) {
			this.customer = customer;
			return this;
		}
		
		public SaleRequestBuilder withAmount(String amount) {
			this.amount = amount;
			return this;
		}
		
		public SaleRequestBuilder withCurrency(Currency currency) {
			this.currency = currency;
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
		
		public SaleRequestBuilder withCustomerPhone(String customerPhone) {
			this.customerPhone = customerPhone;
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
		
		public SaleRequestBuilder withIsCommissionIncluded(boolean isCommissionIncluded) {
			this.isCommissionIncluded = isCommissionIncluded;
			return this;
		}
		
		public SaleRequestBuilder withCardSaveName(String cardSaveName) {
			this.cardSaveName = cardSaveName;
			return this;
		}
		
		public SaleRequestBuilder withInstallments(int installments) {
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
		
		public SaleRequestBuilder withBillToPhone(String billToPhone) {
			this.billToPhone = billToPhone;
			return this;
		}
		
		public SaleRequestBuilder withBillToAddressLine(String billToAddressLine) {
			this.billToAddressLine = billToAddressLine;
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
		
		public SaleRequestBuilder withShipToPhone(String shipToPhone) {
			this.shipToPhone = shipToPhone;
			return this;
		}
		
		public SaleRequestBuilder withShipToAddressLine(String shipToAddressLine) {
			this.shipToAddressLine = shipToAddressLine;
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
		
		public SaleRequestBuilder withThreatMetrixSessionQueryInput(String threatMetrixSessionQueryInput) {
			this.threatMetrixSessionQueryInput = threatMetrixSessionQueryInput;
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
		
		public SaleRequestBuilder withForGroup(boolean forGroup) {
			this.forGroup = forGroup;
			return this;
		}
		
		public SaleRequestBuilder withAuthentication(Authentication authentication) {
			this.authentication = authentication;
			return this;
		}
		
		public SaleRequest build() {
			return new SaleRequest(this);
		}
	}
	
	public static SaleRequestBuilder builder() {
		return new SaleRequestBuilder();
	}
}
