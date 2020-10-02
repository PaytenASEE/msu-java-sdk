package com.github.msu.sdk.request.apiv2.recon;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.ReconciliationSchemaEditResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SETTINGS, this.settings);
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
