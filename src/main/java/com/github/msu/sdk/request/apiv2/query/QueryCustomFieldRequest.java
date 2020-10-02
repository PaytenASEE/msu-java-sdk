package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Status;
import com.github.msu.sdk.response.BaseCustomFieldResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = BaseCustomFieldResponse.class
)
public class QueryCustomFieldRequest extends ApiRequest {
    private String code;

    private Status status;

    private QueryCustomFieldRequest() {
    }

    public static QueryCustomFieldRequestBuilder builder() {
        return new QueryCustomFieldRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CODE, this.code);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYCUSTOMFIELD;
    }

    public static final class QueryCustomFieldRequestBuilder {
        private String code;

        private Status status;

        private Authentication authentication;

        public QueryCustomFieldRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryCustomFieldRequestBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public QueryCustomFieldRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public QueryCustomFieldRequest build() {
            QueryCustomFieldRequest request = new QueryCustomFieldRequest();
            request.authentication = this.authentication;
            request.code = this.code;
            request.status = this.status;
            return request;
        }
    }
}
