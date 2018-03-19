package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryCustomerResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryCustomerResponse.class)
public class QueryCustomerRequest extends ApiRequest {
    private String customer;

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CUSTOMER, this.customer);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCUSTOMER;
    }

    public static QueryCustomerRequestBuilder builder() {
        return new QueryCustomerRequestBuilder();
    }

    public static final class QueryCustomerRequestBuilder {
        private String customer;

        private QueryCustomerRequestBuilder() {
        }

        public QueryCustomerRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryCustomerRequest build() {
            QueryCustomerRequest queryCustomerRequest = new QueryCustomerRequest();
            queryCustomerRequest.customer = this.customer;
            return queryCustomerRequest;
        }
    }
}
