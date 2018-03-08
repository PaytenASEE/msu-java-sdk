package com.github.msu.sdk.request;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.complex.OrderItem;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.request.enumerated.SessionType;
import com.github.msu.sdk.request.enumerated.SplitPaymentType;
import com.github.msu.sdk.response.SessionTokenResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = SessionTokenResponse.class)
public class SessionTokenRequest extends ApiRequest {
	private String customer;
	private String returnUrl;
	private SessionType sessionType;
	private String merchantPaymentId;
	private BigDecimal amount;
	private Currency currency;
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
	private int maxInstallmentCount;
	private SplitPaymentType splitPaymentType;
	private String billToAddressLine;
	private String billToCity;
	private String billToPostalCode;
	private String billToCountry;
	private String billToPhone;
	private String shipToAddressLine;
	private String shipToCity;
	private String shipToPostalCode;
	private String shipToCountry;
	private String shipToPhone;

	@Override
	public Action action() {
		return Action.SESSIONTOKEN;
	}

	public void applyRequestParams() {
		addToPayload(Param.CUSTOMER, this.customer);
		addToPayload(Param.SESSIONTYPE, this.sessionType);
		addToPayload(Param.RETURNURL, this.returnUrl);
		addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
		addToPayload(Param.AMOUNT, this.amount.toString());
		addToPayload(Param.CURRENCY, this.currency);
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
		addToPayload(Param.MAXINSTALLMENTCOUNT, String.valueOf(this.maxInstallmentCount));
		addToPayload(Param.SPLITPAYMENTTYPE, this.splitPaymentType);
		addToPayload(Param.BILLTOADDRESSLINE, this.billToAddressLine);
		addToPayload(Param.BILLTOCITY, this.billToCity);
		addToPayload(Param.BILLTOPOSTALCODE, this.billToPostalCode);
		addToPayload(Param.BILLTOCOUNTRY, this.billToCountry);
		addToPayload(Param.BILLTOPHONE, this.billToPhone);
		addToPayload(Param.SHIPTOADDRESSLINE, this.shipToAddressLine);
		addToPayload(Param.SHIPTOCITY, this.shipToCity);
		addToPayload(Param.SHIPTOPOSTALCODE, this.shipToPostalCode);
		addToPayload(Param.SHIPTOCOUNTRY, this.shipToCountry);
		addToPayload(Param.SHIPTOPHONE, this.shipToPhone);
	}

	public static class SessionTokenRequestBuilder {
		private String customer;
		private String returnUrl;
		private SessionType sessionType = SessionType.PAYMENTSESSION;
		private String merchantPaymentId;
		private BigDecimal amount;
		private Currency currency;
		private String customerEmail;
		private String customerName;
		private String customerPhone;
		private String customerIp;
		private String customerUserAgent;
		private String sessionExpiry;
		private String language;
		private String campaignCode;
		private List<OrderItem> orderItems = new ArrayList<>();
		private String tmxSessionQueryInput;
		private Map<String, String> extra;
		private int maxInstallmentCount;
		private SplitPaymentType splitPaymentType;
		private String billToAddressLine;
		private String billToCity;
		private String billToPostalCode;
		private String billToCountry;
		private String billToPhone;
		private String shipToAddressLine;
		private String shipToCity;
		private String shipToPostalCode;
		private String shipToCountry;
		private String shipToPhone;
		private Authentication authentication;

		public SessionTokenRequestBuilder withAuthentication(Authentication authentication) {
			this.authentication = authentication;
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

		public SessionTokenRequestBuilder withSessionType(SessionType sessionType) {
			this.sessionType = sessionType;
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

		public SessionTokenRequestBuilder withMaxInstallmentCount(int maxInstallmentCount) {
			this.maxInstallmentCount = maxInstallmentCount;
			return this;
		}

		public SessionTokenRequestBuilder withSplitPaymentType(SplitPaymentType splitPaymentType) {
			this.splitPaymentType = splitPaymentType;
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

		public SessionTokenRequestBuilder withBillToPhone(String billToPhone) {
			this.billToPhone = billToPhone;
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

		public SessionTokenRequest build() {
			return new SessionTokenRequest(this);
		}
	}

	public static SessionTokenRequestBuilder builder() {
		return new SessionTokenRequestBuilder();
	}

	private SessionTokenRequest(SessionTokenRequestBuilder sessionTokenRequestBuilder) {
		this.customer = sessionTokenRequestBuilder.customer;
		this.returnUrl = sessionTokenRequestBuilder.returnUrl;
		this.sessionType = sessionTokenRequestBuilder.sessionType;
		this.merchantPaymentId = sessionTokenRequestBuilder.merchantPaymentId;
		this.amount = sessionTokenRequestBuilder.amount;
		this.currency = sessionTokenRequestBuilder.currency;
		this.customerEmail = sessionTokenRequestBuilder.customerEmail;
		this.customerName = sessionTokenRequestBuilder.customerName;
		this.customerPhone = sessionTokenRequestBuilder.customerPhone;
		this.customerIp = sessionTokenRequestBuilder.customerIp;
		this.customerUserAgent = sessionTokenRequestBuilder.customerUserAgent;
		this.sessionExpiry = sessionTokenRequestBuilder.sessionExpiry;
		this.language = sessionTokenRequestBuilder.language;
		this.campaignCode = sessionTokenRequestBuilder.campaignCode;
		this.orderItems = sessionTokenRequestBuilder.orderItems;
		this.tmxSessionQueryInput = sessionTokenRequestBuilder.tmxSessionQueryInput;
		this.extra = sessionTokenRequestBuilder.extra;
		this.maxInstallmentCount = sessionTokenRequestBuilder.maxInstallmentCount;
		this.splitPaymentType = sessionTokenRequestBuilder.splitPaymentType;
		this.billToAddressLine = sessionTokenRequestBuilder.billToAddressLine;
		this.billToCity = sessionTokenRequestBuilder.billToCity;
		this.billToPostalCode = sessionTokenRequestBuilder.billToPostalCode;
		this.billToCountry = sessionTokenRequestBuilder.billToCountry;
		this.billToPhone = sessionTokenRequestBuilder.billToPhone;
		this.shipToAddressLine = sessionTokenRequestBuilder.shipToAddressLine;
		this.shipToCity = sessionTokenRequestBuilder.shipToCity;
		this.shipToPostalCode = sessionTokenRequestBuilder.shipToPostalCode;
		this.shipToCountry = sessionTokenRequestBuilder.shipToCountry;
		this.shipToPhone = sessionTokenRequestBuilder.shipToPhone;
		this.authentication = sessionTokenRequestBuilder.authentication;
	}
}
