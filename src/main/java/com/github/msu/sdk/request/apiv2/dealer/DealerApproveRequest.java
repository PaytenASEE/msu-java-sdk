package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerApproveResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
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
