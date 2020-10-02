package com.github.msu.sdk.request.apiv2.transaction;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.TransactionStatus;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.UpdateTransactionStatusResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANID, this.pgTranId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TRANSACTIONSTATUS, this.transactionStatus);
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
