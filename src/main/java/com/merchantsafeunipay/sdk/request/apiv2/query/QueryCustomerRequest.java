package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryCustomerResponse;

public class QueryCustomerRequest extends ApiRequest<QueryCustomerResponse> {
    private String customer;

    private QueryCustomerRequest() {
    }

    public static QueryCustomerRequestBuilder builder() {
        return new QueryCustomerRequestBuilder();
    }

    @Override
    public Class<QueryCustomerResponse> responseClass() {
        return QueryCustomerResponse.class;
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
