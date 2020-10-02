package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.PaymentTypeEditResponse.class
)
public class PaymentTypeEditRequest extends ApiRequest {
    private String paymentSystem;

    private String installments;

    private String name;

    private Status status;

    private BigDecimal interestRate;

    private BigDecimal discountrate;

    private BigDecimal commissionRate;

    private String validFrom;

    private String validTo;

    private boolean applyForDebitCreditcard;

    private boolean applyForCreditcard;

    private boolean applyForBusinessCard;

    private Status commissionStatus;

    private PaymentTypeEditRequest() {
    }

    public static PaymentTypeEditRequestBuilder builder() {
        return new PaymentTypeEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAME, this.name);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INTERESTRATE, this.interestRate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DISCOUNTRATE, this.discountrate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.COMMISSIONRATE, this.commissionRate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.VALIDFROM, this.validFrom);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.VALIDTO, this.validTo);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.APPLYFORDEBITCREDITCARD, this.applyForDebitCreditcard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.APPLYFORCREDITCARD, this.applyForCreditcard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.APPLYFORBUSINESSCARD, this.applyForBusinessCard);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.COMMISSIONSTATUS, this.commissionStatus);
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

        private BigDecimal discountrate;

        private BigDecimal commissionRate;

        private String validFrom;

        private String validTo;

        private boolean applyForDebitCreditcard;

        private boolean applyForCreditcard;

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

        public PaymentTypeEditRequestBuilder withDiscountrate(BigDecimal discountrate) {
            this.discountrate = discountrate;
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

        public PaymentTypeEditRequestBuilder withApplyForDebitCreditcard(
                boolean applyForDebitCreditcard) {
            this.applyForDebitCreditcard = applyForDebitCreditcard;
            return this;
        }

        public PaymentTypeEditRequestBuilder withApplyForCreditcard(boolean applyForCreditcard) {
            this.applyForCreditcard = applyForCreditcard;
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
            request.discountrate = this.discountrate;
            request.commissionRate = this.commissionRate;
            request.validFrom = this.validFrom;
            request.validTo = this.validTo;
            request.applyForDebitCreditcard = this.applyForDebitCreditcard;
            request.applyForCreditcard = this.applyForCreditcard;
            request.applyForBusinessCard = this.applyForBusinessCard;
            request.commissionStatus = this.commissionStatus;
            return request;
        }
    }
}
