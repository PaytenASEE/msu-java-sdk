package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.CardPanType;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.FinancialResponse;

import java.math.BigDecimal;
import java.util.Map;

@ResponseInfo(
        responseClass = FinancialResponse.class
)
public class DetachedRefundRequest extends ApiRequest {
    private String merchantPaymentId;

    private BigDecimal amount;

    private Currency currency;

    private String paymentSystem;

    private String installments;

    private String customer;

    private String customerName;

    private String customerEmail;

    private String customerPhone;

    private String cardToken;

    private String nameOnCard;

    private String cardPan;

    private String cardExpiry;

    private String cardCvv;

    private CardPanType cardPanType;

    private Map<String, String> extra;

    private DetachedRefundRequest() {
    }

    public static DetachedRefundRequestBuilder builder() {
        return new DetachedRefundRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.NAMEONCARD, this.nameOnCard);
        addToPayload(Param.CARDPAN, this.cardPan);
        addToPayload(Param.CARDEXPIRY, this.cardExpiry);
        addToPayload(Param.CARDCVV, this.cardCvv);
        addToPayload(Param.CARDPANTYPE, this.cardPanType);
        addToPayload(Param.EXTRA, this.extra);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DETACHEDREFUND;
    }

    public static final class DetachedRefundRequestBuilder {
        private String merchantPaymentId;

        private BigDecimal amount;

        private Currency currency;

        private String paymentSystem;

        private String installments;

        private String customer;

        private String customerName;

        private String customerEmail;

        private String customerPhone;

        private String cardToken;

        private String nameOnCard;

        private String cardPan;

        private String cardExpiry;

        private String cardCvv;

        private CardPanType cardPanType;

        private Map<String, String> extra;

        private Authentication authentication;

        public DetachedRefundRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DetachedRefundRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public DetachedRefundRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public DetachedRefundRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public DetachedRefundRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public DetachedRefundRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public DetachedRefundRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public DetachedRefundRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public DetachedRefundRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public DetachedRefundRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public DetachedRefundRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public DetachedRefundRequestBuilder withNameOnCard(String nameOnCard) {
            this.nameOnCard = nameOnCard;
            return this;
        }

        public DetachedRefundRequestBuilder withCardPan(String cardPan) {
            this.cardPan = cardPan;
            return this;
        }

        public DetachedRefundRequestBuilder withCardExpiry(String cardExpiry) {
            this.cardExpiry = cardExpiry;
            return this;
        }

        public DetachedRefundRequestBuilder withCardCvv(String cardCvv) {
            this.cardCvv = cardCvv;
            return this;
        }

        public DetachedRefundRequestBuilder withCardPanType(CardPanType cardPanType) {
            this.cardPanType = cardPanType;
            return this;
        }

        public DetachedRefundRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public DetachedRefundRequest build() {
            DetachedRefundRequest request = new DetachedRefundRequest();
            request.authentication = this.authentication;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amount = this.amount;
            request.currency = this.currency;
            request.paymentSystem = this.paymentSystem;
            request.installments = this.installments;
            request.customer = this.customer;
            request.customerName = this.customerName;
            request.customerEmail = this.customerEmail;
            request.customerPhone = this.customerPhone;
            request.cardToken = this.cardToken;
            request.nameOnCard = this.nameOnCard;
            request.cardPan = this.cardPan;
            request.cardExpiry = this.cardExpiry;
            request.cardCvv = this.cardCvv;
            request.cardPanType = this.cardPanType;
            request.extra = this.extra;
            return request;
        }
    }
}
