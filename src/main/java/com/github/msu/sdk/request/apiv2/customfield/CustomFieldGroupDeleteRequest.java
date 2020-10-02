package com.github.msu.sdk.request.apiv2.customfield;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.BaseCustomFieldGroupResponse.class
)
public class CustomFieldGroupDeleteRequest extends ApiRequest {
    private String code;

    private CustomFieldGroupDeleteRequest() {
    }

    public static CustomFieldGroupDeleteRequestBuilder builder() {
        return new CustomFieldGroupDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CODE, this.code);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMFIELDGROUPDELETE;
    }

    public static final class CustomFieldGroupDeleteRequestBuilder {
        private String code;

        private Authentication authentication;

        public CustomFieldGroupDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomFieldGroupDeleteRequestBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public CustomFieldGroupDeleteRequest build() {
            CustomFieldGroupDeleteRequest request = new CustomFieldGroupDeleteRequest();
            request.authentication = this.authentication;
            request.code = this.code;
            return request;
        }
    }
}
