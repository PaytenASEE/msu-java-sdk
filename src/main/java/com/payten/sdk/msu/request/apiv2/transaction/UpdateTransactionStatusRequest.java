package com.payten.sdk.msu.request.apiv2.transaction;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.request.enumerated.TransactionStatus;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.response.UpdateTransactionStatusResponse;

@ResponseInfo(
        responseClass = UpdateTransactionStatusResponse.class
)
public class UpdateTransactionStatusRequest extends ApiRequest {
    private String pgTranId;

    private TransactionStatus transactionStatus;

    private UpdateTransactionStatusRequest() {
    }

    public static UpdateTransactionStatusRequestBuilder builder() {
        return new UpdateTransactionStatusRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.TRANSACTIONSTATUS, this.transactionStatus);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.UPDATETRANSACTIONSTATUS;
    }

    public static final class UpdateTransactionStatusRequestBuilder {
        private String pgTranId;

        private TransactionStatus transactionStatus;

        private Authentication authentication;

        public UpdateTransactionStatusRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public UpdateTransactionStatusRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public UpdateTransactionStatusRequestBuilder withTransactionStatus(
                TransactionStatus transactionStatus) {
            this.transactionStatus = transactionStatus;
            return this;
        }

        public UpdateTransactionStatusRequest build() {
            UpdateTransactionStatusRequest request = new UpdateTransactionStatusRequest();
            request.authentication = this.authentication;
            request.pgTranId = this.pgTranId;
            request.transactionStatus = this.transactionStatus;
            return request;
        }
    }
}
