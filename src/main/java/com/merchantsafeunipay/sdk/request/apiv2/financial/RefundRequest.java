package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.RefundResponse;

import java.math.BigDecimal;
import java.util.Map;

public class RefundRequest extends ApiRequest<RefundResponse> {
    private String pgTranId;
    private BigDecimal amount;
    private Currency currency;
    private String merchantPaymentId;
    private String substatus;
    private String initiatorMerchantBusinessId;
    private Map<String, String> extra;

    public RefundRequest(RefundRequestBuilder builder) {
        super();
        this.pgTranId = builder.pgTranId;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.merchantPaymentId = builder.merchantPaymentId;
        this.substatus = builder.substatus;
        this.initiatorMerchantBusinessId = builder.initiatorMerchantBusinessId;
        this.extra = builder.extra;

    }

    public static RefundRequestBuilder builder() {
        return new RefundRequestBuilder();
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.REFUND;
    }

    @Override
    public Class<RefundResponse> responseClass() {
        return RefundResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.SUBSTATUS, this.substatus);
        addToPayload(Param.EXTRA, this.extra);
    }

    public static class RefundRequestBuilder {
        private String pgTranId;
        private BigDecimal amount;
        private Currency currency;
        private String merchantPaymentId;
        private String substatus;
        private String initiatorMerchantBusinessId;
        private Map<String, String> extra;

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

        public RefundRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public RefundRequest build() {
            return new RefundRequest(this);
        }
    }
}
