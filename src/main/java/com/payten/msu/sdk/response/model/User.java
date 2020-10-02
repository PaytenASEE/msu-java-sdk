package com.payten.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class User {
	private String name;
	private String email;
	private String status;
	private String timeZone;
	private String lastLogin;
	private String expiryDate;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getStatus() {
		return status;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

}
