package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryRecurringPlanCardResponse;

@ResponseInfo(
        responseClass = QueryRecurringPlanCardResponse.class
)
public class QueryRecurringPlanCardRequest extends ApiRequest {
    private String recurringPlanCode;

    private QueryRecurringPlanCardRequest() {
    }

    public static QueryRecurringPlanCardRequestBuilder builder() {
        return new QueryRecurringPlanCardRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RECURRINGPLANCODE, this.recurringPlanCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYRECURRINGPLANCARD;
    }

    public static final class QueryRecurringPlanCardRequestBuilder {
        private String recurringPlanCode;

        private Authentication authentication;

        public QueryRecurringPlanCardRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryRecurringPlanCardRequestBuilder withRecurringPlanCode(String recurringPlanCode) {
            this.recurringPlanCode = recurringPlanCode;
            return this;
        }

        public QueryRecurringPlanCardRequest build() {
            QueryRecurringPlanCardRequest request = new QueryRecurringPlanCardRequest();
            request.authentication = this.authentication;
            request.recurringPlanCode = this.recurringPlanCode;
            return request;
        }
    }
}
