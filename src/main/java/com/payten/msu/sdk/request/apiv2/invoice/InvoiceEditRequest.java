package com.payten.msu.sdk.request.apiv2.invoice;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Currency;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.InvoiceEditResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = InvoiceEditResponse.class
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
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INVOICEID, this.invoiceId);
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.DUEDATE, this.dueDate);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
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
