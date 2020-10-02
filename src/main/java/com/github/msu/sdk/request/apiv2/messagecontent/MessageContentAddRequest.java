package com.github.msu.sdk.request.apiv2.messagecontent;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.MessageContentType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.MessageContentAddResponse.class
)
public class MessageContentAddRequest extends ApiRequest {
    private String title;

    private String content;

    private MessageContentType messageContentType;

    private String language;

    private String isDisplayed;

    private MessageContentAddRequest() {
    }

    public static MessageContentAddRequestBuilder builder() {
        return new MessageContentAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TITLE, this.title);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTENT, this.content);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.LANGUAGE, this.language);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISDISPLAYED, this.isDisplayed);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MESSAGECONTENTADD;
    }

    public static final class MessageContentAddRequestBuilder {
        private String title;

        private String content;

        private MessageContentType messageContentType;

        private String language;

        private String isDisplayed;

        private Authentication authentication;

        public MessageContentAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MessageContentAddRequestBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public MessageContentAddRequestBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public MessageContentAddRequestBuilder withMessageContentType(
                MessageContentType messageContentType) {
            this.messageContentType = messageContentType;
            return this;
        }

        public MessageContentAddRequestBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public MessageContentAddRequestBuilder withIsDisplayed(String isDisplayed) {
            this.isDisplayed = isDisplayed;
            return this;
        }

        public MessageContentAddRequest build() {
            MessageContentAddRequest request = new MessageContentAddRequest();
            request.authentication = this.authentication;
            request.title = this.title;
            request.content = this.content;
            request.messageContentType = this.messageContentType;
            request.language = this.language;
            request.isDisplayed = this.isDisplayed;
            return request;
        }
    }
}
