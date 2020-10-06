package com.merchantsafeunipay.sdk.response.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentSystemForInstallment implements Comparable<PaymentSystemForInstallment> {
	private String name;
	private String type;
	private String eftCode;
	private String status;
	private Boolean adjustRates;
	@JsonProperty(value = "paymentSystem")
	@XmlElement(name = "paymentSystem")
	private int ordinal;
	@JsonProperty(value = "installmentList")
	@XmlElementWrapper(name = "installmentList")
	@XmlElement(name = "installment")
	private List<Installment> installments;

	public PaymentSystemForInstallment() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEftCode() {
		return eftCode;
	}

	public void setEftCode(String eftCode) {
		this.eftCode = eftCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getAdjustRates() {
		return adjustRates;
	}

	public void setAdjustRates(Boolean adjustRates) {
		this.adjustRates = adjustRates;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}

	@Override
	public int compareTo(PaymentSystemForInstallment o) {
		return this.ordinal > o.ordinal ? 1 : this.ordinal < 0 ? -1 : 0;
	}

}
