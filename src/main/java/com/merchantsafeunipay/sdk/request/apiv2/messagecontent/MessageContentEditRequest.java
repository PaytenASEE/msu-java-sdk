package com.merchantsafeunipay.sdk.request.apiv2.messagecontent;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.MessageContentType;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.MessageContentEditResponse;

public class MessageContentEditRequest extends ApiRequest<MessageContentEditResponse> {
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
    public Class<MessageContentEditResponse> responseClass() {
        return MessageContentEditResponse.class;
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
