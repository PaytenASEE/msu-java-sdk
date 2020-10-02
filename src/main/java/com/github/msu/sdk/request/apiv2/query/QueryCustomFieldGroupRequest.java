package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryCustomFieldGroupResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CODE, this.code);
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
