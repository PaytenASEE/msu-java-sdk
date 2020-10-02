package com.github.msu.sdk.request.apiv2.recon;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.ReconciliationSchemaAddResponse.class
)
public class ReconciliationSchemaAddRequest extends ApiRequest {
    private String settings;

    private ReconciliationSchemaAddRequest() {
    }

    public static ReConciliationschemaaddRequestBuilder builder() {
        return new ReConciliationschemaaddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.SETTINGS, this.settings);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.RECONCILIATIONSCHEMAADD;
    }

    public static final class ReConciliationschemaaddRequestBuilder {
        private String settings;

        private Authentication authentication;

        public ReConciliationschemaaddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public ReConciliationschemaaddRequestBuilder withSettings(String settings) {
            this.settings = settings;
            return this;
        }

        public ReconciliationSchemaAddRequest build() {
            ReconciliationSchemaAddRequest request = new ReconciliationSchemaAddRequest();
            request.authentication = this.authentication;
            request.settings = this.settings;
            return request;
        }
    }
}
