package com.github.msu.sdk.request.apiv2.query;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.YesNo;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.QueryPaymentSystemsResponse.class
)
public class QueryPaymentSystemsRequest extends ApiRequest {
    private String bin;

    private String cardToken;

    private BigDecimal amount;

    private String dealerTypeName;

    private String dealerCode;

    private String commercecodes;

    private YesNo reflectCommission;

    private YesNo ignorerates;

    private QueryPaymentSystemsRequest() {
    }

    public static QueryPaymentSystemsRequestBuilder builder() {
        return new QueryPaymentSystemsRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.BIN, this.bin);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTOKEN, this.cardToken);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNT, this.amount);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.COMMERCECODES, this.commercecodes);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.REFLECTCOMMISSION, this.reflectCommission);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.IGNORERATES, this.ignorerates);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYPAYMENTSYSTEMS;
    }

    public static final class QueryPaymentSystemsRequestBuilder {
        private String bin;

        private String cardToken;

        private BigDecimal amount;

        private String dealerTypeName;

        private String dealerCode;

        private String commercecodes;

        private YesNo reflectCommission;

        private YesNo ignorerates;

        private Authentication authentication;

        public QueryPaymentSystemsRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryPaymentSystemsRequestBuilder withBin(String bin) {
            this.bin = bin;
            return this;
        }

        public QueryPaymentSystemsRequestBuilder withCardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        public QueryPaymentSystemsRequestBuilder withAmount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public QueryPaymentSystemsRequestBuilder withDealerTypeName(String dealerTypeName) {
            this.dealerTypeName = dealerTypeName;
            return this;
        }

        public QueryPaymentSystemsRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public QueryPaymentSystemsRequestBuilder withCommercecodes(String commercecodes) {
            this.commercecodes = commercecodes;
            return this;
        }

        public QueryPaymentSystemsRequestBuilder withReflectCommission(YesNo reflectCommission) {
            this.reflectCommission = reflectCommission;
            return this;
        }

        public QueryPaymentSystemsRequestBuilder withIgnorerates(YesNo ignorerates) {
            this.ignorerates = ignorerates;
            return this;
        }

        public QueryPaymentSystemsRequest build() {
            QueryPaymentSystemsRequest request = new QueryPaymentSystemsRequest();
            request.authentication = this.authentication;
            request.bin = this.bin;
            request.cardToken = this.cardToken;
            request.amount = this.amount;
            request.dealerTypeName = this.dealerTypeName;
            request.dealerCode = this.dealerCode;
            request.commercecodes = this.commercecodes;
            request.reflectCommission = this.reflectCommission;
            request.ignorerates = this.ignorerates;
            return request;
        }
    }
}
