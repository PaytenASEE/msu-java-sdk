package com.github.msu.sdk.request.apiv2.paymentsystem;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.SharedPaymentSystemAddResponse.class
)
public class SharedPaymentSystemAddRequest extends ApiRequest {
    private String associatedmerchant;

    private String associatedpaymentsystems;

    private SharedPaymentSystemAddRequest() {
    }

    public static SharedPaymentSystemAddRequestBuilder builder() {
        return new SharedPaymentSystemAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ASSOCIATEDMERCHANT, this.associatedmerchant);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ASSOCIATEDPAYMENTSYSTEMS, this.associatedpaymentsystems);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SHAREDPAYMENTSYSTEMADD;
    }

    public static final class SharedPaymentSystemAddRequestBuilder {
        private String associatedmerchant;

        private String associatedpaymentsystems;

        private Authentication authentication;

        public SharedPaymentSystemAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SharedPaymentSystemAddRequestBuilder withAssociatedmerchant(String associatedmerchant) {
            this.associatedmerchant = associatedmerchant;
            return this;
        }

        public SharedPaymentSystemAddRequestBuilder withAssociatedpaymentsystems(
                String associatedpaymentsystems) {
            this.associatedpaymentsystems = associatedpaymentsystems;
            return this;
        }

        public SharedPaymentSystemAddRequest build() {
            SharedPaymentSystemAddRequest request = new SharedPaymentSystemAddRequest();
            request.authentication = this.authentication;
            request.associatedmerchant = this.associatedmerchant;
            request.associatedpaymentsystems = this.associatedpaymentsystems;
            return request;
        }
    }
}
