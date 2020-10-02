package com.payten.msu.sdk.request.apiv2.dealer;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.DealerApproveResponse;

@ResponseInfo(
        responseClass = DealerApproveResponse.class
)
public class DealerApproveRequest extends ApiRequest {
    private String dealerCode;

    private DealerApproveRequest() {
    }

    public static DealerApproveRequestBuilder builder() {
        return new DealerApproveRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERAPPROVE;
    }

    public static final class DealerApproveRequestBuilder {
        private String dealerCode;

        private Authentication authentication;

        public DealerApproveRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerApproveRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerApproveRequest build() {
            DealerApproveRequest request = new DealerApproveRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            return request;
        }
    }
}
