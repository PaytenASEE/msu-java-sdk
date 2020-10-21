package com.merchantsafeunipay.sdk.request.apiv2.paymentsystem;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.Status;
import com.merchantsafeunipay.sdk.response.PaymentTypeEditResponse;

import java.math.BigDecimal;

public class PaymentTypeEditRequest extends ApiRequest<PaymentTypeEditResponse> {
    private String paymentSystem;

    private String installments;

    private String name;

    private Status status;

    private BigDecimal interestRate;

    private BigDecimal discountRate;

    private BigDecimal commissionRate;

    private String validFrom;

    private String validTo;

    private boolean applyForDebitCreditCard;

    private boolean applyForCreditCard;

    private boolean applyForBusinessCard;

    private Status commissionStatus;

    private PaymentTypeEditRequest() {
    }

    public static PaymentTypeEditRequestBuilder builder() {
        return new PaymentTypeEditRequestBuilder();
    }

    @Override
    public Class<PaymentTypeEditResponse> responseClass() {
        return PaymentTypeEditResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.INTERESTRATE, this.interestRate);
        addToPayload(Param.DISCOUNTRATE, this.discountRate);
        addToPayload(Param.COMMISSIONRATE, this.commissionRate);
        addToPayload(Param.VALIDFROM, this.validFrom);
        addToPayload(Param.VALIDTO, this.validTo);
        addToPayload(Param.APPLYFORDEBITCREDITCARD, this.applyForDebitCreditCard);
        addToPayload(Param.APPLYFORCREDITCARD, this.applyForCreditCard);
        addToPayload(Param.APPLYFORBUSINESSCARD, this.applyForBusinessCard);
        addToPayload(Param.COMMISSIONSTATUS, this.commissionStatus);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PAYMENTTYPEEDIT;
    }

    public static final class PaymentTypeEditRequestBuilder {
        private String paymentSystem;

        private String installments;

        private String name;

        private Status status;

        private BigDecimal interestRate;

        private BigDecimal discountRate;

        private BigDecimal commissionRate;

        private String validFrom;

        private String validTo;

        private boolean applyForDebitCreditCard;

        private boolean applyForCreditCard;

        private boolean applyForBusinessCard;

        private Status commissionStatus;

        private Authentication authentication;

        public PaymentTypeEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentTypeEditRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentTypeEditRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public PaymentTypeEditRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PaymentTypeEditRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public PaymentTypeEditRequestBuilder withInterestRate(BigDecimal interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public PaymentTypeEditRequestBuilder withDiscountRate(BigDecimal discountRate) {
            this.discountRate = discountRate;
            return this;
        }

        public PaymentTypeEditRequestBuilder withCommissionRate(BigDecimal commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }

        public PaymentTypeEditRequestBuilder withValidFrom(String validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public PaymentTypeEditRequestBuilder withValidTo(String validTo) {
            this.validTo = validTo;
            return this;
        }

        public PaymentTypeEditRequestBuilder withApplyForDebitCreditCard(
                boolean applyForDebitCreditCard) {
            this.applyForDebitCreditCard = applyForDebitCreditCard;
            return this;
        }

        public PaymentTypeEditRequestBuilder withApplyForCreditCard(boolean applyForCreditCard) {
            this.applyForCreditCard = applyForCreditCard;
            return this;
        }

        public PaymentTypeEditRequestBuilder withApplyForBusinessCard(boolean applyForBusinessCard) {
            this.applyForBusinessCard = applyForBusinessCard;
            return this;
        }

        public PaymentTypeEditRequestBuilder withCommissionStatus(Status commissionStatus) {
            this.commissionStatus = commissionStatus;
            return this;
        }

        public PaymentTypeEditRequest build() {
            PaymentTypeEditRequest request = new PaymentTypeEditRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.installments = this.installments;
            request.name = this.name;
            request.status = this.status;
            request.interestRate = this.interestRate;
            request.discountRate = this.discountRate;
            request.commissionRate = this.commissionRate;
            request.validFrom = this.validFrom;
            request.validTo = this.validTo;
            request.applyForDebitCreditCard = this.applyForDebitCreditCard;
            request.applyForCreditCard = this.applyForCreditCard;
            request.applyForBusinessCard = this.applyForBusinessCard;
            request.commissionStatus = this.commissionStatus;
            return request;
        }
    }
}
