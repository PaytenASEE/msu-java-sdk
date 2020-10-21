package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.Status;
import com.merchantsafeunipay.sdk.response.QueryMerchantStatusHistoryResponse;

public class QueryMerchantStatusHistoryRequest extends ApiRequest<QueryMerchantStatusHistoryResponse> {
    private Status status;

    private String startDate;

    private String endDate;

    private QueryMerchantStatusHistoryRequest() {
    }

    public static QueryMerchantStatusHistoryRequestBuilder builder() {
        return new QueryMerchantStatusHistoryRequestBuilder();
    }

    @Override
    public Class<QueryMerchantStatusHistoryResponse> responseClass() {
        return QueryMerchantStatusHistoryResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTSTATUSHISTORY;
    }

    public static final class QueryMerchantStatusHistoryRequestBuilder {
        private Status status;

        private String startDate;

        private String endDate;

        private Authentication authentication;

        public QueryMerchantStatusHistoryRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantStatusHistoryRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public QueryMerchantStatusHistoryRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryMerchantStatusHistoryRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryMerchantStatusHistoryRequest build() {
            QueryMerchantStatusHistoryRequest request = new QueryMerchantStatusHistoryRequest();
            request.authentication = this.authentication;
            request.status = this.status;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            return request;
        }
    }
}
