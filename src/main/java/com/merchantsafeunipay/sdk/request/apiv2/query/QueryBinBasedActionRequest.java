package com.merchantsafeunipay.sdk.request.apiv2.query;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryBinBasedActionResponse;

public class QueryBinBasedActionRequest extends ApiRequest<QueryBinBasedActionResponse> {
    private String ruleName;

    private QueryBinBasedActionRequest() {
    }

    public static QueryBinBasedActionRequestBuilder builder() {
        return new QueryBinBasedActionRequestBuilder();
    }

    @Override
    public Class<QueryBinBasedActionResponse> responseClass() {
        return QueryBinBasedActionResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RULENAME, this.ruleName);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYBINBASEDADD;

    }

    public static final class QueryBinBasedActionRequestBuilder {
        private String ruleName;

        public QueryBinBasedActionRequestBuilder withRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public QueryBinBasedActionRequest build() {
            QueryBinBasedActionRequest request = new QueryBinBasedActionRequest();
            request.ruleName = this.ruleName;
            return request;

        }
    }
}



