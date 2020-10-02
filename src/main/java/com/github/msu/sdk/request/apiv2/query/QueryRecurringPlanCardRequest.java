package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryRecurringPlanCardResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RECURRINGPLANCODE, this.recurringPlanCode);
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
