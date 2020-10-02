package com.payten.sdk.msu.request.apiv2.dealer;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.DealerApproveResponse;

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
