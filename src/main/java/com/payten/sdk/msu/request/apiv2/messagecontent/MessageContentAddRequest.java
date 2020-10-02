package com.payten.sdk.msu.request.apiv2.messagecontent;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.MessageContentType;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.MessageContentAddResponse;

@ResponseInfo(
        responseClass = MessageContentAddResponse.class
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
        addToPayload(Param.TITLE, this.title);
        addToPayload(Param.CONTENT, this.content);
        addToPayload(Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(Param.LANGUAGE, this.language);
        addToPayload(Param.ISDISPLAYED, this.isDisplayed);
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
