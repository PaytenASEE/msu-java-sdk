package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QrPaymentResponse;

public class QrPaymentRequest extends ApiRequest<QrPaymentResponse> {
    private String sessionToken;
    private String currency;
    private String amount;
    private String merchantOrderId;
    private String paymentSystemType;

    private QrPaymentRequest() {

    }

    public static QrPaymentRequestBuilder builder() {
        return new QrPaymentRequestBuilder();
    }

    @Override
    public Class<QrPaymentResponse> responseClass() {
        return QrPaymentResponse.class;
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

    public static final class QrPaymentRequestBuilder {

        private String amount;

        private String currency;

        private String paymentSystemType;

        private String merchantPaymentId;

        private String sessionToken;
        private Authentication authentication;

        public QrPaymentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QrPaymentRequestBuilder withSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        public QrPaymentRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public QrPaymentRequestBuilder withPaymentSystemType(String paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public QrPaymentRequestBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public QrPaymentRequestBuilder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public QrPaymentRequest build() {
            QrPaymentRequest request = new QrPaymentRequest();
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