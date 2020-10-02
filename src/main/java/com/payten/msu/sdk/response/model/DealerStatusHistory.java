package com.payten.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class DealerStatusHistory {
	private User user;
	private Dealer dealer;
	private String status;
	private String editedTs;
	private String reason;

	public User getUser() {
		return user;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public String getStatus() {
		return status;
	}

	public String getEditedTs() {
		return editedTs;
	}

	public String getReason() {
		return reason;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setEditedTs(String editedTs) {
		this.editedTs = editedTs;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
