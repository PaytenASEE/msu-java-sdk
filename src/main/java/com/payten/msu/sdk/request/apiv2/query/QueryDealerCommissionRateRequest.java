package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryDealerCommissionRateResponse;

@ResponseInfo(
        responseClass = QueryDealerCommissionRateResponse.class
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
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.DEALERCODE, this.dealerCode);
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
