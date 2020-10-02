package com.github.msu.sdk.request.apiv2.invoice;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.InvoiceEditResponse.class
)
public class InvoiceEditRequest extends ApiRequest {
    private String dealerCode;

    private String invoiceId;

    private String name;

    private String dueDate;

    private BigDecimal amount;

    private Currency currency;

    private InvoiceEditRequest() {
    }

    public static InvoiceEditRequestBuilder builder() {
        return new InvoiceEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INVOICEID, this.invoiceId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAME, this.name);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DUEDATE, this.dueDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.INVOICEEDIT;
    }

    public static final class InvoiceEditRequestBuilder {
        private String dealerCode;

        private String invoiceId;

        private String name;

        private String dueDate;

        private BigDecimal amount;

        private Currency currency;

        private Authentication authentication;

        public InvoiceEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public InvoiceEditRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public InvoiceEditRequestBuilder withInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public InvoiceEditRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public InvoiceEditRequestBuilder withDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public InvoiceEditRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public InvoiceEditRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public InvoiceEditRequest build() {
            InvoiceEditRequest request = new InvoiceEditRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.invoiceId = this.invoiceId;
            request.name = this.name;
            request.dueDate = this.dueDate;
            request.amount = this.amount;
            request.currency = this.currency;
            return request;
        }
    }
}
