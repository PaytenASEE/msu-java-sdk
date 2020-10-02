package com.payten.sdk.msu.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.Dealer;
import com.payten.sdk.msu.response.model.MerchantUser;

public class QueryDealerResponse extends ApiResponse {
	@JsonProperty(value = "dealerList")
	@XmlElementWrapper(name = "dealerList")
	@XmlElement(name = "dealer")
	private List<Dealer> dealers;
	@JsonProperty(value = "merchantUserList")
	@XmlElementWrapper(name = "merchantUserList")
	@XmlElement(name = "merchantUser")
	private List<MerchantUser> merchantUserList;

	public List<Dealer> getDealers() {
		return dealers;
	}

	public List<MerchantUser> getMerchantUserList() {
		return merchantUserList;
	}

}
