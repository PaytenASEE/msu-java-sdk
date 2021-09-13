package com.merchantsafeunipay.sdk.request.apiv2.query;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ActionType;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.BinBasedActionAddResponse;

public class BinBasedActionAddRequest extends ApiRequest<BinBasedActionAddResponse> {
    private ActionType actionType;
    private String ruleName;
    private Authentication authentication;

    private BinBasedActionAddRequest() {
    }

    public static BinBasedActionAddRequestBuilder builder() {
        return new BinBasedActionAddRequestBuilder();
    }

    @Override
    public Class<BinBasedActionAddResponse> responseClass() {
        return BinBasedActionAddResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RULENAME, this.ruleName);
        addToPayload(Param.ACTIONTYPE, this.actionType);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.BINBASEDACTIONADD;

    }
    public static final class BinBasedActionAddRequestBuilder {
        private ActionType actionType;
        private String ruleName;
        private Authentication authentication;


        public BinBasedActionAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public BinBasedActionAddRequestBuilder withRuleName(String ruleName){
            this.ruleName = ruleName;
            return this;
        }

        public BinBasedActionAddRequestBuilder withActionType(
                ActionType actionType) {
            this.actionType = actionType;
            return this;
        }
        public BinBasedActionAddRequest build() {
            BinBasedActionAddRequest request = new BinBasedActionAddRequest();
            request.actionType= this.actionType;
            request.ruleName = this.ruleName;
            request.authentication = this.authentication;

            return request;

        }
    }
}
