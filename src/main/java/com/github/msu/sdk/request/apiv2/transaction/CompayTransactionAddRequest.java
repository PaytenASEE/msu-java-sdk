package com.github.msu.sdk.request.apiv2.transaction;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.CompayTransactionAddResponse.class
)
public class CompayTransactionAddRequest extends ApiRequest {
    private String paymentSystemTypeName;

    private String customerIp;

    private CompayTransactionAddRequest() {
    }

    public static CompayTransactionAddRequestBuilder builder() {
        return new CompayTransactionAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMTYPENAME, this.paymentSystemTypeName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERIP, this.customerIp);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.COMPAYTRANSACTIONADD;
    }

    public static final class CompayTransactionAddRequestBuilder {
        private String paymentSystemTypeName;

        private String customerIp;

        private Authentication authentication;

        public CompayTransactionAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CompayTransactionAddRequestBuilder withPaymentSystemTypeName(
                String paymentSystemTypeName) {
            this.paymentSystemTypeName = paymentSystemTypeName;
            return this;
        }

        public CompayTransactionAddRequestBuilder withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }

        public CompayTransactionAddRequest build() {
            CompayTransactionAddRequest request = new CompayTransactionAddRequest();
            request.authentication = this.authentication;
            request.paymentSystemTypeName = this.paymentSystemTypeName;
            request.customerIp = this.customerIp;
            return request;
        }
    }
}
