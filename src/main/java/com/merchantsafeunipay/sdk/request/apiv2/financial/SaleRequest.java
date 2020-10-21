package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.request.apiv2.financial.internal.PrimaryTransactionRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.SaleResponse;

public class SaleRequest extends PrimaryTransactionRequest<SaleResponse> {

    protected SaleRequest(SaleRequestBuilder builder) {
        super(builder);
    }

    public static SaleRequestBuilder builder() {
        return new SaleRequestBuilder();
    }

    @Override
    public Class<SaleResponse> responseClass() {
        return SaleResponse.class;
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SALE;
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
