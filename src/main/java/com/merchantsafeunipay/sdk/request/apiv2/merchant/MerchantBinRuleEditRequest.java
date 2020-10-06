package com.merchantsafeunipay.sdk.request.apiv2.merchant;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.*;
import com.payten.sdk.msu.request.enumerated.*;
import com.merchantsafeunipay.sdk.response.MerchantBinRuleEditResponse;
import com.merchantsafeunipay.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = MerchantBinRuleEditResponse.class
)
public class MerchantBinRuleEditRequest extends ApiRequest {
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

    private YesNo forEIgn;

    private MerchantBinRuleEditRequest() {
    }

    public static MerchantBinRuleEditRequestBuilder builder() {
        return new MerchantBinRuleEditRequestBuilder();
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
        addToPayload(Param.FOREIGN, this.forEIgn);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTBINRULEEDIT;
    }

    public static final class MerchantBinRuleEditRequestBuilder {
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

        private YesNo forEIgn;

        private Authentication authentication;

        public MerchantBinRuleEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withDivertedPsName(String divertedPsName) {
            this.divertedPsName = divertedPsName;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withCardBrand(CardBrand cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withCardType(CardType cardType) {
            this.cardType = cardType;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withCardNetwork(CardNetwork cardNetwork) {
            this.cardNetwork = cardNetwork;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withCountryIsoA3(CountryCode countryIsoA3) {
            this.countryIsoA3 = countryIsoA3;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withAmountLowerLimit(BigDecimal amountLowerLimit) {
            this.amountLowerLimit = amountLowerLimit;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withAmountUpperLimit(BigDecimal amountUpperLimit) {
            this.amountUpperLimit = amountUpperLimit;
            return this;
        }

        public MerchantBinRuleEditRequestBuilder withForEIgn(YesNo forEIgn) {
            this.forEIgn = forEIgn;
            return this;
        }

        public MerchantBinRuleEditRequest build() {
            MerchantBinRuleEditRequest request = new MerchantBinRuleEditRequest();
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
            request.forEIgn = this.forEIgn;
            return request;
        }
    }
}
