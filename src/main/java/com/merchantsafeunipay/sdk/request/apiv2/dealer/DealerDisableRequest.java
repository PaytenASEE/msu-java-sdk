package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.DealerDisableResponse;

@ResponseInfo(
        responseClass = DealerDisableResponse.class
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
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.REASON, this.reason);
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
