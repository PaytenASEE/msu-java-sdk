package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Status;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryDealerStatusHistoryResponse;

@ResponseInfo(
        responseClass = QueryDealerStatusHistoryResponse.class
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
        addToPayload(Param.DEALERCODES, this.dealerCodes);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
        addToPayload(Param.REASON, this.reason);
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
