package com.payten.sdk.msu.request.apiv2.reconciliation;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.ReconciliationSchemaAddResponse;

@ResponseInfo(
        responseClass = ReconciliationSchemaAddResponse.class
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
        addToPayload(Param.SETTINGS, this.settings);
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
