package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Status;
import com.payten.msu.sdk.response.BaseCustomFieldResponse;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;

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
        addToPayload(Param.CODE, this.code);
        addToPayload(Param.STATUS, this.status);
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
