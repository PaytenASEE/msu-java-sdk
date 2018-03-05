package com.github.msu.sdk.response.model;

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
public class PaymentSystemForMerchant {
	private String name;
	private String type;
	private String eftCode;
	@JsonProperty(value = "installmentList")
	@XmlElementWrapper(name = "installmentList")
	@XmlElement(name = "installment")
	private List<Installment> installments;

	public PaymentSystemForMerchant(String name, List<Installment> installments, String type, String eftCode) {
		super();
		this.name = name;
		this.installments = installments;
		this.type = type;
		this.eftCode = eftCode;
	}

	public PaymentSystemForMerchant() {
		super();
	}

	public String getName() {
		return name;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public String getType() {
		return type;
	}

	public String getEftCode() {
		return eftCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setEftCode(String eftCode) {
		this.eftCode = eftCode;
	}

	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}
}
