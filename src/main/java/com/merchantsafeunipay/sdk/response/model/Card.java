package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class Card {
    private String cardToken;
    private String cardOwnerMasked;
    private String cardOwner;
    private String PAN;
    private String panIin;
    private String panLast4;
    private String customer;
    private String cardHash;
    private String cardBin;
    private String cardbrand;
    private String cardType;
    private String cardLevel;
    private String cardNetwork;
    private String cardIssuer;
    private String cardVirtual;
    private String cardCountryIso;
    private String cardPaymentSystem;
    private String cardStatus;
    private String cardExpiry;
    private String cardName;
    private String count;
    private String dealerCode;
    private String createdDate;
    private String lastUpdateDate;
    private String cutoffDay;

    public Card() {
    }

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    public String getCardOwnerMasked() {
        return cardOwnerMasked;
    }

    public void setCardOwnerMasked(String cardOwnerMasked) {
        this.cardOwnerMasked = cardOwnerMasked;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getPanIin() {
        return panIin;
    }

    public void setPanIin(String panIin) {
        this.panIin = panIin;
    }

    public String getPanLast4() {
        return panLast4;
    }

    public void setPanLast4(String panLast4) {
        this.panLast4 = panLast4;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCardHash() {
        return cardHash;
    }

    public void setCardHash(String cardHash) {
        this.cardHash = cardHash;
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public String getCardbrand() {
        return cardbrand;
    }

    public void setCardbrand(String cardbrand) {
        this.cardbrand = cardbrand;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(String cardLevel) {
        this.cardLevel = cardLevel;
    }

    public String getCardNetwork() {
        return cardNetwork;
    }

    public void setCardNetwork(String cardNetwork) {
        this.cardNetwork = cardNetwork;
    }

    public String getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public String getCardVirtual() {
        return cardVirtual;
    }

    public void setCardVirtual(String cardVirtual) {
        this.cardVirtual = cardVirtual;
    }

    public String getCardCountryIso() {
        return cardCountryIso;
    }

    public void setCardCountryIso(String cardCountryIso) {
        this.cardCountryIso = cardCountryIso;
    }

    public String getCardPaymentSystem() {
        return cardPaymentSystem;
    }

    public void setCardPaymentSystem(String cardPaymentSystem) {
        this.cardPaymentSystem = cardPaymentSystem;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getCardExpiry() {
        return cardExpiry;
    }

    public void setCardExpiry(String cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getCutoffDay() {
        return cutoffDay;
    }

    public void setCutoffDay(String cutoffDay) {
        this.cutoffDay = cutoffDay;
    }
}
