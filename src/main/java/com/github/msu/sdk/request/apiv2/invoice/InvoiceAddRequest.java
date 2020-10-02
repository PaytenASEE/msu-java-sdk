package com.github.msu.sdk.request.apiv2.invoice;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.InvoiceAddResponse.class
)
public class InvoiceAddRequest extends ApiRequest {
    private String dealerCode;

    private String invoiceId;

    private String name;

    private String issueDate;

    private String dueDate;

    private BigDecimal amount;

    private BigDecimal originalamount;

    private Currency currency;

    private String dealerTypeName;

    private InvoiceAddRequest() {
    }

    public static InvoiceAddRequestBuilder builder() {
        return new InvoiceAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INVOICEID, this.invoiceId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAME, this.name);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISSUEDATE, this.issueDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DUEDATE, this.dueDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ORIGINALAMOUNT, this.originalamount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.INVOICEADD;
    }

    public static final class InvoiceAddRequestBuilder {
        private String dealerCode;

        private String invoiceId;

        private String name;

        private String issueDate;

        private String dueDate;

        private BigDecimal amount;

        private BigDecimal originalamount;

        private Currency currency;

        private String dealerTypeName;

        private Authentication authentication;

        public InvoiceAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public InvoiceAddRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public InvoiceAddRequestBuilder withInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public InvoiceAddRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public InvoiceAddRequestBuilder withIssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public InvoiceAddRequestBuilder withDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public InvoiceAddRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public InvoiceAddRequestBuilder withOriginalamount(BigDecimal originalamount) {
            this.originalamount = originalamount;
            return this;
        }

        public InvoiceAddRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public InvoiceAddRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public InvoiceAddRequest build() {
            InvoiceAddRequest request = new InvoiceAddRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.invoiceId = this.invoiceId;
            request.name = this.name;
            request.issueDate = this.issueDate;
            request.dueDate = this.dueDate;
            request.amount = this.amount;
            request.originalamount = this.originalamount;
            request.currency = this.currency;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
