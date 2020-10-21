package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.request.apiv2.financial.internal.PrimaryTransactionRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.SaleResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = SaleResponse.class
)
public class SaleRequest extends PrimaryTransactionRequest {

    protected SaleRequest(SaleRequestBuilder builder) {
        super(builder);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SALE;
    }

    public static SaleRequestBuilder builder(){
        return new SaleRequestBuilder();
    }

    public static class SaleRequestBuilder extends PrimaryTransactionBuilder<SaleRequestBuilder> {
        @Override
        public SaleRequest build() {
            return new SaleRequest(this);
        }

        @Override
        public SaleRequestBuilder self() {
            return this;
        }
    }
}
