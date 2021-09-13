package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class binBasedActionRule {
    @JsonProperty("BinBaseRule")
    private String ruleName;
    private String actionType;
    private String bin;
    private String minAmount;
    private String maxAmount;
    private String status;
    private String cardBrand;
    private String cardType;
    private String countryIsoA3;
    private String issuer;
    private String cardNetwork;
    private String merchantErrorMsg;
    private String pageToDisplay;

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }


    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCountryIsoA3() {
        return countryIsoA3;
    }

    public void setCountryIsoA3(String countryIsoA3) {
        this.countryIsoA3 = countryIsoA3;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getCardNetwork() {
        return cardNetwork;
    }

    public void setCardNetwork(String cardNetwork) {
        this.cardNetwork = cardNetwork;
    }

    public String getMerchantErrorMsg() {
        return merchantErrorMsg;
    }

    public void setMerchantErrorMsg(String merchantErrorMsg) {
        this.merchantErrorMsg = merchantErrorMsg;
    }

    public String getPageToDisplay() {
        return pageToDisplay;
    }

    public void setPageToDisplay(String pageToDisplay) {
        this.pageToDisplay = pageToDisplay;
    }
}
