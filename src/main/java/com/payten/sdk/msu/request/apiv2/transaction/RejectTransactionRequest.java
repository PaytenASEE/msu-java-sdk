package com.payten.sdk.msu.request.apiv2.transaction;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.RejectTransactionResponse;

@ResponseInfo(
        responseClass = RejectTransactionResponse.class
)
public class RejectTransactionRequest extends ApiRequest {
    private String merchantPaymentId;

    private RejectTransactionRequest() {
    }

    public static RejectTransactionRequestBuilder builder() {
        return new RejectTransactionRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.REJECTTRANSACTION;
    }

    public static final class RejectTransactionRequestBuilder {
        private String merchantPaymentId;

        private Authentication authentication;

        public RejectTransactionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public RejectTransactionRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public RejectTransactionRequest build() {
            RejectTransactionRequest request = new RejectTransactionRequest();
            request.authentication = this.authentication;
            request.merchantPaymentId = this.merchantPaymentId;
            return request;
        }
    }
}
