package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerDisableResponse.class
)
public class DealerDisableRequest extends ApiRequest {
    private String dealerCode;

    private String reason;

    private DealerDisableRequest() {
    }

    public static DealerDisableRequestBuilder builder() {
        return new DealerDisableRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.REASON, this.reason);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERDISABLE;
    }

    public static final class DealerDisableRequestBuilder {
        private String dealerCode;

        private String reason;

        private Authentication authentication;

        public DealerDisableRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerDisableRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerDisableRequestBuilder withReason(String reason) {
            this.reason = reason;
            return this;
        }

        public DealerDisableRequest build() {
            DealerDisableRequest request = new DealerDisableRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.reason = this.reason;
            return request;
        }
    }
}
