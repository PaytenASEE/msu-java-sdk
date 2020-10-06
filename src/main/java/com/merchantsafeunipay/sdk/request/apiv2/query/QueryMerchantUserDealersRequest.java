package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryMerchantUserDealersResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

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
