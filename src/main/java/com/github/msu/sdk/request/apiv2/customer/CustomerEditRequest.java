package com.github.msu.sdk.request.apiv2.customer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.CustomerEditResponse.class
)
public class CustomerEditRequest extends ApiRequest {
    private String cardToken;

    private String currentcustomerid;

    private String newCustomerId;

    private String customerEmail;

    private String customerName;

    private String customerPhone;

    private String tckn;

    private String status;

    private CustomerEditRequest() {
    }

    public static CustomerEditRequestBuilder builder() {
        return new CustomerEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENTCUSTOMERID, this.currentcustomerid);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NEWCUSTOMERID, this.newCustomerId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMEREMAIL, this.customerEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERNAME, this.customerName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMERPHONE, this.customerPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TCKN, this.tckn);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMEREDIT;
    }

    public static final class CustomerEditRequestBuilder {
        private String cardToken;

        private String currentcustomerid;

        private String newCustomerId;

        private String customerEmail;

        private String customerName;

        private String customerPhone;

        private String tckn;

        private String status;

        private Authentication authentication;

        public CustomerEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomerEditRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public CustomerEditRequestBuilder withCurrentcustomerid(String currentcustomerid) {
            this.currentcustomerid = currentcustomerid;
            return this;
        }

        public CustomerEditRequestBuilder withNewCustomerId(String newCustomerId) {
            this.newCustomerId = newCustomerId;
            return this;
        }

        public CustomerEditRequestBuilder withCustomerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public CustomerEditRequestBuilder withCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public CustomerEditRequestBuilder withCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        public CustomerEditRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public CustomerEditRequestBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public CustomerEditRequest build() {
            CustomerEditRequest request = new CustomerEditRequest();
            request.authentication = this.authentication;
            request.cardToken = this.cardToken;
            request.currentcustomerid = this.currentcustomerid;
            request.newCustomerId = this.newCustomerId;
            request.customerEmail = this.customerEmail;
            request.customerName = this.customerName;
            request.customerPhone = this.customerPhone;
            request.tckn = this.tckn;
            request.status = this.status;
            return request;
        }
    }
}
