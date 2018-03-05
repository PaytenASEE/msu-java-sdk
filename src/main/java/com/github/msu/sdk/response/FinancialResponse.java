package com.github.msu.sdk.response;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.msu.sdk.request.enumerated.Currency;
import com.github.msu.sdk.response.model.CampaignCode;
import com.github.msu.sdk.response.model.CampaignOnline;
import com.github.msu.sdk.response.model.Point;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({ "action", "merchant", "amount", "installment", "currency" })
@XmlType(propOrder = { "action", "merchant", "amount", "installment", "currency" })
public class FinancialResponse extends ApiResponse {
	private String merchant;
	private BigDecimal amount;
	private String installment;
	private Currency currency;
	@JsonProperty(value = "points")
	private List<Point> points;
	@JsonProperty(value = "campaigns")
	private List<CampaignOnline> campaigns;
	private BigDecimal finalAmount;
	private BigDecimal commissionRate;
	private BigDecimal commissionAppliedAmount;
	@JsonProperty(value = "campaign")
	@XmlElementWrapper(name = "campaign")
	@XmlElement(name = "campaign")
	private CampaignCode campaignCodeVO;

	public String getMerchant() {
		return merchant;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getInstallment() {
		return installment;
	}

	public Currency getCurrency() {
		return currency;
	}

	public List<Point> getPoints() {
		return points;
	}

	public List<CampaignOnline> getCampaigns() {
		return campaigns;
	}

	public BigDecimal getFinalAmount() {
		return finalAmount;
	}

	public BigDecimal getCommissionRate() {
		return commissionRate;
	}

	public BigDecimal getCommissionAppliedAmount() {
		return commissionAppliedAmount;
	}

	public CampaignCode getCampaignCodeVO() {
		return campaignCodeVO;
	}

}
