package com.github.msu.sdk.request.apiv2.transaction;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.BkmTransactionEditResponse.class
)
public class BkmTransactionEditRequest extends ApiRequest {
    private String bkmToken;

    private String paymentSystem;

    private String installments;

    private String bin;

    private String pgOrderId;

    private String bkmTransactionStatus;

    private String pgTranApprcode;

    private String pgTranReFid;

    private String pgTranId;

    private String pgTranErrorCode;

    private String pgTranErrorText;

    private BkmTransactionEditRequest() {
    }

    public static BkmTransactionEditRequestBuilder builder() {
        return new BkmTransactionEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BKMTOKEN, this.bkmToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BIN, this.bin);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGORDERID, this.pgOrderId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BKMTRANSACTIONSTATUS, this.bkmTransactionStatus);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANAPPRCODE, this.pgTranApprcode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANREFID, this.pgTranReFid);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANID, this.pgTranId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANERRORCODE, this.pgTranErrorCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANERRORTEXT, this.pgTranErrorText);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.BKMTRANSACTIONEDIT;
    }

    public static final class BkmTransactionEditRequestBuilder {
        private String bkmToken;

        private String paymentSystem;

        private String installments;

        private String bin;

        private String pgOrderId;

        private String bkmTransactionStatus;

        private String pgTranApprcode;

        private String pgTranReFid;

        private String pgTranId;

        private String pgTranErrorCode;

        private String pgTranErrorText;

        private Authentication authentication;

        public BkmTransactionEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public BkmTransactionEditRequestBuilder withBkmToken(String bkmToken) {
            this.bkmToken = bkmToken;
            return this;
        }

        public BkmTransactionEditRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public BkmTransactionEditRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public BkmTransactionEditRequestBuilder withBin(String bin) {
            this.bin = bin;
            return this;
        }

        public BkmTransactionEditRequestBuilder withPgOrderId(String pgOrderId) {
            this.pgOrderId = pgOrderId;
            return this;
        }

        public BkmTransactionEditRequestBuilder withBkmTransactionStatus(String bkmTransactionStatus) {
            this.bkmTransactionStatus = bkmTransactionStatus;
            return this;
        }

        public BkmTransactionEditRequestBuilder withPgTranApprcode(String pgTranApprcode) {
            this.pgTranApprcode = pgTranApprcode;
            return this;
        }

        public BkmTransactionEditRequestBuilder withPgTranReFid(String pgTranReFid) {
            this.pgTranReFid = pgTranReFid;
            return this;
        }

        public BkmTransactionEditRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public BkmTransactionEditRequestBuilder withPgTranErrorCode(String pgTranErrorCode) {
            this.pgTranErrorCode = pgTranErrorCode;
            return this;
        }

        public BkmTransactionEditRequestBuilder withPgTranErrorText(String pgTranErrorText) {
            this.pgTranErrorText = pgTranErrorText;
            return this;
        }

        public BkmTransactionEditRequest build() {
            BkmTransactionEditRequest request = new BkmTransactionEditRequest();
            request.authentication = this.authentication;
            request.bkmToken = this.bkmToken;
            request.paymentSystem = this.paymentSystem;
            request.installments = this.installments;
            request.bin = this.bin;
            request.pgOrderId = this.pgOrderId;
            request.bkmTransactionStatus = this.bkmTransactionStatus;
            request.pgTranApprcode = this.pgTranApprcode;
            request.pgTranReFid = this.pgTranReFid;
            request.pgTranId = this.pgTranId;
            request.pgTranErrorCode = this.pgTranErrorCode;
            request.pgTranErrorText = this.pgTranErrorText;
            return request;
        }
    }
}
