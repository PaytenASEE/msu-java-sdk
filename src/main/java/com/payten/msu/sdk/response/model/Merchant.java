package com.payten.msu.sdk.response.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Merchant {
	private String businessId;
	private String name;
	private String address;
	private String phone;
	private String fax;
	private String webAddress;
	private String additionalDetails;
	private String secretKey;
	private BigDecimal minAmountInstallment;
	private String country;
	private String city;
	private String postCode;
	private DealerType defaultSubdealerType;
	private String walletModel;
	private List<MerchantUser> merchantUsers;
	private PaymentSystemForInstallment defaultPaymentSystemWithInstallment;
	private Boolean immediateDealerActivation = false;
	private Boolean immediateSubDealerActivation = false;
	private String referrerUrl;

	public String getBusinessId() {
		return businessId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getFax() {
		return fax;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public BigDecimal getMinAmountInstallment() {
		return minAmountInstallment;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getPostCode() {
		return postCode;
	}

	public List<MerchantUser> getMerchantUsers() {
		return merchantUsers;
	}

	public void setMerchantUsers(List<MerchantUser> merchantUsers) {
		this.merchantUsers = merchantUsers;
	}

	public String getWalletModel() {
		return walletModel;
	}

	public void setWalletModel(String walletModel) {
		this.walletModel = walletModel;
	}

	public PaymentSystemForInstallment getDefaultPaymentSystemWithInstallment() {
		return defaultPaymentSystemWithInstallment;
	}

	public void setDefaultPaymentSystemWithInstallment(
			PaymentSystemForInstallment defaultPaymentSystemWithInstallment) {
		this.defaultPaymentSystemWithInstallment = defaultPaymentSystemWithInstallment;
	}

	public DealerType getDefaultSubdealerType() {
		return defaultSubdealerType;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public void setMinAmountInstallment(BigDecimal minAmountInstallment) {
		this.minAmountInstallment = minAmountInstallment;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public void setDefaultSubdealerType(DealerType defaultSubdealerType) {
		this.defaultSubdealerType = defaultSubdealerType;
	}

	public Boolean getImmediateDealerActivation() {
		return immediateDealerActivation;
	}

	public void setImmediateDealerActivation(Boolean immediateDealerActivation) {
		this.immediateDealerActivation = immediateDealerActivation;
	}

	public Boolean getImmediateSubDealerActivation() {
		return immediateSubDealerActivation;
	}

	public void setImmediateSubDealerActivation(Boolean immediateSubDealerActivation) {
		this.immediateSubDealerActivation = immediateSubDealerActivation;
	}

	public String getReferrerUrl() {
		return referrerUrl;
	}

	public void setReferrerUrl(String referrerUrl) {
		this.referrerUrl = referrerUrl;
	}
}
