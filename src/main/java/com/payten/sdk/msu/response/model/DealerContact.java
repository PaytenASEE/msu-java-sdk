package com.payten.sdk.msu.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class DealerContact {
	private String contactName;
	private String contactPhone;
	private String contactEmail;
	private String contactFax;
	private String contactPostCode;
	private String contactAddress;
	private String contactWebAddress;
	private City city;

	public DealerContact() {
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
}
