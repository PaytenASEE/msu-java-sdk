package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.MessageContentType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMessageContentResponse.class
)
public class QueryMessageContentRequest extends ApiRequest {
    private MessageContentType messageContentType;

    private String language;

    private QueryMessageContentRequest() {
    }

    public static QueryMessageContentRequestBuilder builder() {
        return new QueryMessageContentRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.LANGUAGE, this.language);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMESSAGECONTENT;
    }

    public static final class QueryMessageContentRequestBuilder {
        private MessageContentType messageContentType;

        private String language;

        private Authentication authentication;

        public QueryMessageContentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMessageContentRequestBuilder withMessageContentType(
                MessageContentType messageContentType) {
            this.messageContentType = messageContentType;
            return this;
        }

        public QueryMessageContentRequestBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public QueryMessageContentRequest build() {
            QueryMessageContentRequest request = new QueryMessageContentRequest();
            request.authentication = this.authentication;
            request.messageContentType = this.messageContentType;
            request.language = this.language;
            return request;
        }
    }
}
