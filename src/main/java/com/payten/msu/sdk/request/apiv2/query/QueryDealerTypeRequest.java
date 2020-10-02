package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryDealerTypeResponse;

@ResponseInfo(
        responseClass = QueryDealerTypeResponse.class
)
public class QueryDealerTypeRequest extends ApiRequest {
    private String dealerTypeName;

    private QueryDealerTypeRequest() {
    }

    public static QueryDealerTypeRequestBuilder builder() {
        return new QueryDealerTypeRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYDEALERTYPE;
    }

    public static final class QueryDealerTypeRequestBuilder {
        private String dealerTypeName;

        private Authentication authentication;

        public QueryDealerTypeRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryDealerTypeRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryDealerTypeRequest build() {
            QueryDealerTypeRequest request = new QueryDealerTypeRequest();
            request.authentication = this.authentication;
            request.dealerTypeName = this.dealerTypeName;
            return request;
        }
    }
}
