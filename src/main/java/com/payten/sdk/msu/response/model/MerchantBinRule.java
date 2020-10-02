package com.payten.sdk.msu.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantBinRule {
	private String ruleName;
	private String divertedPaymentSystem;
	private String cardBrand;
	private String cardType;
	private String countryIsoA3;
	private String issuer;
	private String cardNetwork;
	private String amountLowerLimit;
	private String amountUpperLimit;
	private String status;
	private String foreign;
	
	public MerchantBinRule() {
		super();
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getDivertedPaymentSystem() {
		return divertedPaymentSystem;
	}

	public void setDivertedPaymentSystem(String divertedPaymentSystemName) {
		this.divertedPaymentSystem = divertedPaymentSystemName;
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

	public String getAmountLowerLimit() {
		return amountLowerLimit;
	}

	public void setAmountLowerLimit(String amountLowerLimit) {
		this.amountLowerLimit = amountLowerLimit;
	}

	public String getAmountUpperLimit() {
		return amountUpperLimit;
	}

	public void setAmountUpperLimit(String amountUpperLimit) {
		this.amountUpperLimit = amountUpperLimit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getForeign() {
		return foreign;
	}

	public void setForeign(String foreign) {
		this.foreign = foreign;
	}
}
