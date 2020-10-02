package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMerchantStatusHistoryResponse.class
)
public class QueryMerchantStatusHistoryRequest extends ApiRequest {
    private Status status;

    private String startDate;

    private String endDate;

    private QueryMerchantStatusHistoryRequest() {
    }

    public static QueryMerchantStatusHistoryRequestBuilder builder() {
        return new QueryMerchantStatusHistoryRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STARTDATE, this.startDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENDDATE, this.endDate);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTSTATUSHISTORY;
    }

    public static final class QueryMerchantStatusHistoryRequestBuilder {
        private Status status;

        private String startDate;

        private String endDate;

        private Authentication authentication;

        public QueryMerchantStatusHistoryRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantStatusHistoryRequestBuilder withStatus(Status status) {
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
            QueryMerchantStatusHistoryRequest request = new QueryMerchantStatusHistoryRequest();
            request.authentication = this.authentication;
            request.status = this.status;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            return request;
        }
    }
}
