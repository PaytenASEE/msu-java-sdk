package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerTypeDeleteResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
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
