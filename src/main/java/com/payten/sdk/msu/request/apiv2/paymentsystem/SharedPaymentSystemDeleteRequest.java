package com.payten.sdk.msu.request.apiv2.paymentsystem;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.SharedPaymentSystemDeleteResponse;

@ResponseInfo(
        responseClass = SharedPaymentSystemDeleteResponse.class
)
public class SharedPaymentSystemDeleteRequest extends ApiRequest {
    private String associatedMerchant;

    private String associatedPaymentSystems;

    private SharedPaymentSystemDeleteRequest() {
    }

    public static SharedPaymentSystemDeleteRequestBuilder builder() {
        return new SharedPaymentSystemDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.ASSOCIATEDMERCHANT, this.associatedMerchant);
        addToPayload(Param.ASSOCIATEDPAYMENTSYSTEMS, this.associatedPaymentSystems);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SHAREDPAYMENTSYSTEMDELETE;
    }

    public static final class SharedPaymentSystemDeleteRequestBuilder {
        private String associatedMerchant;

        private String associatedPaymentSystems;

        private Authentication authentication;

        public SharedPaymentSystemDeleteRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SharedPaymentSystemDeleteRequestBuilder withAssociatedMerchant(
                String associatedMerchant) {
            this.associatedMerchant = associatedMerchant;
            return this;
        }

        public SharedPaymentSystemDeleteRequestBuilder withAssociatedPaymentSystems(
                String associatedPaymentSystems) {
            this.associatedPaymentSystems = associatedPaymentSystems;
            return this;
        }

        public SharedPaymentSystemDeleteRequest build() {
            SharedPaymentSystemDeleteRequest request = new SharedPaymentSystemDeleteRequest();
            request.authentication = this.authentication;
            request.associatedMerchant = this.associatedMerchant;
            request.associatedPaymentSystems = this.associatedPaymentSystems;
            return request;
        }
    }
}
