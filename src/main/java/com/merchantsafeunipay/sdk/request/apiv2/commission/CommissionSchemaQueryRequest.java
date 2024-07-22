package com.merchantsafeunipay.sdk.request.apiv2.commission;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.CommissionSchemaQueryResponse;

public class CommissionSchemaQueryRequest extends ApiRequest<CommissionSchemaQueryResponse> {

    private String name;


    @Override
    public Class<CommissionSchemaQueryResponse> responseClass() {
        return CommissionSchemaQueryResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.NAME, this.name);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCOMMISSIONSCHEMA;
    }

    public static CommissionSchemaQueryRequestBuilder builder() {
        return new CommissionSchemaQueryRequestBuilder();
    }

    public static final class CommissionSchemaQueryRequestBuilder {
        private String name;
        private Authentication authentication;

        public CommissionSchemaQueryRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CommissionSchemaQueryRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }


        public CommissionSchemaQueryRequest build() {
            CommissionSchemaQueryRequest request = new CommissionSchemaQueryRequest();
            request.authentication = this.authentication;
            request.name = this.name;
            return request;
        }
    }
}