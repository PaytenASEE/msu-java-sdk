package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryReconciliationSchemaResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

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
