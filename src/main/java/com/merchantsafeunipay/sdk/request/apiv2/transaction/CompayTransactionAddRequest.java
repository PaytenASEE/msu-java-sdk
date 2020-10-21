package com.merchantsafeunipay.sdk.request.apiv2.transaction;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.CompayTransactionAddResponse;

public class CompayTransactionAddRequest extends ApiRequest<CompayTransactionAddResponse> {
    private String paymentSystemTypeName;

    private String customerIp;

    private CompayTransactionAddRequest() {
    }

    public static CompayTransactionAddRequestBuilder builder() {
        return new CompayTransactionAddRequestBuilder();
    }

    @Override
    public Class<CompayTransactionAddResponse> responseClass() {
        return CompayTransactionAddResponse.class;
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
