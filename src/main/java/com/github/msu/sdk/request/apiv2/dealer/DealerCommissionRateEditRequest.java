package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerCommissionRateEditResponse.class
)
public class DealerCommissionRateEditRequest extends ApiRequest {
    private String dealerCode;

    private String installments;

    private String paymentSystem;

    private BigDecimal commissionRate;

    private Status status;

    private DealerCommissionRateEditRequest() {
    }

    public static DealerCommissionRateEditRequestBuilder builder() {
        return new DealerCommissionRateEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.COMMISSIONRATE, this.commissionRate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERCOMMISSIONRATEEDIT;
    }

    public static final class DealerCommissionRateEditRequestBuilder {
        private String dealerCode;

        private String installments;

        private String paymentSystem;

        private BigDecimal commissionRate;

        private Status status;

        private Authentication authentication;

        public DealerCommissionRateEditRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerCommissionRateEditRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerCommissionRateEditRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public DealerCommissionRateEditRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public DealerCommissionRateEditRequestBuilder withCommissionRate(BigDecimal commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }

        public DealerCommissionRateEditRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public DealerCommissionRateEditRequest build() {
            DealerCommissionRateEditRequest request = new DealerCommissionRateEditRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.installments = this.installments;
            request.paymentSystem = this.paymentSystem;
            request.commissionRate = this.commissionRate;
            request.status = this.status;
            return request;
        }
    }
}
