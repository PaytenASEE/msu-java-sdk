package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.merchantsafeunipay.sdk.request.enumerated.CommissionType;

import java.math.BigDecimal;

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

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Boolean getAdjust() {
        return adjust;
    }

    public void setAdjust(Boolean adjust) {
        this.adjust = adjust;
    }

    public CommissionType getType() {
        return type;
    }

    public void setType(CommissionType type) {
        this.type = type;
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
}
