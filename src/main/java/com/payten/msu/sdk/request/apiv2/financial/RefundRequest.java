package com.payten.msu.sdk.request.apiv2.financial;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Currency;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.request.enumerated.TransactionSubStatus;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.response.RefundResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = RefundResponse.class
)
public class RefundRequest extends ApiRequest {
    private BigDecimal amount;

    private Currency currency;

    private String pgTranId;

    private String merchantPaymentId;

    private TransactionSubStatus subStatus;

    private String initiatorMerchantBusinessId;

    private RefundRequest() {
    }

    public static RefundRequestBuilder builder() {
        return new RefundRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.SUBSTATUS, this.subStatus);
        addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.REFUND;
    }

    public static final class RefundRequestBuilder {
        private BigDecimal amount;

        private Currency currency;

        private String pgTranId;

        private String merchantPaymentId;

        private TransactionSubStatus subStatus;

        private String initiatorMerchantBusinessId;

        private Authentication authentication;

        public RefundRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
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

        public RefundRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public RefundRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public RefundRequestBuilder withSubStatus(TransactionSubStatus subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public RefundRequestBuilder withInitiatorMerchantBusinessId(
                String initiatorMerchantBusinessId) {
            this.initiatorMerchantBusinessId = initiatorMerchantBusinessId;
            return this;
        }

        public RefundRequest build() {
            RefundRequest request = new RefundRequest();
            request.authentication = this.authentication;
            request.amount = this.amount;
            request.currency = this.currency;
            request.pgTranId = this.pgTranId;
            request.merchantPaymentId = this.merchantPaymentId;
            request.subStatus = this.subStatus;
            request.initiatorMerchantBusinessId = this.initiatorMerchantBusinessId;
            return request;
        }
    }
}
