package com.merchantsafeunipay.sdk.request.apiv2.customfield;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.CustomFieldDeleteResponse;

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
