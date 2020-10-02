package com.payten.sdk.msu.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class CampaignCode {
	@JsonProperty("campaignName")
	private String name;
	@JsonProperty("campaignCode")
	private String code;
	private String minumumAmount;
	private String campaignInstallment;
	private String baseInstallment;
	private String currency;
	private String paymentSystemType;
	private String campaignType;
	private String status;
	private Boolean applyForCreditCard;
	private Boolean applyForBusinessCard;
	private String details;
	private String cardNetwork;

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getMinumumAmount() {
		return minumumAmount;
	}

	public String getCampaignInstallment() {
		return campaignInstallment;
	}

	public String getBaseInstallment() {
		return baseInstallment;
	}

	public String getCurrency() {
		return currency;
	}

	public String getPaymentSystemType() {
		return paymentSystemType;
	}

	public String getCampaignType() {
		return campaignType;
	}

	public String getStatus() {
		return status;
	}

	public Boolean getApplyForCreditCard() {
		return applyForCreditCard;
	}

	public Boolean getApplyForBusinessCard() {
		return applyForBusinessCard;
	}

	public String getDetails() {
		return details;
	}

	public String getCardNetwork() {
		return cardNetwork;
	}

}
