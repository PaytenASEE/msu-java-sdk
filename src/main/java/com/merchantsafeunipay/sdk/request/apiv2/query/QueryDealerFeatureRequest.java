package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryDealerFeatureResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = QueryDealerFeatureResponse.class
)
public class QueryDealerFeatureRequest extends ApiRequest {
    private String feature;

    private QueryDealerFeatureRequest() {
    }

    public static QueryDealerFeatureRequestBuilder builder() {
        return new QueryDealerFeatureRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.FEATURE, this.feature);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYDEALERFEATURE;
    }

    public static final class QueryDealerFeatureRequestBuilder {
        private String feature;

        private Authentication authentication;

        public QueryDealerFeatureRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryDealerFeatureRequestBuilder withFeature(String feature) {
            this.feature = feature;
            return this;
        }

        public QueryDealerFeatureRequest build() {
            QueryDealerFeatureRequest request = new QueryDealerFeatureRequest();
            request.authentication = this.authentication;
            request.feature = this.feature;
            return request;
        }
    }
}
