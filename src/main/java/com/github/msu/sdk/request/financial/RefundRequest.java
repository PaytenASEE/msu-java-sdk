package com.github.msu.sdk.request.financial;

import java.math.BigDecimal;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.request.enumerated.Param;

public class RefundRequest extends ApiRequest {
	private String pgTranId;
	private BigDecimal amount;
	private Currency currency;
	private String merchantPaymentId;
	private String substatus;
	private String initiatorMerchantBusinessId;

	public RefundRequest(RefundRequestBuilder builder) {
		super();
		this.pgTranId = builder.pgTranId;
		this.amount = builder.amount;
		this.currency = builder.currency;
		this.merchantPaymentId = builder.merchantPaymentId;
		this.substatus = builder.substatus;
		this.initiatorMerchantBusinessId = builder.initiatorMerchantBusinessId;
	}
	
	@Override
	public Action action() {
		return Action.REFUND;
	}

	@Override
	public void applyRequestParams() {
		addToPayload(Param.PGTRANID, this.pgTranId);
		addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
		addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
		addToPayload(Param.CURRENCY, this.currency);
		addToPayload(Param.AMOUNT, this.amount);
		addToPayload(Param.SUBSTATUS, this.substatus);
	}

	public static RefundRequestBuilder builder() {
		return new RefundRequestBuilder();
	}
	
	public static class RefundRequestBuilder {
		private String pgTranId;
		private BigDecimal amount;
		private Currency currency;
		private String merchantPaymentId;
		private String substatus;
		private String initiatorMerchantBusinessId;

		public RefundRequestBuilder withPgTranId(String pgTranId) {
			this.pgTranId = pgTranId;
			return this;
		}

		public RefundRequestBuilder withAmount(BigDecimal amount) {
			this.amount = amount;
			return this;
		}

		public RefundRequestBuilder withCurrency(Currency currency) {
			this.currency = currency;
			return this;
		}

		public RefundRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
			this.merchantPaymentId = merchantPaymentId;
			return this;
		}

		public RefundRequestBuilder withSubstatus(String substatus) {
			this.substatus = substatus;
			return this;
		}

		public RefundRequestBuilder withInitiatorMerchantBusinessId(String initiatorMerchantBusinessId) {
			this.initiatorMerchantBusinessId = initiatorMerchantBusinessId;
			return this;
		}

		public RefundRequest build() {
			return new RefundRequest(this);
		}
	}
}
