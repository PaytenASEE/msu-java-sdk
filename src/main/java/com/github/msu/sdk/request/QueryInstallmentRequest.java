package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryInstallmentResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryInstallmentResponse.class)
public class QueryInstallmentRequest extends ApiRequest {
    private String paymentSystem;
    private String paymentSystemType;
    private String status;

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.STATUS, this.status);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYINSTALLMENT;
    }

    public static QueryInstallmentRequestBuilder builder() {
        return new QueryInstallmentRequestBuilder();
    }

    public static final class QueryInstallmentRequestBuilder {
        private String paymentSystem;
        private String paymentSystemType;
        private String status;

        private QueryInstallmentRequestBuilder() {
        }

        public QueryInstallmentRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryInstallmentRequestBuilder withPaymentSystemType(String paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public QueryInstallmentRequestBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public QueryInstallmentRequest build() {
            QueryInstallmentRequest queryInstallmentRequest = new QueryInstallmentRequest();
            queryInstallmentRequest.paymentSystem = this.paymentSystem;
            queryInstallmentRequest.status = this.status;
            queryInstallmentRequest.paymentSystemType = this.paymentSystemType;
            return queryInstallmentRequest;
        }
    }
}
