package com.github.msu.sdk.request.apiv2.invoice;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.InvoiceDeleteAllResponse.class
)
public class InvoiceDeleteAllRequest extends ApiRequest {
    private String dealerCode;

    private InvoiceDeleteAllRequest() {
    }

    public static InvoiceDeleteAllRequestBuilder builder() {
        return new InvoiceDeleteAllRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
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
