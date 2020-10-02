package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryDealerResponse;

@ResponseInfo(
        responseClass = QueryDealerResponse.class
)
public class QueryDealerRequest extends ApiRequest {
    private String dealerCode;

    private String parentDealerCode;

    private String maxResult;

    private QueryDealerRequest() {
    }

    public static QueryDealerRequestBuilder builder() {
        return new QueryDealerRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.PARENTDEALERCODE, this.parentDealerCode);
        addToPayload(Param.MAXRESULT, this.maxResult);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYDEALER;
    }

    public static final class QueryDealerRequestBuilder {
        private String dealerCode;

        private String parentDealerCode;

        private String maxResult;

        private Authentication authentication;

        public QueryDealerRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryDealerRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryDealerRequestBuilder withParentDealerCode(String parentDealerCode) {
            this.parentDealerCode = parentDealerCode;
            return this;
        }

        public QueryDealerRequestBuilder withMaxResult(String maxResult) {
            this.maxResult = maxResult;
            return this;
        }

        public QueryDealerRequest build() {
            QueryDealerRequest request = new QueryDealerRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.parentDealerCode = this.parentDealerCode;
            request.maxResult = this.maxResult;
            return request;
        }
    }
}
