package com.github.msu.sdk.request.apiv2.messagecontent;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.MessageContentType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.MessageContentEditResponse.class
)
public class MessageContentEditRequest extends ApiRequest {
    private MessageContentType messageContentType;

    private String language;

    private String title;

    private String content;

    private String isDisplayed;

    private MessageContentEditRequest() {
    }

    public static MessageContentEditRequestBuilder builder() {
        return new MessageContentEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.LANGUAGE, this.language);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TITLE, this.title);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTENT, this.content);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISDISPLAYED, this.isDisplayed);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MESSAGECONTENTEDIT;
    }

    public static final class MessageContentEditRequestBuilder {
        private MessageContentType messageContentType;

        private String language;

        private String title;

        private String content;

        private String isDisplayed;

        private Authentication authentication;

        public MessageContentEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MessageContentEditRequestBuilder withMessageContentType(
                MessageContentType messageContentType) {
            this.messageContentType = messageContentType;
            return this;
        }

        public MessageContentEditRequestBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public MessageContentEditRequestBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public MessageContentEditRequestBuilder withContent(String content) {
            this.content = content;
            return this;
        }

        public MessageContentEditRequestBuilder withIsDisplayed(String isDisplayed) {
            this.isDisplayed = isDisplayed;
            return this;
        }

        public MessageContentEditRequest build() {
            MessageContentEditRequest request = new MessageContentEditRequest();
            request.authentication = this.authentication;
            request.messageContentType = this.messageContentType;
            request.language = this.language;
            request.title = this.title;
            request.content = this.content;
            request.isDisplayed = this.isDisplayed;
            return request;
        }
    }
}
