package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerTypeAddResponse.class
)
public class DealerTypeAddRequest extends ApiRequest {
    private String dealerTypeName;

    private String descriptionReQuired;

    private String descriptionPresent;

    private String defaultSubDealerType;

    private String maxInstallmentCount;

    private String paymentSystems;

    private String commercecode;

    private DealerTypeAddRequest() {
    }

    public static DealerTypeAddRequestBuilder builder() {
        return new DealerTypeAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DESCRIPTIONREQUIRED, this.descriptionReQuired);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DESCRIPTIONPRESENT, this.descriptionPresent);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEFAULTSUBDEALERTYPE, this.defaultSubDealerType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MAXINSTALLMENTCOUNT, this.maxInstallmentCount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMS, this.paymentSystems);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.COMMERCECODE, this.commercecode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERTYPEADD;
    }

    public static final class DealerTypeAddRequestBuilder {
        private String dealerTypeName;

        private String descriptionReQuired;

        private String descriptionPresent;

        private String defaultSubDealerType;

        private String maxInstallmentCount;

        private String paymentSystems;

        private String commercecode;

        private Authentication authentication;

        public DealerTypeAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerTypeAddRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public DealerTypeAddRequestBuilder withDescriptionReQuired(String descriptionReQuired) {
            this.descriptionReQuired = descriptionReQuired;
            return this;
        }

        public DealerTypeAddRequestBuilder withDescriptionPresent(String descriptionPresent) {
            this.descriptionPresent = descriptionPresent;
            return this;
        }

        public DealerTypeAddRequestBuilder withDefaultSubDealerType(String defaultSubDealerType) {
            this.defaultSubDealerType = defaultSubDealerType;
            return this;
        }

        public DealerTypeAddRequestBuilder withMaxInstallmentCount(String maxInstallmentCount) {
            this.maxInstallmentCount = maxInstallmentCount;
            return this;
        }

        public DealerTypeAddRequestBuilder withPaymentSystems(String paymentSystems) {
            this.paymentSystems = paymentSystems;
            return this;
        }

        public DealerTypeAddRequestBuilder withCommercecode(String commercecode) {
            this.commercecode = commercecode;
            return this;
        }

        public DealerTypeAddRequest build() {
            DealerTypeAddRequest request = new DealerTypeAddRequest();
            request.authentication = this.authentication;
            request.dealerTypeName = this.dealerTypeName;
            request.descriptionReQuired = this.descriptionReQuired;
            request.descriptionPresent = this.descriptionPresent;
            request.defaultSubDealerType = this.defaultSubDealerType;
            request.maxInstallmentCount = this.maxInstallmentCount;
            request.paymentSystems = this.paymentSystems;
            request.commercecode = this.commercecode;
            return request;
        }
    }
}
