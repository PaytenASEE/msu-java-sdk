package com.merchantsafeunipay.sdk.request.apiv2.invoice;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.InvoiceDeleteAllResponse;

public class InvoiceDeleteAllRequest extends ApiRequest<InvoiceDeleteAllResponse> {
    private String dealerCode;

    private InvoiceDeleteAllRequest() {
    }

    public static InvoiceDeleteAllRequestBuilder builder() {
        return new InvoiceDeleteAllRequestBuilder();
    }

    @Override
    public Class<InvoiceDeleteAllResponse> responseClass() {
        return InvoiceDeleteAllResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.INVOICEDELETEALL;
    }

    public static final class InvoiceDeleteAllRequestBuilder {
        private String dealerCode;

        private Authentication authentication;

        public InvoiceDeleteAllRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public InvoiceDeleteAllRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public InvoiceDeleteAllRequest build() {
            InvoiceDeleteAllRequest request = new InvoiceDeleteAllRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            return request;
        }
    }
}
