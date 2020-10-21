package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryRecurringPlanCardResponse;

public class QueryRecurringPlanCardRequest extends ApiRequest<QueryRecurringPlanCardResponse> {
    private String recurringPlanCode;

    private QueryRecurringPlanCardRequest() {
    }

    public static QueryRecurringPlanCardRequestBuilder builder() {
        return new QueryRecurringPlanCardRequestBuilder();
    }

    @Override
    public Class<QueryRecurringPlanCardResponse> responseClass() {
        return QueryRecurringPlanCardResponse.class;
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
