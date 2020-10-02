package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.Currency;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryPaymentPolicyResponse;

@ResponseInfo(
        responseClass = QueryPaymentPolicyResponse.class
)
public class QueryPaymentPolicyRequest extends ApiRequest {
    private String paymentSystem;

    private Currency currency;

    private QueryPaymentPolicyRequest() {
    }

    public static QueryPaymentPolicyRequestBuilder builder() {
        return new QueryPaymentPolicyRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.CURRENCY, this.currency);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPAYMENTPOLICY;
    }

    public static final class QueryPaymentPolicyRequestBuilder {
        private String paymentSystem;

        private Currency currency;

        private Authentication authentication;

        public QueryPaymentPolicyRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPaymentPolicyRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryPaymentPolicyRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public QueryPaymentPolicyRequest build() {
            QueryPaymentPolicyRequest request = new QueryPaymentPolicyRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.currency = this.currency;
            return request;
        }
    }
}
