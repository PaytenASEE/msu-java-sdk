package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QuerySplitPaymentResponse;

@ResponseInfo(
        responseClass = QuerySplitPaymentResponse.class
)
public class QuerySplitPaymentRequest extends ApiRequest {
    private String splitPaymentCode;

    private String startDate;

    private String endDate;

    private String customer;

    private String dealerCodes;

    private QuerySplitPaymentRequest() {
    }

    public static QuerySplitPaymentRequestBuilder builder() {
        return new QuerySplitPaymentRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SPLITPAYMENTCODE, this.splitPaymentCode);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
        addToPayload(Param.CUSTOMER, this.customer);
        addToPayload(Param.DEALERCODES, this.dealerCodes);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYSPLITPAYMENT;
    }

    public static final class QuerySplitPaymentRequestBuilder {
        private String splitPaymentCode;

        private String startDate;

        private String endDate;

        private String customer;

        private String dealerCodes;

        private Authentication authentication;

        public QuerySplitPaymentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QuerySplitPaymentRequestBuilder withSplitPaymentCode(String splitPaymentCode) {
            this.splitPaymentCode = splitPaymentCode;
            return this;
        }

        public QuerySplitPaymentRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QuerySplitPaymentRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QuerySplitPaymentRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public QuerySplitPaymentRequestBuilder withDealerCodes(String dealerCodes) {
            this.dealerCodes = dealerCodes;
            return this;
        }

        public QuerySplitPaymentRequest build() {
            QuerySplitPaymentRequest request = new QuerySplitPaymentRequest();
            request.authentication = this.authentication;
            request.splitPaymentCode = this.splitPaymentCode;
            request.startDate = this.startDate;
            request.endDate = this.endDate;
            request.customer = this.customer;
            request.dealerCodes = this.dealerCodes;
            return request;
        }
    }
}
