package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.SplitPaymentType;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryExecutiveReportResponse;

@ResponseInfo(
        responseClass = QueryExecutiveReportResponse.class
)
public class QueryExecutiveReportRequest extends ApiRequest {
    private String merchantGroupName;

    private String merchantBusinessId;

    private String merchantUserEmail;

    private String dealerCode;

    private SplitPaymentType splitPaymentType;

    private QueryExecutiveReportRequest() {
    }

    public static QueryExecutiveReportRequestBuilder builder() {
        return new QueryExecutiveReportRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTGROUPNAME, this.merchantGroupName);
        addToPayload(Param.MERCHANTBUSINESSID, this.merchantBusinessId);
        addToPayload(Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.SPLITPAYMENTTYPE, this.splitPaymentType);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYEXECUTIVEREPORT;
    }

    public static final class QueryExecutiveReportRequestBuilder {
        private String merchantGroupName;

        private String merchantBusinessId;

        private String merchantUserEmail;

        private String dealerCode;

        private SplitPaymentType splitPaymentType;

        private Authentication authentication;

        public QueryExecutiveReportRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryExecutiveReportRequestBuilder withMerchantGroupName(String merchantGroupName) {
            this.merchantGroupName = merchantGroupName;
            return this;
        }

        public QueryExecutiveReportRequestBuilder withMerchantBusinessId(String merchantBusinessId) {
            this.merchantBusinessId = merchantBusinessId;
            return this;
        }

        public QueryExecutiveReportRequestBuilder withMerchantUserEmail(String merchantUserEmail) {
            this.merchantUserEmail = merchantUserEmail;
            return this;
        }

        public QueryExecutiveReportRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryExecutiveReportRequestBuilder withSplitPaymentType(
                SplitPaymentType splitPaymentType) {
            this.splitPaymentType = splitPaymentType;
            return this;
        }

        public QueryExecutiveReportRequest build() {
            QueryExecutiveReportRequest request = new QueryExecutiveReportRequest();
            request.authentication = this.authentication;
            request.merchantGroupName = this.merchantGroupName;
            request.merchantBusinessId = this.merchantBusinessId;
            request.merchantUserEmail = this.merchantUserEmail;
            request.dealerCode = this.dealerCode;
            request.splitPaymentType = this.splitPaymentType;
            return request;
        }
    }
}
