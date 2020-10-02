package com.payten.msu.sdk.request.apiv2.messagecontent;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.MessageContentType;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.MessageContentEditResponse;

@ResponseInfo(
        responseClass = MessageContentEditResponse.class
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
        addToPayload(Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(Param.LANGUAGE, this.language);
        addToPayload(Param.TITLE, this.title);
        addToPayload(Param.CONTENT, this.content);
        addToPayload(Param.ISDISPLAYED, this.isDisplayed);
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
