package com.payten.sdk.msu.request.apiv2.dealer;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.DealerEnableResponse;

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
