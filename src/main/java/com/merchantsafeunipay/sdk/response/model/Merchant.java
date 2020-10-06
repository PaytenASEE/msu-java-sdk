package com.merchantsafeunipay.sdk.response.model;

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
	private String contactEmail;
	private String additionalDetails;
	private String secretKey;
	private BigDecimal minAmountInstallment;
	private String country;
	private String city;
	private String postCode;
	private DealerType defaultSubdealerType;
	private WalletModel walletModel;
	private List<MerchantUser> merchantUsers;
	private PaymentSystemForInstallment defaultPaymentSystemWithInstallment;
	private Boolean immediateDealerActivation = false;
	private Boolean immediateSubDealerActivation = false;
	private String referrerUrl;
	private String allowUrl;
	private Boolean activateDebitCardSupport;
	private Boolean useBankMerchantId;
	private Boolean insuranceCompany;
	private Boolean allowPreamt;

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public BigDecimal getMinAmountInstallment() {
		return minAmountInstallment;
	}

	public void setMinAmountInstallment(BigDecimal minAmountInstallment) {
		this.minAmountInstallment = minAmountInstallment;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public DealerType getDefaultSubdealerType() {
		return defaultSubdealerType;
	}

	public void setDefaultSubdealerType(DealerType defaultSubdealerType) {
		this.defaultSubdealerType = defaultSubdealerType;
	}

	public WalletModel getWalletModel() {
		return walletModel;
	}

	public void setWalletModel(WalletModel walletModel) {
		this.walletModel = walletModel;
	}

	public List<MerchantUser> getMerchantUsers() {
		return merchantUsers;
	}

	public void setMerchantUsers(List<MerchantUser> merchantUsers) {
		this.merchantUsers = merchantUsers;
	}

	public PaymentSystemForInstallment getDefaultPaymentSystemWithInstallment() {
		return defaultPaymentSystemWithInstallment;
	}

	public void setDefaultPaymentSystemWithInstallment(PaymentSystemForInstallment defaultPaymentSystemWithInstallment) {
		this.defaultPaymentSystemWithInstallment = defaultPaymentSystemWithInstallment;
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

	public String getAllowUrl() {
		return allowUrl;
	}

	public void setAllowUrl(String allowUrl) {
		this.allowUrl = allowUrl;
	}

	public Boolean getActivateDebitCardSupport() {
		return activateDebitCardSupport;
	}

	public void setActivateDebitCardSupport(Boolean activateDebitCardSupport) {
		this.activateDebitCardSupport = activateDebitCardSupport;
	}

	public Boolean getUseBankMerchantId() {
		return useBankMerchantId;
	}

	public void setUseBankMerchantId(Boolean useBankMerchantId) {
		this.useBankMerchantId = useBankMerchantId;
	}

	public Boolean getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(Boolean insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public Boolean getAllowPreamt() {
		return allowPreamt;
	}

	public void setAllowPreamt(Boolean allowPreamt) {
		this.allowPreamt = allowPreamt;
	}
}
