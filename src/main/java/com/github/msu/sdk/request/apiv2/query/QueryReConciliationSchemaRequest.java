package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryReconciliationSchemaResponse.class
)
public class QueryReConciliationSchemaRequest extends ApiRequest {
    private String name;

    private QueryReConciliationSchemaRequest() {
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAME, this.name);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYRECONCILIATIONSCHEMA;
    }

}
