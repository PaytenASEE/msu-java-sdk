package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryMerchantResponse;

public class QueryMerchantRequest extends ApiRequest<QueryMerchantResponse> {
    private String basicQuery;
    private String sessionToken;
    private QueryMerchantRequest() {
    }

    public static QueryMerchantRequestBuilder builder() {
        return new QueryMerchantRequestBuilder();
    }

    @Override
    public Class<QueryMerchantResponse> responseClass() {
        return QueryMerchantResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.BASICQUERY, this.basicQuery);
        addToPayload(Param.SESSIONTOKEN, this.sessionToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANT;
    }

    public static final class QueryMerchantRequestBuilder {
        private Authentication authentication;
        private String basicQuery;
        private String sessionToken;

        public QueryMerchantRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }
        public QueryMerchantRequestBuilder withBasicQuery(String basicQuery) {
            this.basicQuery = basicQuery;
            return this;
        }
        public QueryMerchantRequestBuilder withSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }


        public QueryMerchantRequest build() {
            QueryMerchantRequest request = new QueryMerchantRequest();
            request.authentication = this.authentication;
            request.basicQuery = this.basicQuery;
            request.sessionToken =this.sessionToken;
            return request;
        }
    }
}
