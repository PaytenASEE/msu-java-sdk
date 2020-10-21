package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QuerySharedPaymentSystemResponse;

public class QuerySharedPaymentSystemRequest extends ApiRequest<QuerySharedPaymentSystemResponse> {
    private String associatedMerchant;

    private QuerySharedPaymentSystemRequest() {
    }

    public static QuerySharedPaymentSystemRequestBuilder builder() {
        return new QuerySharedPaymentSystemRequestBuilder();
    }

    @Override
    public Class<QuerySharedPaymentSystemResponse> responseClass() {
        return QuerySharedPaymentSystemResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.ASSOCIATEDMERCHANT, this.associatedMerchant);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYSHAREDPAYMENTSYSTEM;
    }

    public static final class QuerySharedPaymentSystemRequestBuilder {
        private String associatedMerchant;

        private Authentication authentication;

        public QuerySharedPaymentSystemRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QuerySharedPaymentSystemRequestBuilder withAssociatedMerchant(
                String associatedMerchant) {
            this.associatedMerchant = associatedMerchant;
            return this;
        }

        public QuerySharedPaymentSystemRequest build() {
            QuerySharedPaymentSystemRequest request = new QuerySharedPaymentSystemRequest();
            request.authentication = this.authentication;
            request.associatedMerchant = this.associatedMerchant;
            return request;
        }
    }
}
