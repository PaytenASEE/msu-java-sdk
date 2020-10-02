package com.payten.msu.sdk.response.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.payten.msu.sdk.request.enumerated.CommissionType;

public class Commission {
	private BigDecimal rate;
	private Boolean adjust = Boolean.FALSE;
	private CommissionType type;
	@JsonInclude(Include.NON_NULL)
	private BigDecimal appliedCommissionRate;
	@JsonInclude(Include.NON_NULL)
	private BigDecimal finalAmount;
	

	public Commission() {
		super();
	}

	public Commission(BigDecimal rate, Boolean adjust, CommissionType type) {
		super();
		this.rate = rate;
		this.adjust = adjust;
		this.type = type;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public Boolean getAdjust() {
		return adjust;
	}

	public CommissionType getType() {
		return type;
	}

	public BigDecimal getAppliedCommissionRate() {
		return appliedCommissionRate;
	}

	public void setAppliedCommissionRate(BigDecimal appliedCommissionRate) {
		this.appliedCommissionRate = appliedCommissionRate;
	}

	public BigDecimal getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(BigDecimal finalAmount) {
		this.finalAmount = finalAmount;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public void setAdjust(Boolean adjust) {
		this.adjust = adjust;
	}

	public void setType(CommissionType type) {
		this.type = type;
	}
}
