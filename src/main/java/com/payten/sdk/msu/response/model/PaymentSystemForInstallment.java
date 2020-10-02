package com.payten.sdk.msu.response.model;

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

	public int getOrdinal() {
		return ordinal;
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

	public String getStatus() {
		return status;
	}

	@Override
	public int compareTo(PaymentSystemForInstallment o) {
		return this.ordinal > o.ordinal ? 1 : this.ordinal < 0 ? -1 : 0;
	}

}
