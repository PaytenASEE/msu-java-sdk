package com.github.msu.sdk.request.apiv2.invoice;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.InvoiceDeleteResponse.class
)
public class InvoiceDeleteRequest extends ApiRequest {
    private String dealerCode;

    private String invoiceId;

    private InvoiceDeleteRequest() {
    }

    public static InvoiceDeleteRequestBuilder builder() {
        return new InvoiceDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INVOICEID, this.invoiceId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.INVOICEDELETE;
    }

    public static final class InvoiceDeleteRequestBuilder {
        private String dealerCode;

        private String invoiceId;

        private Authentication authentication;

        public InvoiceDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public InvoiceDeleteRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public InvoiceDeleteRequestBuilder withInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public InvoiceDeleteRequest build() {
            InvoiceDeleteRequest request = new InvoiceDeleteRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.invoiceId = this.invoiceId;
            return request;
        }
    }
}
