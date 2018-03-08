package com.github.msu.sdk.request;

import com.github.msu.sdk.MsuApiClient;
import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.authentication.credentials.providers.StaticCredentialsProvider;
import com.github.msu.sdk.authentication.types.UserCredentialsAuthentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.Action;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryMessageContentResponse;
import com.github.msu.sdk.util.ResponseInfo;

import java.util.Map;

@ResponseInfo(responseClass = QueryMessageContentResponse.class)
public class QueryMessageContentRequest extends ApiRequest {

    private String messageContentType;
    private String language;

    @Override
    public Map<String, String> getFormUrlEncodedData() {
        addToPayload(Param.ACTION, Action.QUERYMESSAGECONTENT);
        addToPayload(Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(Param.LANGUAGE, this.language);
        return payload;
    }

    public static QueryMessageContentRequestBuilder builder(){
        return new QueryMessageContentRequestBuilder();
    }

    public static final class QueryMessageContentRequestBuilder {
        private String messageContentType;
        private String language;

        private QueryMessageContentRequestBuilder() {
        }

        public QueryMessageContentRequestBuilder withMessageContentType(String messageContentType) {
            this.messageContentType = messageContentType;
            return this;
        }

        public QueryMessageContentRequestBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public QueryMessageContentRequest build() {
            QueryMessageContentRequest queryMessageContentRequest = new QueryMessageContentRequest();
            queryMessageContentRequest.language = this.language;
            queryMessageContentRequest.messageContentType = this.messageContentType;
            return queryMessageContentRequest;
        }
    }
}
