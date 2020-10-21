package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryReconciliationSchemaResponse;

public class QueryReConciliationSchemaRequest extends ApiRequest<QueryReconciliationSchemaResponse> {
    private String name;

    private QueryReConciliationSchemaRequest() {
    }

    @Override
    public Class<QueryReconciliationSchemaResponse> responseClass() {
        return QueryReconciliationSchemaResponse.class;
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
