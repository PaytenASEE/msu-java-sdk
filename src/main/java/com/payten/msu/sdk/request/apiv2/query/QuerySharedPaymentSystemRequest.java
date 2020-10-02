package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QuerySharedPaymentSystemResponse;

@ResponseInfo(
        responseClass = QuerySharedPaymentSystemResponse.class
)
public class QuerySharedPaymentSystemRequest extends ApiRequest {
    private String associatedMerchant;

    private QuerySharedPaymentSystemRequest() {
    }

    public static QuerySharedPaymentSystemRequestBuilder builder() {
        return new QuerySharedPaymentSystemRequestBuilder();
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
