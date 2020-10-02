package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.SharedPaymentSystemDeleteResponse.class
)
public class SharedPaymentSystemDeleteRequest extends ApiRequest {
    private String associatedmerchant;

    private String associatedpaymentsystems;

    private SharedPaymentSystemDeleteRequest() {
    }

    public static SharedPaymentSystemDeleteRequestBuilder builder() {
        return new SharedPaymentSystemDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ASSOCIATEDMERCHANT, this.associatedmerchant);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ASSOCIATEDPAYMENTSYSTEMS, this.associatedpaymentsystems);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SHAREDPAYMENTSYSTEMDELETE;
    }

    public static final class SharedPaymentSystemDeleteRequestBuilder {
        private String associatedmerchant;

        private String associatedpaymentsystems;

        private Authentication authentication;

        public SharedPaymentSystemDeleteRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SharedPaymentSystemDeleteRequestBuilder withAssociatedmerchant(
                String associatedmerchant) {
            this.associatedmerchant = associatedmerchant;
            return this;
        }

        public SharedPaymentSystemDeleteRequestBuilder withAssociatedpaymentsystems(
                String associatedpaymentsystems) {
            this.associatedpaymentsystems = associatedpaymentsystems;
            return this;
        }

        public SharedPaymentSystemDeleteRequest build() {
            SharedPaymentSystemDeleteRequest request = new SharedPaymentSystemDeleteRequest();
            request.authentication = this.authentication;
            request.associatedmerchant = this.associatedmerchant;
            request.associatedpaymentsystems = this.associatedpaymentsystems;
            return request;
        }
    }
}
