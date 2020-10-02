package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.PaymentSystemType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryDealerPstResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MAXRESULT, this.maxResult);
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
