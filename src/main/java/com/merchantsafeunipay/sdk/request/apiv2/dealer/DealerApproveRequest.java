package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.DealerApproveResponse;

public class DealerApproveRequest extends ApiRequest<DealerApproveResponse> {
    private String dealerCode;

    private DealerApproveRequest() {
    }

    public static DealerApproveRequestBuilder builder() {
        return new DealerApproveRequestBuilder();
    }

    @Override
    public Class<DealerApproveResponse> responseClass() {
        return DealerApproveResponse.class;
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
