package com.payten.sdk.msu.request.apiv2.query;

import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.QueryReconciliationSchemaResponse;

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
