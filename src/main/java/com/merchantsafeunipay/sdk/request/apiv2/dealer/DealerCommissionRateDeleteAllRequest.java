package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.DealerCommissionRateDeleteAllResponse;

public class DealerCommissionRateDeleteAllRequest extends ApiRequest<DealerCommissionRateDeleteAllResponse> {
    private String dealerCode;

    private DealerCommissionRateDeleteAllRequest() {
    }

    public static DealerCommissionRateDeleteAllRequestBuilder builder() {
        return new DealerCommissionRateDeleteAllRequestBuilder();
    }

    @Override
    public Class<DealerCommissionRateDeleteAllResponse> responseClass() {
        return DealerCommissionRateDeleteAllResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERCOMMISSIONRATEDELETEALL;
    }

    public static final class DealerCommissionRateDeleteAllRequestBuilder {
        private String dealerCode;

        private Authentication authentication;

        public DealerCommissionRateDeleteAllRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerCommissionRateDeleteAllRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerCommissionRateDeleteAllRequest build() {
            DealerCommissionRateDeleteAllRequest request = new DealerCommissionRateDeleteAllRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            return request;
        }
    }
}
