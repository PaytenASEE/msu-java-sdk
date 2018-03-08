package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryMerchantStatusHistoryResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryMerchantStatusHistoryResponse.class)
public class QueryMerchantStatusHistoryRequest extends ApiRequest {

    private String status;
    private String startDate;
    private String endDate;

    @Override
    public Action action() {
        return Action.QUERYMERCHANTSTATUSHISTORY;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
    }

    public static QueryMerchantStatusHistoryRequestBuilder builder() {
        return new QueryMerchantStatusHistoryRequestBuilder();
    }

    public static final class QueryMerchantStatusHistoryRequestBuilder {
        private String status;
        private String startDate;
        private String endDate;

        private QueryMerchantStatusHistoryRequestBuilder() {
        }

        public QueryMerchantStatusHistoryRequestBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public QueryMerchantStatusHistoryRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryMerchantStatusHistoryRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryMerchantStatusHistoryRequest build() {
            QueryMerchantStatusHistoryRequest queryMerchantStatusHistoryRequest = new QueryMerchantStatusHistoryRequest();
            queryMerchantStatusHistoryRequest.status = this.status;
            queryMerchantStatusHistoryRequest.startDate = this.startDate;
            queryMerchantStatusHistoryRequest.endDate = this.endDate;
            return queryMerchantStatusHistoryRequest;
        }
    }
}
