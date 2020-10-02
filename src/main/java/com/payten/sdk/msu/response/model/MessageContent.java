package com.payten.sdk.msu.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MessageContent {
	private String messageContentType;
	private String language;
	private String merchantBusinessId;
	private String displayed;
	private String content;

	public String getMessageContentType() {
		return messageContentType;
	}

	public void setMessageContentType(String merchantContentType) {
		this.messageContentType = merchantContentType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDisplayed() {
		return displayed;
	}

	public void setDisplayed(String displayed) {
		this.displayed = displayed;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMerchantBusinessId() {
		return merchantBusinessId;
	}

	public void setMerchantBusinessId(String merchant) {
		this.merchantBusinessId = merchant;
	}
}
