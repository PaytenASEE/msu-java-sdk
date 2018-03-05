package com.github.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.msu.sdk.response.model.Merchant;


public class QueryMerchantResponse extends ApiResponse {
	@JsonProperty(value = "merchantList")
	@XmlElementWrapper(name = "merchantList")
	@XmlElement(name = "merchantList")
	private List<Merchant> merchants;

	public List<Merchant> getMerchants() {
		return merchants;
	}

	public void setMerchants(List<Merchant> merchants) {
		this.merchants = merchants;
	}
}
