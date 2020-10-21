package com.merchantsafeunipay.sdk.request.apiv2.financial;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Currency;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.ShouldDo3DResponse;

import java.math.BigDecimal;

public class ShouldDo3DRequest extends ApiRequest<ShouldDo3DResponse> {
    private String cardToken;

    private String bin;

    private BigDecimal amount;

    private Currency currency;

    private ShouldDo3DRequest() {
    }

    public static ShouldDo3dRequestBuilder builder() {
        return new ShouldDo3dRequestBuilder();
    }

    @Override
    public Class<ShouldDo3DResponse> responseClass() {
        return ShouldDo3DResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.BIN, this.bin);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.CURRENCY, this.currency);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.SHOULDDO3D;
    }

    public static final class ShouldDo3dRequestBuilder {
        private String cardToken;

        private String bin;

        private BigDecimal amount;

        private Currency currency;

        private Authentication authentication;

        public ShouldDo3dRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public ShouldDo3dRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public ShouldDo3dRequestBuilder withBin(String bin) {
            this.bin = bin;
            return this;
        }

        public ShouldDo3dRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public ShouldDo3dRequestBuilder withCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ShouldDo3DRequest build() {
            ShouldDo3DRequest request = new ShouldDo3DRequest();
            request.authentication = this.authentication;
            request.cardToken = this.cardToken;
            request.bin = this.bin;
            request.amount = this.amount;
            request.currency = this.currency;
            return request;
        }
    }
}
