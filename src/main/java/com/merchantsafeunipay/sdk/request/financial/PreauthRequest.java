package com.merchantsafeunipay.sdk.request.financial;

import java.util.List;
import java.util.Map;

import com.merchantsafeunipay.sdk.request.model.Point;
import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.response.PreauthResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = PreauthResponse.class)
public class PreauthRequest extends SaleRequest {

	@Override
	public ApiAction apiAction() {
		return ApiAction.PREAUTH;
	}
	
	private PreauthRequest(PreauthRequestBuilder builder) {
		super(builder);
	}

	public static class PreauthRequestBuilder extends SaleRequestBuilder {

		@Override
		public PreauthRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
			this.merchantPaymentId = merchantPaymentId;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCustomer(String customer) {
			this.customer = customer;
			return this;
		}

		@Override
		public PreauthRequestBuilder withAmount(String amount) {
			this.amount = amount;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCurrency(Currency currency) {
			this.currency = currency;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCustomerName(String customerName) {
			this.customerName = customerName;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCustomerIp(String customerIp) {
			this.customerIp = customerIp;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCardHolderPort(String cardHolderPort) {
			this.cardHolderPort = cardHolderPort;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCustomerUserAgent(String customerUserAgent) {
			this.customerUserAgent = customerUserAgent;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCardToken(String cardToken) {
			this.cardToken = cardToken;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCardPan(String cardPan) {
			this.cardPan = cardPan;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCardExpiry(String cardExpiry) {
			this.cardExpiry = cardExpiry;
			return this;
		}

		@Override
		public PreauthRequestBuilder withNameOnCard(String nameOnCard) {
			this.nameOnCard = nameOnCard;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCardCvv(String cardCvv) {
			this.cardCvv = cardCvv;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCustomerPhone(String customerPhone) {
			this.customerPhone = customerPhone;
			return this;
		}

		@Override
		public PreauthRequestBuilder withSaveCard(boolean saveCard) {
			this.saveCard = saveCard;
			return this;
		}

		@Override
		public PreauthRequestBuilder withIsRefundable(boolean isRefundable) {
			this.isRefundable = isRefundable;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCardSaveName(String cardSaveName) {
			this.cardSaveName = cardSaveName;
			return this;
		}

		@Override
		public PreauthRequestBuilder withInstallments(int installments) {
			this.installments = installments;
			return this;
		}

		@Override
		public PreauthRequestBuilder withPaymentSystem(String paymentSystem) {
			this.paymentSystem = paymentSystem;
			return this;
		}

		@Override
		public PreauthRequestBuilder withPoints(List<Point> points) {
			this.points = points;
			return this;
		}

		@Override
		public PreauthRequestBuilder withCampaigns(String campaigns) {
			this.campaigns = campaigns;
			return this;
		}

		@Override
		public PreauthRequestBuilder withBillToPhone(String billToPhone) {
			this.billToPhone = billToPhone;
			return this;
		}

		@Override
		public PreauthRequestBuilder withBillToAddressLine(String billToAddressLine) {
			this.billToAddressLine = billToAddressLine;
			return this;
		}

		@Override
		public PreauthRequestBuilder withBillToCity(String billToCity) {
			this.billToCity = billToCity;
			return this;
		}

		@Override
		public PreauthRequestBuilder withBillToPostalCode(String billToPostalCode) {
			this.billToPostalCode = billToPostalCode;
			return this;
		}

		@Override
		public PreauthRequestBuilder withBillToCountry(String billToCountry) {
			this.billToCountry = billToCountry;
			return this;
		}

		@Override
		public PreauthRequestBuilder withShipToPhone(String shipToPhone) {
			this.shipToPhone = shipToPhone;
			return this;
		}

		@Override
		public PreauthRequestBuilder withShipToAddressLine(String shipToAddressLine) {
			this.shipToAddressLine = shipToAddressLine;
			return this;
		}

		@Override
		public PreauthRequestBuilder withShipToCity(String shipToCity) {
			this.shipToCity = shipToCity;
			return this;
		}

		@Override
		public PreauthRequestBuilder withShipToPostalCode(String shipToPostalCode) {
			this.shipToPostalCode = shipToPostalCode;
			return this;
		}

		@Override
		public PreauthRequestBuilder withShipToCountry(String shipToCountry) {
			this.shipToCountry = shipToCountry;
			return this;
		}

		@Override
		public PreauthRequestBuilder withThreatMetrixSessionId(String threatMetrixSessionId) {
			this.threatMetrixSessionId = threatMetrixSessionId;
			return this;
		}

		@Override
		public PreauthRequestBuilder withThreatMetrixSessionQueryInput(String threatMetrixSessionQueryInput) {
			this.threatMetrixSessionQueryInput = threatMetrixSessionQueryInput;
			return this;
		}

		@Override
		public PreauthRequestBuilder withExtra(Map<String, String> extra) {
			this.extra = extra;
			return this;
		}

		@Override
		public PreauthRequestBuilder withDealerCode(String dealerCode) {
			this.dealerCode = dealerCode;
			return this;
		}

		@Override
		public PreauthRequestBuilder withForGroup(boolean forGroup) {
			this.forGroup = forGroup;
			return this;
		}

		@Override
		public PreauthRequestBuilder withAuthentication(Authentication authentication) {
			this.authentication = authentication;
			return this;
		}

		@Override
		public PreauthRequest build() {
			return new PreauthRequest(this);
		}
	}

	public static PreauthRequestBuilder builder() {
		return new PreauthRequestBuilder();
	}
}
