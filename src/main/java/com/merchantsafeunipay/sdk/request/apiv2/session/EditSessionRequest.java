package com.merchantsafeunipay.sdk.request.apiv2.session;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.util.ResponseInfo;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.EditSessionResponse;

import java.math.BigDecimal;
import java.util.Map;

@ResponseInfo(
        responseClass = EditSessionResponse.class
)
public class EditSessionRequest extends ApiRequest {
    private String interimPageUrl;

    private String merchantPaymentId;

    private BigDecimal amount;

    private Map<String, String> extra;

    private String customer;

    private EditSessionRequest() {
    }

    public static EditSessionRequestBuilder builder() {
        return new EditSessionRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.INTERIMPAGEURL, this.interimPageUrl);
        addToPayload(Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.EXTRA, this.extra);
        addToPayload(Param.CUSTOMER, this.customer);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.EDITSESSION;
    }

    public static final class EditSessionRequestBuilder {
        private String interimPageUrl;

        private String merchantPaymentId;

        private BigDecimal amount;

        private Map<String, String> extra;

        private String customer;

        private Authentication authentication;

        public EditSessionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public EditSessionRequestBuilder withInterimPageUrl(String interimPageUrl) {
            this.interimPageUrl = interimPageUrl;
            return this;
        }

        public EditSessionRequestBuilder withMerchantPaymentId(String merchantPaymentId) {
            this.merchantPaymentId = merchantPaymentId;
            return this;
        }

        public EditSessionRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public EditSessionRequestBuilder withExtra(Map<String, String> extra) {
            this.extra = extra;
            return this;
        }

        public EditSessionRequestBuilder withCustomer(String customer) {
            this.customer = customer;
            return this;
        }

        public EditSessionRequest build() {
            EditSessionRequest request = new EditSessionRequest();
            request.authentication = this.authentication;
            request.interimPageUrl = this.interimPageUrl;
            request.merchantPaymentId = this.merchantPaymentId;
            request.amount = this.amount;
            request.extra = this.extra;
            request.customer = this.customer;
            return request;
        }
    }
}
