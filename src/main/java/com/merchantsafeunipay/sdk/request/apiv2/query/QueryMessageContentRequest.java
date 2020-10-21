package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.MessageContentType;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryMessageContentResponse;

public class QueryMessageContentRequest extends ApiRequest<QueryMessageContentResponse> {
    private MessageContentType messageContentType;

    private String language;

    private QueryMessageContentRequest() {
    }

    public static QueryMessageContentRequestBuilder builder() {
        return new QueryMessageContentRequestBuilder();
    }

    @Override
    public Class<QueryMessageContentResponse> responseClass() {
        return QueryMessageContentResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(Param.LANGUAGE, this.language);
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
