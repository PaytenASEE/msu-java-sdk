package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryMerchantUserDealersResponse;

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
