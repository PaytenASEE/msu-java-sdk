package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryDealerStatusHistoryResponse.class
)
public class QueryDealerStatusHistoryRequest extends ApiRequest {
    private String dealerCodes;

    private Status status;

    private String startDate;

    private String endDate;

    private String reason;

    private QueryDealerStatusHistoryRequest() {
    }

    public static QueryDealerStatusHistoryRequestBuilder builder() {
        return new QueryDealerStatusHistoryRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODES, this.dealerCodes);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STARTDATE, this.startDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENDDATE, this.endDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.REASON, this.reason);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYDEALERSTATUSHISTORY;
    }

    public static final class QueryDealerStatusHistoryRequestBuilder {
        private String dealerCodes;

        private Status status;

        private String startDate;

        private String endDate;

        private String reason;

        private Authentication authentication;

        public QueryDealerStatusHistoryRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryDealerStatusHistoryRequestBuilder withDealerCodes(String dealerCodes) {
            this.dealerCodes = dealerCodes;
            return this;
        }

        public QueryDealerStatusHistoryRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public QueryDealerStatusHistoryRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryDealerStatusHistoryRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryDealerStatusHistoryRequestBuilder withReason(String reason) {
            this.reason = reason;
            return this;
        }

        public QueryDealerStatusHistoryRequest build() {
            QueryDealerStatusHistoryRequest request = new QueryDealerStatusHistoryRequest();
            request.authentication = this.authentication;
            request.dealerCodes = this.dealerCodes;
            request.status = this.status;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.reason = this.reason;
            return request;
        }
    }
}
