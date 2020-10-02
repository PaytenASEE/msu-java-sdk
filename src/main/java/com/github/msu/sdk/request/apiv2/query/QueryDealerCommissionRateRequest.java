package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryDealerCommissionRateResponse.class
)
public class QueryDealerCommissionRateRequest extends ApiRequest {
    private String paymentSystem;

    private String dealerCode;

    private QueryDealerCommissionRateRequest() {
    }

    public static QueryDealerCommissionRateRequestBuilder builder() {
        return new QueryDealerCommissionRateRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYDEALERCOMMISSIONRATE;
    }

    public static final class QueryDealerCommissionRateRequestBuilder {
        private String paymentSystem;

        private String dealerCode;

        private Authentication authentication;

        public QueryDealerCommissionRateRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryDealerCommissionRateRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryDealerCommissionRateRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryDealerCommissionRateRequest build() {
            QueryDealerCommissionRateRequest request = new QueryDealerCommissionRateRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.dealerCode = this.dealerCode;
            return request;
        }
    }
}
