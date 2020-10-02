package com.github.msu.sdk.request.apiv2.financial;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.TransactionSubStatus;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.VoidResponse.class
)
public class VoidRequest extends ApiRequest {
    private String pgTranId;

    private String merchantPaymentId;

    private TransactionSubStatus subStatus;

    private String initiatorMerchantBusinessId;

    private BigDecimal amount;

    private VoidRequest() {
    }

    public static VoidRequestBuilder builder() {
        return new VoidRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANID, this.pgTranId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SUBSTATUS, this.subStatus);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.VOID;
    }

    public static final class VoidRequestBuilder {
        private String pgTranId;

        private String merchantPaymentId;

        private TransactionSubStatus subStatus;

        private String initiatorMerchantBusinessId;

        private BigDecimal amount;

        private Authentication authentication;

        public VoidRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public VoidRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public VoidRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public VoidRequestBuilder withSubStatus(TransactionSubStatus subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public VoidRequestBuilder withInitiatorMerchantBusinessId(String initiatorMerchantBusinessId) {
            this.initiatorMerchantBusinessId = initiatorMerchantBusinessId;
            return this;
        }

        public VoidRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public VoidRequest build() {
            VoidRequest request = new VoidRequest();
            request.authentication = this.authentication;
            request.pgTranId = this.pgTranId;
            request.merchantPaymentId = this.merchantPaymentId;
            request.subStatus = this.subStatus;
            request.initiatorMerchantBusinessId = this.initiatorMerchantBusinessId;
            request.amount = this.amount;
            return request;
        }
    }
}
