package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerEnableResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.REASON, this.reason);
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
