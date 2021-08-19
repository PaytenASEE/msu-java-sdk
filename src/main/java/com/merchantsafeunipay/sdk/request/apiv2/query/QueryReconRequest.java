package com.merchantsafeunipay.sdk.request.apiv2.query;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.PaymentSystemType;
import com.merchantsafeunipay.sdk.response.QueryReconResponse;

public class QueryReconRequest extends ApiRequest<QueryReconResponse> {

    private PaymentSystemType paymentSystemType;
    private String pgOrderId;
    private String pgTranApprCode;
    private String startDate;
    private String endDate;


    private QueryReconRequest() {
    }

    public static QueryReconRequest.QueryReconRequestRequestBuilder builder() {
        return new QueryReconRequest.QueryReconRequestRequestBuilder();
    }

    @Override
    public Class<QueryReconResponse> responseClass() {
        return QueryReconResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEMTYPE, this.paymentSystemType);
        addToPayload(Param.PGORDERID,this.pgOrderId);
        addToPayload(Param.PGTRANAPPRCODE, this.pgTranApprCode);
        addToPayload(Param.STARTDATE, this.startDate);
        addToPayload(Param.ENDDATE, this.endDate);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYRECON;
    }

    public static final class QueryReconRequestRequestBuilder {

        private PaymentSystemType paymentSystemType;
        private String pgOrderId;
        private String pgTranApprCode;
        private String startDate;
        private String endDate;

        public QueryReconRequestRequestBuilder withPaymentSystemType(PaymentSystemType paymentSystemType) {
            this.paymentSystemType = paymentSystemType;
            return this;
        }

        public QueryReconRequestRequestBuilder withPgOrderId(String pgOrderId) {
            this.pgOrderId = pgOrderId;
            return this;
        }

        public QueryReconRequestRequestBuilder withPgApprCode(String pgTranApprCode) {
            this.pgTranApprCode = pgTranApprCode;
            return this;
        }

        public QueryReconRequestRequestBuilder withStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public QueryReconRequestRequestBuilder withEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public QueryReconRequest build() {
            QueryReconRequest request = new QueryReconRequest();
            request.paymentSystemType = this.paymentSystemType;
            request.pgOrderId = this.pgOrderId;
            request.pgTranApprCode = this.pgTranApprCode;
            request.startDate = this.startDate;
            request.endDate = this.endDate;

            return request;
        }
    }
}
