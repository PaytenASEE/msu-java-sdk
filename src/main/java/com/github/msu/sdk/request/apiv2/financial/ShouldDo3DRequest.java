package com.github.msu.sdk.request.apiv2.financial;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.ShouldDo3DResponse.class
)
public class ShouldDo3DRequest extends ApiRequest {
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
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BIN, this.bin);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CURRENCY, this.currency);
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
