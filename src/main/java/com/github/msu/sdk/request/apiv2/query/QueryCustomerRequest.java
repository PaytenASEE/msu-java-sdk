package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryCustomerResponse.class
)
public class QueryCustomerRequest extends ApiRequest {
    private String customer;

    private QueryCustomerRequest() {
    }

    public static QueryCustomerRequestBuilder builder() {
        return new QueryCustomerRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCUSTOMER;
    }

    public static final class QueryCustomerRequestBuilder {
        private String customer;

        private Authentication authentication;

        public QueryCustomerRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryCustomerRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryCustomerRequest build() {
            QueryCustomerRequest request = new QueryCustomerRequest();
            request.authentication = this.authentication;
            request.customer = this.customer;
            return request;
        }
    }
}
