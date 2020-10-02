package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryReconciliationSchemaResponse;

@ResponseInfo(
        responseClass = QueryReconciliationSchemaResponse.class
)
public class QueryReConciliationSchemaRequest extends ApiRequest {
    private String name;

    private QueryReConciliationSchemaRequest() {
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.NAME, this.name);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYRECONCILIATIONSCHEMA;
    }

}
