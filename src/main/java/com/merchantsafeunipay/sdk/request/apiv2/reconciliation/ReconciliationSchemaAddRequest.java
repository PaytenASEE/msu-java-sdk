package com.merchantsafeunipay.sdk.request.apiv2.reconciliation;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.ReconciliationSchemaAddResponse;

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
