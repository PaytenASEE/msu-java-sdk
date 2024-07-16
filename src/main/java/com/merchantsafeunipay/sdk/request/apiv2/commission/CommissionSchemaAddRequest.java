package com.merchantsafeunipay.sdk.request.apiv2.commission;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.CommissionSchemaAddResponse;

public class CommissionSchemaAddRequest extends ApiRequest<CommissionSchemaAddResponse> {

    private String settings;


    @Override
    public Class<CommissionSchemaAddResponse> responseClass() {
        return CommissionSchemaAddResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.SETTINGS, this.settings);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.COMMISSIONSCHEMAADD;
    }

    public static CommissionSchemaAddRequestBuilder builder() {
        return new CommissionSchemaAddRequestBuilder();
    }

    public static final class CommissionSchemaAddRequestBuilder {
        private String settings;
        private Authentication authentication;

        public CommissionSchemaAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CommissionSchemaAddRequestBuilder withSettings(String settings) {
            this.settings = settings;
            return this;
        }

        public CommissionSchemaAddRequest build() {
            CommissionSchemaAddRequest request = new CommissionSchemaAddRequest();
            request.authentication = this.authentication;
            request.settings = this.settings;
            return request;
        }
    }
}