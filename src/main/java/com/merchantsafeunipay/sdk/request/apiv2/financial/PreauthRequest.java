package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.request.apiv2.financial.internal.PrimaryTransactionRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.response.PreauthResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = PreauthResponse.class)
public class PreauthRequest extends PrimaryTransactionRequest {

    protected PreauthRequest(PreauthRequestBuilder builder) {
        super(builder);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.PREAUTH;
    }

    public static class PreauthRequestBuilder extends PrimaryTransactionBuilder<PreauthRequestBuilder> {

        @Override
        public PreauthRequest build() {
            return new PreauthRequest(this);
        }

        @Override
        public PreauthRequestBuilder self() {
            return this;
        }
    }

    public static PreauthRequestBuilder builder() {
        return new PreauthRequestBuilder();
    }
}
