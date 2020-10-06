package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryCustomFieldGroupResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = QueryCustomFieldGroupResponse.class
)
public class QueryCustomFieldGroupRequest extends ApiRequest {
    private String code;

    private QueryCustomFieldGroupRequest() {
    }

    public static QueryCustomFieldGroupRequestBuilder builder() {
        return new QueryCustomFieldGroupRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CODE, this.code);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCUSTOMFIELDGROUP;
    }

    public static final class QueryCustomFieldGroupRequestBuilder {
        private String code;

        private Authentication authentication;

        public QueryCustomFieldGroupRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryCustomFieldGroupRequestBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public QueryCustomFieldGroupRequest build() {
            QueryCustomFieldGroupRequest request = new QueryCustomFieldGroupRequest();
            request.authentication = this.authentication;
            request.code = this.code;
            return request;
        }
    }
}
