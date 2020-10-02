package com.payten.sdk.msu.request.apiv2.customfield;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.CustomFieldDeleteResponse;

@ResponseInfo(
        responseClass = CustomFieldDeleteResponse.class
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
        addToPayload(Param.CODE, this.code);
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
