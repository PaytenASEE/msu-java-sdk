package com.merchantsafeunipay.sdk.request.apiv2.transaction;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.TransactionType;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.CheckTransactionRuleResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = CheckTransactionRuleResponse.class
)
public class CheckTransactionRuleRequest extends ApiRequest {
    private TransactionType transactionType;

    private String dealerCode;

    private String dealerTypeName;

    private BigDecimal amount;

    private Currency currency;

    private String pgTranIdToRefund;

    private CheckTransactionRuleRequest() {
    }

    public static CheckTransactionRuleRequestBuilder builder() {
        return new CheckTransactionRuleRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.TRANSACTIONTYPE, this.transactionType);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.PGTRANIDTOREFUND, this.pgTranIdToRefund);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CHECKTRANSACTIONRULE;
    }

    public static final class CheckTransactionRuleRequestBuilder {
        private TransactionType transactionType;

        private String dealerCode;

        private String dealerTypeName;

        private BigDecimal amount;

        private Currency currency;

        private String pgTranIdToRefund;

        private Authentication authentication;

        public CheckTransactionRuleRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CheckTransactionRuleRequestBuilder withTransactionType(TransactionType transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public CheckTransactionRuleRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public CheckTransactionRuleRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public CheckTransactionRuleRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public CheckTransactionRuleRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public CheckTransactionRuleRequestBuilder withPgTranIdToRefund(String pgTranIdToRefund) {
            this.pgTranIdToRefund = pgTranIdToRefund;
            return this;
        }

        public CheckTransactionRuleRequest build() {
            CheckTransactionRuleRequest request = new CheckTransactionRuleRequest();
            request.authentication = this.authentication;
            request.transactionType = this.transactionType;
            request.dealerCode = this.dealerCode;
            request.dealerTypeName = this.dealerTypeName;
            request.amount = this.amount;
            request.currency = this.currency;
            request.pgTranIdToRefund = this.pgTranIdToRefund;
            return request;
        }
    }
}
