package com.payten.msu.sdk.request.apiv2.paymentsystem;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.SharedPaymentSystemAddResponse;

@ResponseInfo(
        responseClass = SharedPaymentSystemAddResponse.class
)
public class SharedPaymentSystemAddRequest extends ApiRequest {
    private String associatedMerchant;

    private String associatedPaymentSystems;

    private SharedPaymentSystemAddRequest() {
    }

    public static SharedPaymentSystemAddRequestBuilder builder() {
        return new SharedPaymentSystemAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.ASSOCIATEDMERCHANT, this.associatedMerchant);
        addToPayload(Param.ASSOCIATEDPAYMENTSYSTEMS, this.associatedPaymentSystems);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SHAREDPAYMENTSYSTEMADD;
    }

    public static final class SharedPaymentSystemAddRequestBuilder {
        private String associatedMerchant;

        private String associatedPaymentSystems;

        private Authentication authentication;

        public SharedPaymentSystemAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SharedPaymentSystemAddRequestBuilder withAssociatedMerchant(String associatedMerchant) {
            this.associatedMerchant = associatedMerchant;
            return this;
        }

        public SharedPaymentSystemAddRequestBuilder withAssociatedPaymentSystems(
                String associatedPaymentSystems) {
            this.associatedPaymentSystems = associatedPaymentSystems;
            return this;
        }

        public SharedPaymentSystemAddRequest build() {
            SharedPaymentSystemAddRequest request = new SharedPaymentSystemAddRequest();
            request.authentication = this.authentication;
            request.associatedMerchant = this.associatedMerchant;
            request.associatedPaymentSystems = this.associatedPaymentSystems;
            return request;
        }
    }
}
