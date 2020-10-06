package com.merchantsafeunipay.sdk.request.apiv2.transaction;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.ApproveTransactionResponse;

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
