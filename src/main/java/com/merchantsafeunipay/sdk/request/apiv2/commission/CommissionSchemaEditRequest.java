package com.merchantsafeunipay.sdk.request.apiv2.commission;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.CommissionSchemaEditResponse;

public class CommissionSchemaEditRequest extends ApiRequest<CommissionSchemaEditResponse> {

    private String settings;


    @Override
    public Class<CommissionSchemaEditResponse> responseClass() {
        return CommissionSchemaEditResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SETTINGS, this.settings);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.COMMISSIONSCHEMAEDIT;
    }

    public static CommissionSchemaEditRequestBuilder builder() {
        return new CommissionSchemaEditRequestBuilder();
    }

    public static final class CommissionSchemaEditRequestBuilder {
        private String settings;
        private Authentication authentication;

        public CommissionSchemaEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CommissionSchemaEditRequestBuilder withSettings(String settings) {
            this.settings = settings;
            return this;
        }

        public CommissionSchemaEditRequest build() {
            CommissionSchemaEditRequest request = new CommissionSchemaEditRequest();
            request.authentication = this.authentication;
            request.settings = this.settings;
            return request;
        }
    }
}