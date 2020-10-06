package com.merchantsafeunipay.sdk.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class SessionExtendResponse extends ApiResponse {
	private String token;
	private String expiry;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String dueDate) {
		this.expiry = dueDate;
	}
}
