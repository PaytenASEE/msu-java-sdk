package com.payten.sdk.msu.request.apiv2.transaction;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.BkmTransactionEditResponse;

@ResponseInfo(
        responseClass = BkmTransactionEditResponse.class
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
        addToPayload(Param.BKMTOKEN, this.bkmToken);
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.INSTALLMENTS, this.installments);
        addToPayload(Param.BIN, this.bin);
        addToPayload(Param.PGORDERID, this.pgOrderId);
        addToPayload(Param.BKMTRANSACTIONSTATUS, this.bkmTransactionStatus);
        addToPayload(Param.PGTRANAPPRCODE, this.pgTranApprcode);
        addToPayload(Param.PGTRANREFID, this.pgTranReFid);
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.PGTRANERRORCODE, this.pgTranErrorCode);
        addToPayload(Param.PGTRANERRORTEXT, this.pgTranErrorText);
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
