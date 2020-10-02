package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerCommissionRateDeleteResponse.class
)
public class DealerCommissionRateDeleteRequest extends ApiRequest {
    private String dealerCode;

    private String installments;

    private String paymentSystem;

    private DealerCommissionRateDeleteRequest() {
    }

    public static DealerCommissionRateDeleteRequestBuilder builder() {
        return new DealerCommissionRateDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERCOMMISSIONRATEDELETE;
    }

    public static final class DealerCommissionRateDeleteRequestBuilder {
        private String dealerCode;

        private String installments;

        private String paymentSystem;

        private Authentication authentication;

        public DealerCommissionRateDeleteRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerCommissionRateDeleteRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerCommissionRateDeleteRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public DealerCommissionRateDeleteRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public DealerCommissionRateDeleteRequest build() {
            DealerCommissionRateDeleteRequest request = new DealerCommissionRateDeleteRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.installments = this.installments;
            request.paymentSystem = this.paymentSystem;
            return request;
        }
    }
}
