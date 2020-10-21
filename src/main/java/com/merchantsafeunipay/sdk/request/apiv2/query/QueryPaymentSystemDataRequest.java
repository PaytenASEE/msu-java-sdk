package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.PaymentSystemType;
import com.merchantsafeunipay.sdk.response.QueryPaymentSystemDataResponse;

import java.math.BigDecimal;

public class QueryPaymentSystemDataRequest extends ApiRequest<QueryPaymentSystemDataResponse> {
    private String installments;

    private String bin;

    private PaymentSystemType paymentSystemType;

    private String eftCode;

    private BigDecimal amount;

    private String dealerTypeName;

    private QueryPaymentSystemDataRequest() {
    }

    public static QueryPaymentSystemDataRequestBuilder builder() {
        return new QueryPaymentSystemDataRequestBuilder();
    }

    @Override
    public Class<QueryPaymentSystemDataResponse> responseClass() {
        return QueryPaymentSystemDataResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.BIN, this.bin);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.EFTCODE, this.eftCode);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPAYMENTSYSTEMDATA;
    }

    public static final class QueryPaymentSystemDataRequestBuilder {
        private String installments;

        private String bin;

        private PaymentSystemType paymentSystemType;

        private String eftCode;

        private BigDecimal amount;

        private String dealerTypeName;

        private Authentication authentication;

        public QueryPaymentSystemDataRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPaymentSystemDataRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public QueryPaymentSystemDataRequestBuilder withBin(String bin) {
            this.bin = bin;
            return this;
        }

        public QueryPaymentSystemDataRequestBuilder withPaymentSystemType(
                PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public QueryPaymentSystemDataRequestBuilder withEftCode(String eftCode) {
            this.eftCode = eftCode;
            return this;
        }

        public QueryPaymentSystemDataRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public QueryPaymentSystemDataRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryPaymentSystemDataRequest build() {
            QueryPaymentSystemDataRequest request = new QueryPaymentSystemDataRequest();
            request.authentication = this.authentication;
            request.installments = this.installments;
            request.bin = this.bin;
            request.paymentSystemType = this.paymentSystemType;
            request.eftCode = this.eftCode;
            request.amount = this.amount;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
