package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class ReconciliationInstallmentSetting {
	private String identifier;
	private BigDecimal serviceCommissionRate;
	private BigDecimal pointCommissionRate;
	private BigDecimal serviceCutoffRate;
	@JsonProperty(value = "dueDay")
	private List<Integer> dueDays = new ArrayList<>();
	private boolean status;
	
	public ReconciliationInstallmentSetting() {
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public BigDecimal getServiceCommissionRate() {
		return serviceCommissionRate;
	}

	public void setServiceCommissionRate(BigDecimal serviceCommissionRate) {
		this.serviceCommissionRate = serviceCommissionRate;
	}

	public BigDecimal getPointCommissionRate() {
		return pointCommissionRate;
	}

	public void setPointCommissionRate(BigDecimal pointCommissionRate) {
		this.pointCommissionRate = pointCommissionRate;
	}

	public BigDecimal getServiceCutoffRate() {
		return serviceCutoffRate;
	}

	public void setServiceCutoffRate(BigDecimal serviceCutoffRate) {
		this.serviceCutoffRate = serviceCutoffRate;
	}

	public List<Integer> getDueDays() {
		return dueDays;
	}

	public void setDueDays(List<Integer> dueDays) {
		this.dueDays = dueDays;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ReconciliationInstallmentSettingVO [identifier=" + identifier + ", serviceCommissionRate=" + serviceCommissionRate + ", pointCommissionRate="
				+ pointCommissionRate + ", serviceCutoffRate=" + serviceCutoffRate + ", dueDays=" + dueDays + ", status=" + status + "]";
	}
}
