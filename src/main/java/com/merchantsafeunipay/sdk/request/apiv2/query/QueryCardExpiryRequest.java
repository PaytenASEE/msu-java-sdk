package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryCardExpiryResponse;

public class QueryCardExpiryRequest extends ApiRequest<QueryCardExpiryResponse> {
    private String customer;

    private String offset;

    private String limit;

    private QueryCardExpiryRequest() {
    }

    public static QueryCardExpiryRequestBuilder builder() {
        return new QueryCardExpiryRequestBuilder();
    }

    @Override
    public Class<QueryCardExpiryResponse> responseClass() {
        return QueryCardExpiryResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.OFFSET, this.offset);
        addToPayload(Param.LIMIT, this.limit);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCARDEXPIRY;
    }

    public static final class QueryCardExpiryRequestBuilder {
        private String customer;

        private String offset;

        private String limit;

        private Authentication authentication;

        public QueryCardExpiryRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryCardExpiryRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QueryCardExpiryRequestBuilder withOffset(String offset) {
            this.offset = offset;
            return this;
        }

        public QueryCardExpiryRequestBuilder withLimit(String limit) {
            this.limit = limit;
            return this;
        }

        public QueryCardExpiryRequest build() {
            QueryCardExpiryRequest request = new QueryCardExpiryRequest();
            request.authentication = this.authentication;
            request.customer = this.customer;
            request.offset = this.offset;
            request.limit = this.limit;
            return request;
        }
    }
}
