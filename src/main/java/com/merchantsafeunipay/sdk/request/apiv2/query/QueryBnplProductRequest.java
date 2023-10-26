package com.merchantsafeunipay.sdk.request.apiv2.query;
import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.response.QueryBnplProductResponse;

public class QueryBnplProductRequest extends ApiRequest<QueryBnplProductResponse> {

    private String paymentSystem;

    private String dealerCode;

    private String validFor;

    private String code;

    private QueryBnplProductRequest() {
    }

    public static QueryBnplProductRequestBuilder builder() {
        return new QueryBnplProductRequestBuilder();
    }

    @Override
    public Class<QueryBnplProductResponse> responseClass() {
        return QueryBnplProductResponse.class;
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PAYMENTSYSTEM, this.paymentSystem);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.VALIDFOR, this.validFor);
        addToPayload(Param.CODE, this.code);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYBNPLPRODUCT;
    }

    public static final class QueryBnplProductRequestBuilder {
        private String paymentSystem;

        private String dealerCode;

        private String validFor;

        private String code;

        private Authentication authentication;

        public QueryBnplProductRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public QueryBnplProductRequestBuilder withPaymentSystem(String paymentSystem) {
            this.paymentSystem = paymentSystem;
            return this;
        }

        public QueryBnplProductRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }


        public QueryBnplProductRequestBuilder withValidFor(String validFor) {
            this.validFor = validFor;
            return this;
        }

        public QueryBnplProductRequestBuilder withCode(String code) {
            this.code = code;
            return this;
        }

        public QueryBnplProductRequest build() {
            QueryBnplProductRequest request = new QueryBnplProductRequest();
            request.authentication = this.authentication;
            request.paymentSystem = this.paymentSystem;
            request.dealerCode = this.dealerCode;
            request.validFor = this.validFor;
            request.code = this.code;
            return request;
        }
    }
}