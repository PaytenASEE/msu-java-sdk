package com.payten.sdk.msu.request.apiv2.transaction;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.ApproveTransactionResponse;

@ResponseInfo(
        responseClass = ApproveTransactionResponse.class
)
public class ApproveTransactionRequest extends ApiRequest {
    private String pgTranId;

    private ApproveTransactionRequest() {
    }

    public static ApproveTransactionRequestBuilder builder() {
        return new ApproveTransactionRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PGTRANID, this.pgTranId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.APPROVETRANSACTION;
    }

    public static final class ApproveTransactionRequestBuilder {
        private String pgTranId;

        private Authentication authentication;

        public ApproveTransactionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public ApproveTransactionRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public ApproveTransactionRequest build() {
            ApproveTransactionRequest request = new ApproveTransactionRequest();
            request.authentication = this.authentication;
            request.pgTranId = this.pgTranId;
            return request;
        }
    }
}
