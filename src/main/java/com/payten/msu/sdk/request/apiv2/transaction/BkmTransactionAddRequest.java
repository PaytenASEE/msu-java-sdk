package com.payten.msu.sdk.request.apiv2.transaction;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.TransactionType;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.BkmTransactionAddResponse;

@ResponseInfo(
        responseClass = BkmTransactionAddResponse.class
)
public class BkmTransactionAddRequest extends ApiRequest {
    private String bkmToken;

    private String customerIp;

    private TransactionType transactionType;

    private BkmTransactionAddRequest() {
    }

    public static BkmTransactionAddRequestBuilder builder() {
        return new BkmTransactionAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.BKMTOKEN, this.bkmToken);
        addToPayload(Param.CUSTOMERIP, this.customerIp);
        addToPayload(Param.TRANSACTIONTYPE, this.transactionType);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.BKMTRANSACTIONADD;
    }

    public static final class BkmTransactionAddRequestBuilder {
        private String bkmToken;

        private String customerIp;

        private TransactionType transactionType;

        private Authentication authentication;

        public BkmTransactionAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public BkmTransactionAddRequestBuilder withBkmToken(String bkmToken) {
            this.bkmToken = bkmToken;
            return this;
        }

        public BkmTransactionAddRequestBuilder withCustomerIp(String customerIp) {
            this.customerIp = customerIp;
            return this;
        }

        public BkmTransactionAddRequestBuilder withTransactionType(TransactionType transactionType) {
            this.transactionType = transactionType;
            return this;
        }

        public BkmTransactionAddRequest build() {
            BkmTransactionAddRequest request = new BkmTransactionAddRequest();
            request.authentication = this.authentication;
            request.bkmToken = this.bkmToken;
            request.customerIp = this.customerIp;
            request.transactionType = this.transactionType;
            return request;
        }
    }
}
