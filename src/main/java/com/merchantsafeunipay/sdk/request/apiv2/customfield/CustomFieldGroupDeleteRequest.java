package com.merchantsafeunipay.sdk.request.apiv2.customfield;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.BaseCustomFieldGroupResponse;

@ResponseInfo(
        responseClass = BaseCustomFieldGroupResponse.class
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
        addToPayload(Param.CODE, this.code);
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
