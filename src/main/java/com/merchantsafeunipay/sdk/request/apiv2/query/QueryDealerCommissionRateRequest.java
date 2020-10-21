package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryDealerCommissionRateResponse;

public class QueryDealerCommissionRateRequest extends ApiRequest<QueryDealerCommissionRateResponse> {
    private String paymentSystem;

    private String dealerCode;

    private QueryDealerCommissionRateRequest() {
    }

    public static QueryDealerCommissionRateRequestBuilder builder() {
        return new QueryDealerCommissionRateRequestBuilder();
    }

    @Override
    public Class<QueryDealerCommissionRateResponse> responseClass() {
        return QueryDealerCommissionRateResponse.class;
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
