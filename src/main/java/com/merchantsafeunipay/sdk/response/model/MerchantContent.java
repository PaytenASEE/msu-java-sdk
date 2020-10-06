package com.merchantsafeunipay.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantContent {
	private String merchantContentType;
	private String language;
	private String merchant;
	private String displayed;
	private String content;

	public String getMerchantContentType() {
		return merchantContentType;
	}

	public String getLanguage() {
		return language;
	}

	public String getMerchant() {
		return merchant;
	}

	public String getDisplayed() {
		return displayed;
	}

	public String getContent() {
		return content;
	}
}
