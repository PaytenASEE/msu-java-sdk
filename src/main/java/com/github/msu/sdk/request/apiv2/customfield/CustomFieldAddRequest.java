package com.github.msu.sdk.request.apiv2.customfield;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.InputType;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.CustomFieldAddResponse.class
)
public class CustomFieldAddRequest extends ApiRequest {
    private String integrationCode;

    private String name;

    private String header;

    private String definition;

    private Status status;

    private InputType type;

    private String availabilities;

    private String groups;

    private CustomFieldAddRequest() {
    }

    public static CustomFieldAddRequestBuilder builder() {
        return new CustomFieldAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INTEGRATIONCODE, this.integrationCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAME, this.name);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.HEADER, this.header);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEFINITION, this.definition);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TYPE, this.type);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AVAILABILITIES, this.availabilities);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.GROUPS, this.groups);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMFIELDADD;
    }

    public static final class CustomFieldAddRequestBuilder {
        private String integrationCode;

        private String name;

        private String header;

        private String definition;

        private Status status;

        private InputType type;

        private String availabilities;

        private String groups;

        private Authentication authentication;

        public CustomFieldAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomFieldAddRequestBuilder withIntegrationCode(String integrationCode) {
            this.integrationCode = integrationCode;
            return this;
        }

        public CustomFieldAddRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CustomFieldAddRequestBuilder withHeader(String header) {
            this.header = header;
            return this;
        }

        public CustomFieldAddRequestBuilder withDefinition(String definition) {
            this.definition = definition;
            return this;
        }

        public CustomFieldAddRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public CustomFieldAddRequestBuilder withType(InputType type) {
            this.type = type;
            return this;
        }

        public CustomFieldAddRequestBuilder withAvailabilities(String availabilities) {
            this.availabilities = availabilities;
            return this;
        }

        public CustomFieldAddRequestBuilder withGroups(String groups) {
            this.groups = groups;
            return this;
        }

        public CustomFieldAddRequest build() {
            CustomFieldAddRequest request = new CustomFieldAddRequest();
            request.authentication = this.authentication;
            request.integrationCode = this.integrationCode;
            request.name = this.name;
            request.header = this.header;
            request.definition = this.definition;
            request.status = this.status;
            request.type = this.type;
            request.availabilities = this.availabilities;
            request.groups = this.groups;
            return request;
        }
    }
}
