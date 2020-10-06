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
public class PaymentSystemForBin {
	private String name;
	private String eftCode;
	private String type;
	@JsonProperty(value = "installmentList")
	@XmlElementWrapper(name = "installmentList")
	@XmlElement(name = "installment")
	private List<Installment> installments;

	public PaymentSystemForBin(String name, int ordinal, List<Installment> installments,
			String paymentSystemTypeEftCode, String paymentSystemType) {
		super();
		this.name = name;
		this.eftCode = paymentSystemTypeEftCode;
		this.installments = installments;
		this.type = paymentSystemType;
	}

	public PaymentSystemForBin() {
		super();
	}

	public String getName() {
		return name;
	}

	public String getEftCode() {
		return eftCode;
	}

	public String getType() {
		return type;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
}
