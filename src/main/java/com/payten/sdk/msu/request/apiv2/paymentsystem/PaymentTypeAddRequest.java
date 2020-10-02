package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.Status;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.PaymentTypeAddResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = PaymentTypeAddResponse.class
)
public class PaymentTypeAddRequest extends ApiRequest {
    private String paymentSystem;

    private String name;

    private Status status;

    private String installments;

    private BigDecimal interestRate;

    private BigDecimal discountRate;

    private BigDecimal commissionRate;

    private String validFrom;

    private String validTo;

    private boolean applyForDebitCreditCard;

    private boolean applyForCreditCard;

    private boolean applyForBusinessCard;

    private Status commissionStatus;

    private PaymentTypeAddRequest() {
    }

    public static PaymentTypeAddRequestBuilder builder() {
        return new PaymentTypeAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.INSTALLMENTS, this.installments);
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
        return ApiAction.PAYMENTTYPEADD;
    }

    public static final class PaymentTypeAddRequestBuilder {
        private String paymentSystem;

        private String name;

        private Status status;

        private String installments;

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

        public PaymentTypeAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public PaymentTypeAddRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public PaymentTypeAddRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PaymentTypeAddRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public PaymentTypeAddRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public PaymentTypeAddRequestBuilder withInterestRate(BigDecimal interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public PaymentTypeAddRequestBuilder withDiscountRate(BigDecimal discountRate) {
            this.discountRate = discountRate;
            return this;
        }

        public PaymentTypeAddRequestBuilder withCommissionRate(BigDecimal commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }

        public PaymentTypeAddRequestBuilder withValidFrom(String validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public PaymentTypeAddRequestBuilder withValidTo(String validTo) {
            this.validTo = validTo;
            return this;
        }

        public PaymentTypeAddRequestBuilder withApplyForDebitCreditCard(
                boolean applyForDebitCreditCard) {
            this.applyForDebitCreditCard = applyForDebitCreditCard;
            return this;
        }

        public PaymentTypeAddRequestBuilder withApplyForCreditCard(boolean applyForCreditCard) {
            this.applyForCreditCard = applyForCreditCard;
            return this;
        }

        public PaymentTypeAddRequestBuilder withApplyForBusinessCard(boolean applyForBusinessCard) {
            this.applyForBusinessCard = applyForBusinessCard;
            return this;
        }

        public PaymentTypeAddRequestBuilder withCommissionStatus(Status commissionStatus) {
            this.commissionStatus = commissionStatus;
            return this;
        }

        public PaymentTypeAddRequest build() {
            PaymentTypeAddRequest request = new PaymentTypeAddRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.name = this.name;
            request.status = this.status;
            request.installments = this.installments;
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
