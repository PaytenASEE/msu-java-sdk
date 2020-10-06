package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.*;
import com.payten.sdk.msu.request.enumerated.*;
import com.merchantsafeunipay.sdk.response.MerchantBinRuleAddResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = MerchantBinRuleAddResponse.class
)
public class MerchantBinRuleAddRequest extends ApiRequest {
    private String ruleName;

    private String divertedPsName;

    private Status status;

    private CardBrand cardBrand;

    private CardType cardType;

    private CardNetwork cardNetwork;

    private String issuer;

    private CountryCode countryIsoA3;

    private BigDecimal amountLowerLimit;

    private BigDecimal amountUpperLimit;

    private YesNo foreign;

    private MerchantBinRuleAddRequest() {
    }

    public static MerchantBinRuleAddRequestBuilder builder() {
        return new MerchantBinRuleAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.RULENAME, this.ruleName);
        addToPayload(Param.DIVERTEDPSNAME, this.divertedPsName);
        addToPayload(Param.STATUS, this.status);
        addToPayload(Param.CARDBRAND, this.cardBrand);
        addToPayload(Param.CARDTYPE, this.cardType);
        addToPayload(Param.CARDNETWORK, this.cardNetwork);
        addToPayload(Param.ISSUER, this.issuer);
        addToPayload(Param.COUNTRYISOA3, this.countryIsoA3);
        addToPayload(Param.AMOUNTLOWERLIMIT, this.amountLowerLimit);
        addToPayload(Param.AMOUNTUPPERLIMIT, this.amountUpperLimit);
        addToPayload(Param.FOREIGN, this.foreign);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTBINRULEADD;
    }

    public static final class MerchantBinRuleAddRequestBuilder {
        private String ruleName;

        private String divertedPsName;

        private Status status;

        private CardBrand cardBrand;

        private CardType cardType;

        private CardNetwork cardNetwork;

        private String issuer;

        private CountryCode countryIsoA3;

        private BigDecimal amountLowerLimit;

        private BigDecimal amountUpperLimit;

        private YesNo foreign;

        private Authentication authentication;

        public MerchantBinRuleAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withDivertedPsName(String divertedPsName) {
            this.divertedPsName = divertedPsName;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withCardBrand(CardBrand cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withCardType(CardType cardType) {
            this.cardType = cardType;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withCardNetwork(CardNetwork cardNetwork) {
            this.cardNetwork = cardNetwork;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withCountryIsoA3(CountryCode countryIsoA3) {
            this.countryIsoA3 = countryIsoA3;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withAmountLowerLimit(BigDecimal amountLowerLimit) {
            this.amountLowerLimit = amountLowerLimit;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withAmountUpperLimit(BigDecimal amountUpperLimit) {
            this.amountUpperLimit = amountUpperLimit;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withForeign(YesNo foreign) {
            this.foreign = foreign;
            return this;
        }

        public MerchantBinRuleAddRequest build() {
            MerchantBinRuleAddRequest request = new MerchantBinRuleAddRequest();
            request.authentication = this.authentication;
            request.ruleName = this.ruleName;
            request.divertedPsName = this.divertedPsName;
            request.status = this.status;
            request.cardBrand = this.cardBrand;
            request.cardType = this.cardType;
            request.cardNetwork = this.cardNetwork;
            request.issuer = this.issuer;
            request.countryIsoA3 = this.countryIsoA3;
            request.amountLowerLimit = this.amountLowerLimit;
            request.amountUpperLimit = this.amountUpperLimit;
            request.foreign = this.foreign;
            return request;
        }
    }
}
