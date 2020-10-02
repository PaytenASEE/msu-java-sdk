package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QuerySplitPaymentResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SPLITPAYMENTCODE, this.splitPaymentCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STARTDATE, this.startDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ENDDATE, this.endDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODES, this.dealerCodes);
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
