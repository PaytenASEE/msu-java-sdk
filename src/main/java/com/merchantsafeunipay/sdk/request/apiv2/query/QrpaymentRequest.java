package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QrpaymentResponse;

public class QrpaymentRequest extends ApiRequest<QrpaymentResponse> {
    private String sessionToken;
    private String currency;
    private String amount;
    private String merchantOrderId;
    private String paymentSystemType;

    private QrpaymentRequest() {

    }

    public static QrpaymentRequestBuilder builder() {
        return new QrpaymentRequestBuilder();
    }

    @Override
    public Class<QrpaymentResponse> responseClass() {
        return QrpaymentResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.SESSIONTOKEN, this.sessionToken);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.MERCHANTORDERID, this.merchantOrderId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QRPAYMENT;
    }

    public static final class QrpaymentRequestBuilder {

        private String amount;

        private String currency;

        private String paymentSystemType;

        private String merchantPaymentId;

        private String sessionToken;
        private Authentication authentication;

        public QrpaymentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QrpaymentRequestBuilder withSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        public QrpaymentRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public QrpaymentRequestBuilder withPaymentSystemType(String paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public QrpaymentRequestBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public QrpaymentRequestBuilder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public QrpaymentRequest build() {
            QrpaymentRequest request = new QrpaymentRequest();
            request.authentication = this.authentication;
            request.paymentSystemType = this.paymentSystemType;
            request.merchantOrderId = this.merchantPaymentId;
            request.currency = this.currency;
            request.amount = this.amount;
            request.sessionToken = this.sessionToken;
            return request;
        }

    }
}