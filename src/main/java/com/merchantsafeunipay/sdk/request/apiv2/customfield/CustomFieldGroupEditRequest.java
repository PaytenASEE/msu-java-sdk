package com.merchantsafeunipay.sdk.request.apiv2.customfield;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.CustomFieldGroupBehaviour;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.BaseCustomFieldGroupResponse;

public class CustomFieldGroupEditRequest extends ApiRequest<BaseCustomFieldGroupResponse> {
    private String code;

    private String name;

    private CustomFieldGroupBehaviour behaviour;

    private CustomFieldGroupEditRequest() {
    }

    public static CustomFieldGroupEditRequestBuilder builder() {
        return new CustomFieldGroupEditRequestBuilder();
    }

    @Override
    public Class<BaseCustomFieldGroupResponse> responseClass() {
        return BaseCustomFieldGroupResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CODE, this.code);
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.BEHAVIOUR, this.behaviour);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMFIELDGROUPEDIT;
    }

    public static final class CustomFieldGroupEditRequestBuilder {
        private String code;

        private String name;

        private CustomFieldGroupBehaviour behaviour;

        private Authentication authentication;

        public CustomFieldGroupEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomFieldGroupEditRequestBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public CustomFieldGroupEditRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CustomFieldGroupEditRequestBuilder withBehaviour(CustomFieldGroupBehaviour behaviour) {
            this.behaviour = behaviour;
            return this;
        }

        public CustomFieldGroupEditRequest build() {
            CustomFieldGroupEditRequest request = new CustomFieldGroupEditRequest();
            request.authentication = this.authentication;
            request.code = this.code;
            request.name = this.name;
            request.behaviour = this.behaviour;
            return request;
        }
    }
}
