package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryCustomerResponse;

@ResponseInfo(
        responseClass = QueryCustomerResponse.class
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
        addToPayload(Param.CUSTOMER, this.customer);
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
