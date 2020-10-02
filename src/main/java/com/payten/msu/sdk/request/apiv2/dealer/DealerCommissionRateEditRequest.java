package com.payten.msu.sdk.request.apiv2.dealer;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Status;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.DealerCommissionRateEditResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = DealerCommissionRateEditResponse.class
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
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.COMMISSIONRATE, this.commissionRate);
        addToPayload(Param.STATUS, this.status);
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
