package com.github.msu.sdk.request.apiv2.customfield;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.CustomFieldDeleteResponse.class
)
public class CustomFieldDeleteRequest extends ApiRequest {
    private String code;

    private CustomFieldDeleteRequest() {
    }

    public static CustomFieldDeleteRequestBuilder builder() {
        return new CustomFieldDeleteRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CODE, this.code);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.CUSTOMFIELDDELETE;
    }

    public static final class CustomFieldDeleteRequestBuilder {
        private String code;

        private Authentication authentication;

        public CustomFieldDeleteRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public CustomFieldDeleteRequestBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public CustomFieldDeleteRequest build() {
            CustomFieldDeleteRequest request = new CustomFieldDeleteRequest();
            request.authentication = this.authentication;
            request.code = this.code;
            return request;
        }
    }
}
