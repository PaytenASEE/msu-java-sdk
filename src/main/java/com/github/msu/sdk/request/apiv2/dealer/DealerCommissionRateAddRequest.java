package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerCommissionRateAddResponse.class
)
public class DealerCommissionRateAddRequest extends ApiRequest {
    private String dealerCode;

    private String installments;

    private String paymentSystem;

    private BigDecimal commissionRate;

    private Status status;

    private DealerCommissionRateAddRequest() {
    }

    public static DealerCommissionRateAddRequestBuilder builder() {
        return new DealerCommissionRateAddRequestBuilder();
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
        return ApiAction.DEALERCOMMISSIONRATEADD;
    }

    public static final class DealerCommissionRateAddRequestBuilder {
        private String dealerCode;

        private String installments;

        private String paymentSystem;

        private BigDecimal commissionRate;

        private Status status;

        private Authentication authentication;

        public DealerCommissionRateAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerCommissionRateAddRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerCommissionRateAddRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public DealerCommissionRateAddRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public DealerCommissionRateAddRequestBuilder withCommissionRate(BigDecimal commissionRate) {
            this.commissionRate = commissionRate;
            return this;
        }

        public DealerCommissionRateAddRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public DealerCommissionRateAddRequest build() {
            DealerCommissionRateAddRequest request = new DealerCommissionRateAddRequest();
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
