package com.github.msu.sdk.response.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantUser {
	private User user;
	private String role;
	private String status;
	private String merchantUserId;
	private String activationHash;
	private List<Dealer> dealers;

	public MerchantUser() {}

	public User getUser() {
		return user;
	}

	public String getRole() {
		return role;
	}

	public String getStatus() {
		return status;
	}

	public String getMerchantUserId() {
		return merchantUserId;
	}

	public String getActivationHash() {
		return activationHash;
	}

	public List<Dealer> getDealers() {
		return dealers;
	}
}
