package com.payten.msu.sdk.request.apiv2.reconciliation;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.ReconciliationSchemaEditResponse;

@ResponseInfo(
        responseClass = ReconciliationSchemaEditResponse.class
)
public class ReconciliationSchemaEditRequest extends ApiRequest {
    private String settings;

    private ReconciliationSchemaEditRequest() {
    }

    public static ReConciliationschemaeditRequestBuilder builder() {
        return new ReConciliationschemaeditRequestBuilder();
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
