package com.payten.msu.sdk.request.apiv2.financial;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.request.enumerated.TransactionSubStatus;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.response.VoidResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = VoidResponse.class
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
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.SUBSTATUS, this.subStatus);
        addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
        addToPayload(Param.AMOUNT, this.amount);
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
