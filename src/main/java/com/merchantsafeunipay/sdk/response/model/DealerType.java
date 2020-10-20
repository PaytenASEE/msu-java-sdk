package com.merchantsafeunipay.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.LinkedHashSet;
import java.util.Set;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class DealerType {
	private String name;
	private Integer maxInstallmentCount;
	private Integer commerceCode;
	private Boolean descriptionRequired;
	private Boolean descriptionPresent;
	private Merchant merchant;
	private Set<PaymentSystemForMerchant> paymentSystems = new LinkedHashSet<>();

	public String getName() {
		return name;
	}

	public Integer getMaxInstallmentCount() {
		return maxInstallmentCount;
	}

	public Integer getCommerceCode() {
		return commerceCode;
	}

	public Boolean getDescriptionRequired() {
		return descriptionRequired;
	}

	public Boolean getDescriptionPresent() {
		return descriptionPresent;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public Set<PaymentSystemForMerchant> getPaymentSystems() {
		return paymentSystems;
	}
}
