package com.payten.msu.sdk.request.apiv2.dealer;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.DealerTypeDeleteResponse;

@ResponseInfo(
        responseClass = DealerTypeDeleteResponse.class
)
public class DealerTypeDeleteRequest extends ApiRequest {
    private String dealerTypeName;

    private DealerTypeDeleteRequest() {
    }

    public static DealerTypeDeleteRequestBuilder builder() {
        return new DealerTypeDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERTYPEDELETE;
    }

    public static final class DealerTypeDeleteRequestBuilder {
        private String dealerTypeName;

        private Authentication authentication;

        public DealerTypeDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerTypeDeleteRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public DealerTypeDeleteRequest build() {
            DealerTypeDeleteRequest request = new DealerTypeDeleteRequest();
            request.authentication = this.authentication;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
