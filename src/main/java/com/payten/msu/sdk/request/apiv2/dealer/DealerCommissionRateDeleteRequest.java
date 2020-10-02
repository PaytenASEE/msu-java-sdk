package com.payten.msu.sdk.request.apiv2.dealer;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.DealerCommissionRateDeleteResponse;

@ResponseInfo(
        responseClass = DealerCommissionRateDeleteResponse.class
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
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
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
