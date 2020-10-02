package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.PaymentSystemType;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryDealerPstResponse;

@ResponseInfo(
        responseClass = QueryDealerPstResponse.class
)
public class QueryDealerPstRequest extends ApiRequest {
    private String paymentSystem;

    private PaymentSystemType paymentSystemType;

    private String dealerCode;

    private String maxResult;

    private QueryDealerPstRequest() {
    }

    public static QueryDealerPstRequestBuilder builder() {
        return new QueryDealerPstRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.MAXRESULT, this.maxResult);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYDEALERPST;
    }

    public static final class QueryDealerPstRequestBuilder {
        private String paymentSystem;

        private PaymentSystemType paymentSystemType;

        private String dealerCode;

        private String maxResult;

        private Authentication authentication;

        public QueryDealerPstRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryDealerPstRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryDealerPstRequestBuilder withPaymentSystemType(PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public QueryDealerPstRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryDealerPstRequestBuilder withMaxResult(String maxResult) {
            this.maxResult = maxResult;
            return this;
        }

        public QueryDealerPstRequest build() {
            QueryDealerPstRequest request = new QueryDealerPstRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.paymentSystemType = this.paymentSystemType;
            request.dealerCode = this.dealerCode;
            request.maxResult = this.maxResult;
            return request;
        }
    }
}
