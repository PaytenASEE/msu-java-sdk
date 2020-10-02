package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryPaymentPolicyResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
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
