package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QuerySharedPaymentSystemResponse;

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
