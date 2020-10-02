package com.github.msu.sdk.request.apiv2.session;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;
import java.util.Map;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.EditSessionResponse.class
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.INTERIMPAGEURL, this.interimPageUrl);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.MERCHANTPAYMENTID, this.merchantPaymentId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.EXTRA, this.extra);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CUSTOMER, this.customer);
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
