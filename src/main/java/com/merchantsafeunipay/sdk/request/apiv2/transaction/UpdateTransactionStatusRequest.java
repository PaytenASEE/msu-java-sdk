package com.merchantsafeunipay.sdk.request.apiv2.transaction;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.TransactionStatus;
import com.merchantsafeunipay.sdk.response.UpdateTransactionStatusResponse;

public class UpdateTransactionStatusRequest extends ApiRequest<UpdateTransactionStatusResponse> {
    private String pgTranId;

    private TransactionStatus transactionStatus;

    private UpdateTransactionStatusRequest() {
    }

    public static UpdateTransactionStatusRequestBuilder builder() {
        return new UpdateTransactionStatusRequestBuilder();
    }

    @Override
    public Class<UpdateTransactionStatusResponse> responseClass() {
        return UpdateTransactionStatusResponse.class;
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
