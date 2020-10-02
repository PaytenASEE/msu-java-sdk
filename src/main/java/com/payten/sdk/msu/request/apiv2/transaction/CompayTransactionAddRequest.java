package com.payten.sdk.msu.request.apiv2.transaction;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.CompayTransactionAddResponse;

@ResponseInfo(
        responseClass = CompayTransactionAddResponse.class
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
        addToPayload(Param.PAYMENTSYSTEMTYPENAME, this.paymentSystemTypeName);
        addToPayload(Param.CUSTOMERIP, this.customerIp);
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
