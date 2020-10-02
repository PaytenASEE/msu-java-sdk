package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.MessageContentType;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryMerchantContentResponse;

@ResponseInfo(
        responseClass = QueryMerchantContentResponse.class
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
        addToPayload(Param.MERCHANTCONTENTID, this.merchantContentId);
        addToPayload(Param.MESSAGECONTENTTYPE, this.messageContentType);
        addToPayload(Param.LANGUAGE, this.language);
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
