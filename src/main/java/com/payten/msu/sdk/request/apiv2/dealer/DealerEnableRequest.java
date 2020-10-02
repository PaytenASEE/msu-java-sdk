package com.payten.msu.sdk.request.apiv2.dealer;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.DealerEnableResponse;

@ResponseInfo(
        responseClass = DealerEnableResponse.class
)
public class DealerEnableRequest extends ApiRequest {
    private String dealerCode;

    private String reason;

    private DealerEnableRequest() {
    }

    public static DealerEnableRequestBuilder builder() {
        return new DealerEnableRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.REASON, this.reason);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERENABLE;
    }

    public static final class DealerEnableRequestBuilder {
        private String dealerCode;

        private String reason;

        private Authentication authentication;

        public DealerEnableRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerEnableRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerEnableRequestBuilder withReason(String reason) {
            this.reason = reason;
            return this;
        }

        public DealerEnableRequest build() {
            DealerEnableRequest request = new DealerEnableRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.reason = this.reason;
            return request;
        }
    }
}
