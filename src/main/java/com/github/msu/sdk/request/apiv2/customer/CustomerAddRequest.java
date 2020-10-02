package com.github.msu.sdk.request.apiv2.customer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.CustomerAddResponse.class
)
public class CustomerAddRequest extends ApiRequest {
    private String customer;

    private String customerEmail;

    private String customerName;

    private String customerPhone;

    private String tckn;

    private String status;

    private CustomerAddRequest() {
    }

    public static CustomerAddRequestBuilder builder() {
        return new CustomerAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERNAME, this.customerName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TCKN, this.tckn);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMERADD;
    }

    public static final class CustomerAddRequestBuilder {
        private String customer;

        private String customerEmail;

        private String customerName;

        private String customerPhone;

        private String tckn;

        private String status;

        private Authentication authentication;

        public CustomerAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomerAddRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public CustomerAddRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public CustomerAddRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerAddRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public CustomerAddRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public CustomerAddRequestBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public CustomerAddRequest build() {
            CustomerAddRequest request = new CustomerAddRequest();
            request.authentication = this.authentication;
            request.customer = this.customer;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            request.tckn = this.tckn;
            request.status = this.status;
            return request;
        }
    }
}
