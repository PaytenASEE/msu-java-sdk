package com.github.msu.sdk.request.apiv2.merchant;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.*;
import com.github.msu.sdk.util.ResponseInfo;

import java.math.BigDecimal;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.MerchantBinRuleAddResponse.class
)
public class MerchantBinRuleAddRequest extends ApiRequest {
    private String ruleName;

    private String divertedpsname;

    private Status status;

    private CardBrand cardBrand;

    private CardType cardType;

    private CardNetwork cardNetwork;

    private String issuer;

    private CountryCode countryIsoA3;

    private BigDecimal amountLowerLimit;

    private BigDecimal amountUpperLimit;

    private YesNo forEIgn;

    private MerchantBinRuleAddRequest() {
    }

    public static MerchantBinRuleAddRequestBuilder builder() {
        return new MerchantBinRuleAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.RULENAME, this.ruleName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DIVERTEDPSNAME, this.divertedpsname);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.STATUS, this.status);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDBRAND, this.cardBrand);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDTYPE, this.cardType);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CARDNETWORK, this.cardNetwork);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ISSUER, this.issuer);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.COUNTRYISOA3, this.countryIsoA3);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNTLOWERLIMIT, this.amountLowerLimit);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.AMOUNTUPPERLIMIT, this.amountUpperLimit);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.FOREIGN, this.forEIgn);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.MERCHANTBINRULEADD;
    }

    public static final class MerchantBinRuleAddRequestBuilder {
        private String ruleName;

        private String divertedpsname;

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

        public MerchantBinRuleAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public MerchantBinRuleAddRequestBuilder withDivertedpsname(String divertedpsname) {
            this.divertedpsname = divertedpsname;
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

        public MerchantBinRuleAddRequestBuilder withForEIgn(YesNo forEIgn) {
            this.forEIgn = forEIgn;
            return this;
        }

        public MerchantBinRuleAddRequest build() {
            MerchantBinRuleAddRequest request = new MerchantBinRuleAddRequest();
            request.authentication = this.authentication;
            request.ruleName = this.ruleName;
            request.divertedpsname = this.divertedpsname;
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
