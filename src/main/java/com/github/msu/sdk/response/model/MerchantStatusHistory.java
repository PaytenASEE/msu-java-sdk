package com.github.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantStatusHistory {
	private User user;
	private Merchant merchant;
	private String status;
	private String editedTs;

	public User getUser() {
		return user;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public String getStatus() {
		return status;
	}

	public String getEditedTs() {
		return editedTs;
	}

}
