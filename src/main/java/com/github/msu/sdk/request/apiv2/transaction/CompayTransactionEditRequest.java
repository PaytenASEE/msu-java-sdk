package com.github.msu.sdk.request.apiv2.transaction;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.CompayTransactionEditResponse.class
)
public class CompayTransactionEditRequest extends ApiRequest {
    private String compayToken;

    private String installments;

    private String pgTranReFid;

    private String pgTranDate;

    private String pgTranId;

    private String pgTranApprcode;

    private String pgTranReturnCode;

    private String pgOrderId;

    private String pgTranErrorCode;

    private String pgTranErrorText;

    private String currency;

    private String compayResponseCode;

    private CompayTransactionEditRequest() {
    }

    public static CompayTransactionEditRequestBuilder builder() {
        return new CompayTransactionEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.COMPAYTOKEN, this.compayToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INSTALLMENTS, this.installments);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANREFID, this.pgTranReFid);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANDATE, this.pgTranDate);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANID, this.pgTranId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANAPPRCODE, this.pgTranApprcode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANRETURNCODE, this.pgTranReturnCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGORDERID, this.pgOrderId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANERRORCODE, this.pgTranErrorCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PGTRANERRORTEXT, this.pgTranErrorText);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.COMPAYRESPONSECODE, this.compayResponseCode);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.COMPAYTRANSACTIONEDIT;
    }

    public static final class CompayTransactionEditRequestBuilder {
        private String compayToken;

        private String installments;

        private String pgTranReFid;

        private String pgTranDate;

        private String pgTranId;

        private String pgTranApprcode;

        private String pgTranReturnCode;

        private String pgOrderId;

        private String pgTranErrorCode;

        private String pgTranErrorText;

        private String currency;

        private String compayResponseCode;

        private Authentication authentication;

        public CompayTransactionEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CompayTransactionEditRequestBuilder withCompayToken(String compayToken) {
            this.compayToken = compayToken;
            return this;
        }

        public CompayTransactionEditRequestBuilder withInstallments(String installments) {
            this.installments = installments;
            return this;
        }

        public CompayTransactionEditRequestBuilder withPgTranReFid(String pgTranReFid) {
            this.pgTranReFid = pgTranReFid;
            return this;
        }

        public CompayTransactionEditRequestBuilder withPgTranDate(String pgTranDate) {
            this.pgTranDate = pgTranDate;
            return this;
        }

        public CompayTransactionEditRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public CompayTransactionEditRequestBuilder withPgTranApprcode(String pgTranApprcode) {
            this.pgTranApprcode = pgTranApprcode;
            return this;
        }

        public CompayTransactionEditRequestBuilder withPgTranReturnCode(String pgTranReturnCode) {
            this.pgTranReturnCode = pgTranReturnCode;
            return this;
        }

        public CompayTransactionEditRequestBuilder withPgOrderId(String pgOrderId) {
            this.pgOrderId = pgOrderId;
            return this;
        }

        public CompayTransactionEditRequestBuilder withPgTranErrorCode(String pgTranErrorCode) {
            this.pgTranErrorCode = pgTranErrorCode;
            return this;
        }

        public CompayTransactionEditRequestBuilder withPgTranErrorText(String pgTranErrorText) {
            this.pgTranErrorText = pgTranErrorText;
            return this;
        }

        public CompayTransactionEditRequestBuilder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public CompayTransactionEditRequestBuilder withCompayResponseCode(String compayResponseCode) {
            this.compayResponseCode = compayResponseCode;
            return this;
        }

        public CompayTransactionEditRequest build() {
            CompayTransactionEditRequest request = new CompayTransactionEditRequest();
            request.authentication = this.authentication;
            request.compayToken = this.compayToken;
            request.installments = this.installments;
            request.pgTranReFid = this.pgTranReFid;
            request.pgTranDate = this.pgTranDate;
            request.pgTranId = this.pgTranId;
            request.pgTranApprcode = this.pgTranApprcode;
            request.pgTranReturnCode = this.pgTranReturnCode;
            request.pgOrderId = this.pgOrderId;
            request.pgTranErrorCode = this.pgTranErrorCode;
            request.pgTranErrorText = this.pgTranErrorText;
            request.currency = this.currency;
            request.compayResponseCode = this.compayResponseCode;
            return request;
        }
    }
}
