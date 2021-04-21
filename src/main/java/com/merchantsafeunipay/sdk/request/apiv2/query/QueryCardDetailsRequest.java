package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryCardDetailsResponse;

public class QueryCardDetailsRequest extends ApiRequest<QueryCardDetailsResponse> {
    private String sessionToken;

    private QueryCardDetailsRequest() {
    }

    public static QueryCardDetailsRequest.QueryCardDetailsRequestBuilder builder() {
        return new QueryCardDetailsRequest.QueryCardDetailsRequestBuilder();
    }

    @Override
    public Class<QueryCardDetailsResponse> responseClass() {
        return QueryCardDetailsResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SESSIONTOKEN, this.sessionToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCARDDETAILS;
    }


    public static final class QueryCardDetailsRequestBuilder {
        private String sessionToken;

        public QueryCardDetailsRequest.QueryCardDetailsRequestBuilder withSessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        public QueryCardDetailsRequest build() {
            QueryCardDetailsRequest request = new QueryCardDetailsRequest();
            request.sessionToken = this.sessionToken;
            return request;
        }
    }
}
