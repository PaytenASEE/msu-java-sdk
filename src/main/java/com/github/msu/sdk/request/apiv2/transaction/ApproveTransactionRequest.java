package com.github.msu.sdk.request.apiv2.transaction;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.ApproveTransactionResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANID, this.pgTranId);
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
