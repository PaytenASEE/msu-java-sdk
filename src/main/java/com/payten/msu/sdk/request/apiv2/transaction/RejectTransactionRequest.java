package com.payten.msu.sdk.request.apiv2.transaction;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.RejectTransactionResponse;

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
