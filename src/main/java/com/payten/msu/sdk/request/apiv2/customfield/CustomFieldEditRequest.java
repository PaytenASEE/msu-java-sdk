package com.payten.msu.sdk.request.apiv2.customfield;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.InputType;
import com.payten.msu.sdk.request.enumerated.Status;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.CustomFieldEditResponse;

@ResponseInfo(
        responseClass = CustomFieldEditResponse.class
)
public class CustomFieldEditRequest extends ApiRequest {
    private String code;

    private String integrationCode;

    private String name;

    private String header;

    private Status status;

    private InputType type;

    private String availabilities;

    private String definition;

    private String groups;

    private CustomFieldEditRequest() {
    }

    public static CustomFieldEditRequestBuilder builder() {
        return new CustomFieldEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CODE, this.code);
        addToPayload(Param.INTEGRATIONCODE, this.integrationCode);
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.HEADER, this.header);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.TYPE, this.type);
        addToPayload(Param.AVAILABILITIES, this.availabilities);
        addToPayload(Param.DEFINITION, this.definition);
        addToPayload(Param.GROUPS, this.groups);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMFIELDEDIT;
    }

    public static final class CustomFieldEditRequestBuilder {
        private String code;

        private String integrationCode;

        private String name;

        private String header;

        private Status status;

        private InputType type;

        private String availabilities;

        private String definition;

        private String groups;

        private Authentication authentication;

        public CustomFieldEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomFieldEditRequestBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public CustomFieldEditRequestBuilder withIntegrationCode(String integrationCode) {
            this.integrationCode = integrationCode;
            return this;
        }

        public CustomFieldEditRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CustomFieldEditRequestBuilder withHeader(String header) {
            this.header = header;
            return this;
        }

        public CustomFieldEditRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public CustomFieldEditRequestBuilder withType(InputType type) {
            this.type = type;
            return this;
        }

        public CustomFieldEditRequestBuilder withAvailabilities(String availabilities) {
            this.availabilities = availabilities;
            return this;
        }

        public CustomFieldEditRequestBuilder withDefinition(String definition) {
            this.definition = definition;
            return this;
        }

        public CustomFieldEditRequestBuilder withGroups(String groups) {
            this.groups = groups;
            return this;
        }

        public CustomFieldEditRequest build() {
            CustomFieldEditRequest request = new CustomFieldEditRequest();
            request.authentication = this.authentication;
            request.code = this.code;
            request.integrationCode = this.integrationCode;
            request.name = this.name;
            request.header = this.header;
            request.status = this.status;
            request.type = this.type;
            request.availabilities = this.availabilities;
            request.definition = this.definition;
            request.groups = this.groups;
            return request;
        }
    }
}
