package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.Status;
import com.merchantsafeunipay.sdk.response.DealerCommissionRateAddResponse;

import java.math.BigDecimal;

public class DealerCommissionRateAddRequest extends ApiRequest<DealerCommissionRateAddResponse> {
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
    public Class<DealerCommissionRateAddResponse> responseClass() {
        return DealerCommissionRateAddResponse.class;
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
