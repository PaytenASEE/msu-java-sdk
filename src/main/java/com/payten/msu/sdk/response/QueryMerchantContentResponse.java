package com.payten.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.MerchantContent;


public class QueryMerchantContentResponse extends ApiResponse {
	@JsonProperty(value = "merchantContentList")
	@XmlElementWrapper(name = "merchantContentList")
	@XmlElement(name = "merchantContent")
	private List<MerchantContent> merchantContents;

	public List<MerchantContent> getMerchantContents() {
		return merchantContents;
	}
}
