package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.request.apiv2.session.SessionTokenRequest;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.VoidResponse;

import java.util.LinkedHashMap;
import java.util.Map;

public class VoidRequest extends ApiRequest<VoidResponse> {
    private String pgTranId;
    private String merchantPaymentId;
    private String substatus;
    private String initiatorMerchantBusinessId;
    private Map<String, String> extra;

    private VoidRequest(VoidRequestBuilder builder) {
        super();
        this.pgTranId = builder.pgTranId;
        this.merchantPaymentId = builder.merchantPaymentId;
        this.substatus = builder.substatus;
        this.initiatorMerchantBusinessId = builder.initiatorMerchantBusinessId;
        this.extra = builder.extra;
    }

    public static VoidRequestBuilder builder() {
        return new VoidRequestBuilder();
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.VOID;
    }

    @Override
    public Class<VoidResponse> responseClass() {
        return VoidResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PGTRANID, this.pgTranId);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.SUBSTATUS, this.substatus);
        addToPayload(Param.INITIATORMERCHANTBUSINESSID, this.initiatorMerchantBusinessId);
        addToPayload(Param.EXTRA, this.extra);
    }

    public static class VoidRequestBuilder {
        private String pgTranId;
        private String merchantPaymentId;
        private String substatus;
        private String initiatorMerchantBusinessId;
        private Map<String, String> extra;

        public VoidRequestBuilder withPgTranId(String pgTranId) {
            this.pgTranId = pgTranId;
            return this;
        }

        public VoidRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public VoidRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public VoidRequestBuilder withSubstatus(String substatus) {
            this.substatus = substatus;
            return this;
        }

        public VoidRequestBuilder withInitiatorMerchantBusinessId(String initiatorMerchantBusinessId) {
            this.initiatorMerchantBusinessId = initiatorMerchantBusinessId;
            return this;
        }


        public VoidRequest build() {
            return new VoidRequest(this);
        }
    }
}
