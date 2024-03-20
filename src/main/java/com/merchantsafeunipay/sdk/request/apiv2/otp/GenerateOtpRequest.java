package com.merchantsafeunipay.sdk.request.apiv2.otp;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.GenerateOtpResponse;

public class GenerateOtpRequest extends ApiRequest<GenerateOtpResponse> {

    private String paymentSystemType;
    private String merchantPaymentID;
    private String currency;
    private String customer;
    private String customerName;
    private String customerEmail;
    private String otp;
    private String customerPhone;
    private String extra;

    private GenerateOtpRequest() {
    }

    public static GenerateOtpRequestBuilder builder() {
        return new GenerateOtpRequestBuilder();
    }

    @Override
    public Class<GenerateOtpResponse> responseClass() {
        return GenerateOtpResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.PAYMENTSYSTEMTYPE,this.paymentSystemType);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentID);
        addToPayload(Param.CURRENCY, this.currency);
        addToPayload(Param.EXTRA, this.extra);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.GENERATEOTP;
    }

    public static final class GenerateOtpRequestBuilder {

        private String paymentSystemType;
        private String merchantPaymentID;
        private String currency;
        private String customer;
        private String customerName;
        private String customerEmail;
        private String otp;
        private String customerPhone;
        private String extra;
        private Authentication authentication;
        public GenerateOtpRequestBuilder withMerchantPaymentId(String merchantPaymentID) {
            this.merchantPaymentID = merchantPaymentID;
            return this;
        }

        public GenerateOtpRequestBuilder withPaymentSystemType(String paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public GenerateOtpRequestBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public GenerateOtpRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public GenerateOtpRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public GenerateOtpRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public GenerateOtpRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public GenerateOtpRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public GenerateOtpRequestBuilder withOtp(String otp) {
            this.otp = otp;
            return this;
        }

        public GenerateOtpRequestBuilder withExtra(String extra) {
            this.extra = extra;
            return this;
        }

        public GenerateOtpRequest build() {
            GenerateOtpRequest request = new GenerateOtpRequest();
            request.merchantPaymentID = this.merchantPaymentID;
            request.paymentSystemType = this.paymentSystemType;
            request.currency = this.currency;
            request.authentication = this.authentication;
            request.customer = this.customer;
            request.customerName = this.customerName;
            request.customerEmail = this.customerEmail;
            request.customerPhone = this.customerPhone;
            request.otp = this.otp;
            request.extra = this.extra;
            return request;
        }
    }
}