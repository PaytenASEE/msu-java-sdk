package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QuerySharedPaymentSystemResponse.class
)
public class QuerySharedPaymentSystemRequest extends ApiRequest {
    private String associatedmerchant;

    private QuerySharedPaymentSystemRequest() {
    }

    public static QuerySharedPaymentSystemRequestBuilder builder() {
        return new QuerySharedPaymentSystemRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ASSOCIATEDMERCHANT, this.associatedmerchant);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYSHAREDPAYMENTSYSTEM;
    }

    public static final class QuerySharedPaymentSystemRequestBuilder {
        private String associatedmerchant;

        private Authentication authentication;

        public QuerySharedPaymentSystemRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QuerySharedPaymentSystemRequestBuilder withAssociatedmerchant(
                String associatedmerchant) {
            this.associatedmerchant = associatedmerchant;
            return this;
        }

        public QuerySharedPaymentSystemRequest build() {
            QuerySharedPaymentSystemRequest request = new QuerySharedPaymentSystemRequest();
            request.authentication = this.authentication;
            request.associatedmerchant = this.associatedmerchant;
            return request;
        }
    }
}
