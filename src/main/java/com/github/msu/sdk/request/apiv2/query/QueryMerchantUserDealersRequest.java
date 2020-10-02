package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMerchantUserDealersResponse.class
)
public class QueryMerchantUserDealersRequest extends ApiRequest {
    private String merchantUserEmail;

    private QueryMerchantUserDealersRequest() {
    }

    public static QueryMerchantUserDealersRequestBuilder builder() {
        return new QueryMerchantUserDealersRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTUSERDEALERS;
    }

    public static final class QueryMerchantUserDealersRequestBuilder {
        private String merchantUserEmail;

        private Authentication authentication;

        public QueryMerchantUserDealersRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantUserDealersRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public QueryMerchantUserDealersRequest build() {
            QueryMerchantUserDealersRequest request = new QueryMerchantUserDealersRequest();
            request.authentication = this.authentication;
            request.merchantUserEmail = this.merchantUserEmail;
            return request;
        }
    }
}
