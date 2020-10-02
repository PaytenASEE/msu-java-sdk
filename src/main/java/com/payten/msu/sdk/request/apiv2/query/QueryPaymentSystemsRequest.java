package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.request.enumerated.YesNo;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.response.QueryPaymentSystemsResponse;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = QueryPaymentSystemsResponse.class
)
public class QueryPaymentSystemsRequest extends ApiRequest {
    private String bin;

    private String cardToken;

    private BigDecimal amount;

    private String dealerTypeName;

    private String dealerCode;

    private String commercecodes;

    private YesNo reflectCommission;

    private YesNo ignoreRates;

    private QueryPaymentSystemsRequest() {
    }

    public static QueryPaymentSystemsRequestBuilder builder() {
        return new QueryPaymentSystemsRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.BIN, this.bin);
        addToPayload(Param.CARDTOKEN, this.cardToken);
        addToPayload(Param.AMOUNT, this.amount);
        addToPayload(Param.DEALERTYPENAME, this.dealerTypeName);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.COMMERCECODES, this.commercecodes);
        addToPayload(Param.REFLECTCOMMISSION, this.reflectCommission);
        addToPayload(Param.IGNORERATES, this.ignoreRates);
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

        private YesNo ignoreRates;

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

        public QueryPaymentSystemsRequestBuilder withIgnoreRates(YesNo ignoreRates) {
            this.ignoreRates = ignoreRates;
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
            request.ignoreRates = this.ignoreRates;
            return request;
        }
    }
}
