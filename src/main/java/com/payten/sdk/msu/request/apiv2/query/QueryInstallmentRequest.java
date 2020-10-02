package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.PaymentSystemType;
import com.payten.sdk.msu.request.enumerated.Status;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryInstallmentResponse;

@ResponseInfo(
        responseClass = QueryInstallmentResponse.class
)
public class QueryInstallmentRequest extends ApiRequest {
    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private Status status;

    private String dealerTypeName;

    private QueryInstallmentRequest() {
    }

    public static QueryInstallmentRequestBuilder builder() {
        return new QueryInstallmentRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYINSTALLMENT;
    }

    public static final class QueryInstallmentRequestBuilder {
        private String paymentSystem;

        private PaymentSystemType paymentSystemType;

        private Status status;

        private String dealerTypeName;

        private Authentication authentication;

        public QueryInstallmentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryInstallmentRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryInstallmentRequestBuilder withPaymentSystemType(
                PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public QueryInstallmentRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public QueryInstallmentRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryInstallmentRequest build() {
            QueryInstallmentRequest request = new QueryInstallmentRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.paymentSystemType = this.paymentSystemType;
            request.status = this.status;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
