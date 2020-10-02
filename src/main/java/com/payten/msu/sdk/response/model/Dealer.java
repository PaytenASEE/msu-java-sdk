package com.payten.msu.sdk.response.model;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Dealer {
	private String code;
	private String parentCode;
	private String parentName;
	private String name;
	private String tckn;
	private String vkn;
	private String createdTime;
	private String status;
	private String contactName;
	private String contactPhone;
	private String contactEmail;
	private String contactFax;
	private String contactPostCode;
	private String contactAddress;
	private String contactWebAddress;
	private City city;
	private Merchant merchant;
	private DealerType dealerType;
	private Set<DealerType> dealerTypes;
	private MerchantUser merchantUser;

	public String getCode() {
		return code;
	}

	public String getParentCode() {
		return parentCode;
	}

	public String getParentName() {
		return parentName;
	}

	public String getName() {
		return name;
	}

	public String getTckn() {
		return tckn;
	}

	public String getVkn() {
		return vkn;
	}

	public String getCreatedTime() {
		return createdTime;
	}

	public String getStatus() {
		return status;
	}

	public String getContactName() {
		return contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public String getContactFax() {
		return contactFax;
	}

	public String getContactPostCode() {
		return contactPostCode;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public String getContactWebAddress() {
		return contactWebAddress;
	}

	public City getCity() {
		return city;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public DealerType getDealerType() {
		return dealerType;
	}

	public Set<DealerType> getDealerTypes() {
		return dealerTypes;
	}

	public MerchantUser getMerchantUser() {
		return merchantUser;
	}

}
