package com.github.msu.sdk.request.financial;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Param;

public class VoidRequest extends ApiRequest {
	private String pgTranId;
	private String merchantPaymentId;
	private String substatus;
	private String initiatorMerchantBusinessId;

	private VoidRequest(VoidRequestBuilder builder) {
		super();
		this.pgTranId = builder.pgTranId;
		this.merchantPaymentId = builder.merchantPaymentId;
		this.substatus = builder.substatus;
		this.initiatorMerchantBusinessId = builder.initiatorMerchantBusinessId;
	}

	@Override
	public ApiAction apiAction() {
		return ApiAction.VOID;
	}

	@Override
	public void applyRequestParams() {
		addToPayload(Param.PGTRANID, this.pgTranId);
		addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
		addToPayload(Param.SUBSTATUS, this.substatus);
		addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
	}

	public static VoidRequestBuilder builder() {
		return new VoidRequestBuilder();
	}

	public static class VoidRequestBuilder {
		private String pgTranId;
		private String merchantPaymentId;
		private String substatus;
		private String initiatorMerchantBusinessId;

		public VoidRequestBuilder withPgTranId(String pgTranId) {
			this.pgTranId = pgTranId;
			return this;
		}

		public VoidRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
			this.merchantPaymentId = merchantPaymentId;
			return this;
		}

		public VoidRequestBuilder withSubstatus(String substatus) {
			this.substatus = substatus;
			return this;
		}

		public VoidRequestBuilder withInitiatorMerchantBusinessId(String initiatorMerchantBusinessId) {
			this.initiatorMerchantBusinessId = initiatorMerchantBusinessId;
			return this;
		}

		public VoidRequest build() {
			return new VoidRequest(this);
		}
	}
}
