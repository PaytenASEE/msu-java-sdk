package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryDealerTypeResponse;

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
