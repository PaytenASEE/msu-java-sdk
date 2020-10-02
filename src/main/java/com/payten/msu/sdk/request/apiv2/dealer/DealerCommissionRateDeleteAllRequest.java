package com.payten.msu.sdk.request.apiv2.dealer;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.DealerCommissionRateDeleteAllResponse;

@ResponseInfo(
        responseClass = DealerCommissionRateDeleteAllResponse.class
)
public class DealerCommissionRateDeleteAllRequest extends ApiRequest {
    private String dealerCode;

    private DealerCommissionRateDeleteAllRequest() {
    }

    public static DealerCommissionRateDeleteAllRequestBuilder builder() {
        return new DealerCommissionRateDeleteAllRequestBuilder();
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
