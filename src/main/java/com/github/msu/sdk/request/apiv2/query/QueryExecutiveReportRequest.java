package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.SplitPaymentType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryExecutiveReportResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTGROUPNAME, this.merchantGroupName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTBUSINESSID, this.merchantBusinessId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTUSEREMAIL, this.merchantUserEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SPLITPAYMENTTYPE, this.splitPaymentType);
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
