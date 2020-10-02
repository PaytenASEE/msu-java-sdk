package com.payten.sdk.msu.request.apiv2.customer;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.CustomerAddResponse;

@ResponseInfo(
        responseClass = CustomerAddResponse.class
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
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(Param.CUSTOMERNAME, this.customerName);
        addToPayload(Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(Param.TCKN, this.tckn);
        addToPayload(Param.STATUS, this.status);
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
