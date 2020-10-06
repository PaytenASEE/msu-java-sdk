package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.DealerTypeAddResponse;

@ResponseInfo(
        responseClass = DealerTypeAddResponse.class
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
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.DESCRIPTIONREQUIRED, this.descriptionReQuired);
        addToPayload(Param.DESCRIPTIONPRESENT, this.descriptionPresent);
        addToPayload(Param.DEFAULTSUBDEALERTYPE, this.defaultSubDealerType);
        addToPayload(Param.MAXINSTALLMENTCOUNT, this.maxInstallmentCount);
        addToPayload(Param.PAYMENTSYSTEMS, this.paymentSystems);
        addToPayload(Param.COMMERCECODE, this.commercecode);
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
