package com.merchantsafeunipay.sdk.request.apiv2.session;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.*;
import com.merchantsafeunipay.sdk.response.SessionTokenEditResponse;
import java.math.BigDecimal;

public class SessionTokenEditRequest extends ApiRequest<SessionTokenEditResponse> {
    private String returnUrl;
    private BigDecimal amount;
    private String sessionToken;

    protected SessionTokenEditRequest() {
    }

    protected SessionTokenEditRequest(SessionTokenEditRequestBuilder builder){
        this.returnUrl = builder.returnUrl;
        this.authentication = builder.authentication;
        this.amount = builder.amount;
        this.sessionToken = builder.sessionToken;
    }

    public static SessionTokenEditRequestBuilder builder() {
        return new SessionTokenEditRequestBuilder();
    }

    @Override
    public Class<SessionTokenEditResponse> responseClass() {
        return SessionTokenEditResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RETURNURL, this.returnUrl);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.SESSIONTOKEN, this.sessionToken);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.EDITSESSIONTOKEN;
    }

    public static class SessionTokenEditRequestBuilder {

        private String returnUrl;

        private BigDecimal amount;

        private Authentication authentication;

        private String sessionToken;

        public SessionTokenEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public SessionTokenEditRequestBuilder withAmount(BigDecimal amount){
            this.amount = amount;
            return this;
        }

        public SessionTokenEditRequestBuilder withSessionToken(String sessionToken){
            this.sessionToken = sessionToken;
            return this;
        }

        public SessionTokenEditRequestBuilder withReturnUrl(String returnUrl){
            this.returnUrl = returnUrl;
            return this;
        }

        public SessionTokenEditRequest build() {
            SessionTokenEditRequest request = new SessionTokenEditRequest();
            request.authentication = this.authentication;
            request.returnUrl = this.returnUrl;
            request.amount = this.amount;
            request.sessionToken = this.sessionToken;
            return request;
        }
    }
}
