package com.payten.sdk.msu.request.apiv2.dealer;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.DealerCommissionRateDeleteAllResponse;

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
