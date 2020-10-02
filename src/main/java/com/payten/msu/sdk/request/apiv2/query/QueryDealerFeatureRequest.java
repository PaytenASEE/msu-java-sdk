package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryDealerFeatureResponse;

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
