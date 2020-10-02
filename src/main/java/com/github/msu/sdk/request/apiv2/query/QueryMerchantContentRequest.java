package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.MessageContentType;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryMerchantContentResponse.class
)
public class QueryMerchantContentRequest extends ApiRequest {
    private String merchantContentId;

    private MessageContentType messageContentType;

    private String language;

    private QueryMerchantContentRequest() {
    }

    public static QueryMerchantContentRequestBuilder builder() {
        return new QueryMerchantContentRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTCONTENTID, this.merchantContentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.LANGUAGE, this.language);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYMERCHANTCONTENT;
    }

    public static final class QueryMerchantContentRequestBuilder {
        private String merchantContentId;

        private MessageContentType messageContentType;

        private String language;

        private Authentication authentication;

        public QueryMerchantContentRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryMerchantContentRequestBuilder withMerchantContentId(String merchantContentId) {
            this.merchantContentId = merchantContentId;
            return this;
        }

        public QueryMerchantContentRequestBuilder withMessageContentType(
                MessageContentType messageContentType) {
            this.messageContentType = messageContentType;
            return this;
        }

        public QueryMerchantContentRequestBuilder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public QueryMerchantContentRequest build() {
            QueryMerchantContentRequest request = new QueryMerchantContentRequest();
            request.authentication = this.authentication;
            request.merchantContentId = this.merchantContentId;
            request.messageContentType = this.messageContentType;
            request.language = this.language;
            return request;
        }
    }
}
