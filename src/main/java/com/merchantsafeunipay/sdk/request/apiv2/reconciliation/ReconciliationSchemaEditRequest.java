package com.merchantsafeunipay.sdk.request.apiv2.reconciliation;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.ReconciliationSchemaEditResponse;

public class ReconciliationSchemaEditRequest extends ApiRequest<ReconciliationSchemaEditResponse> {
    private String settings;

    private ReconciliationSchemaEditRequest() {
    }

    public static ReConciliationschemaeditRequestBuilder builder() {
        return new ReConciliationschemaeditRequestBuilder();
    }

    @Override
    public Class<ReconciliationSchemaEditResponse> responseClass() {
        return ReconciliationSchemaEditResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SETTINGS, this.settings);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECONCILIATIONSCHEMAEDIT;
    }

    public static final class ReConciliationschemaeditRequestBuilder {
        private String settings;

        private Authentication authentication;

        public ReConciliationschemaeditRequestBuilder withAuthentication(
                Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public ReConciliationschemaeditRequestBuilder withSettings(String settings) {
            this.settings = settings;
            return this;
        }

        public ReconciliationSchemaEditRequest build() {
            ReconciliationSchemaEditRequest request = new ReconciliationSchemaEditRequest();
            request.authentication = this.authentication;
            request.settings = this.settings;
            return request;
        }
    }
}
