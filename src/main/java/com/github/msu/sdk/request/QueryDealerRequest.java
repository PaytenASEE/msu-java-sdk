package com.github.msu.sdk.request;

import com.github.msu.sdk.MsuApiClient;
import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.authentication.credentials.providers.StaticCredentialsProvider;
import com.github.msu.sdk.authentication.types.UserCredentialsAuthentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryDealerResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryDealerResponse.class)
public class QueryDealerRequest extends ApiRequest{
    private String dealerCode;
    private String parentDealerCode;

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.PARENTDEALERCODE, this.parentDealerCode);
    }

    @Override
    public Action action() {
        return Action.QUERYDEALER;
    }

    public static QueryDealerRequestBuilder builder(){
        return new QueryDealerRequestBuilder();
    }

    public static final class QueryDealerRequestBuilder {
        private String dealerCode;
        private String parentDealerCode;

        private QueryDealerRequestBuilder() {
        }

        public QueryDealerRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryDealerRequestBuilder withParentDealerCode(String parentDealerCode) {
            this.parentDealerCode = parentDealerCode;
            return this;
        }

        public QueryDealerRequest build() {
            QueryDealerRequest queryDealerRequest = new QueryDealerRequest();
            queryDealerRequest.parentDealerCode = this.parentDealerCode;
            queryDealerRequest.dealerCode = this.dealerCode;
            return queryDealerRequest;
        }
    }
}
