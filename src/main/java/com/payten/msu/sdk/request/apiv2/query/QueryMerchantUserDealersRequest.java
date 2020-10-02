package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryMerchantUserDealersResponse;

@ResponseInfo(
        responseClass = QueryMerchantUserDealersResponse.class
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
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
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
