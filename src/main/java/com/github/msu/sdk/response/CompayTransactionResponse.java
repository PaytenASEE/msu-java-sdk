package com.github.msu.sdk.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompayTransactionResponse extends ApiResponse {
	private String compayToken;

	public String getCompayToken() {
		return compayToken;
	}
}
