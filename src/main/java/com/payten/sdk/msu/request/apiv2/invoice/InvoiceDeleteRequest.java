package com.payten.sdk.msu.request.apiv2.invoice;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.InvoiceDeleteResponse;

@ResponseInfo(
        responseClass = InvoiceDeleteResponse.class
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
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INVOICEID, this.invoiceId);
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