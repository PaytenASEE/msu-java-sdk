package com.merchantsafeunipay.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Dealer;
import com.merchantsafeunipay.sdk.response.model.MerchantUser;

public class QueryMerchantUserDealersResponse extends ApiResponse {
	@JsonProperty(value = "dealerList")
	@XmlElementWrapper(name = "dealerList")
	@XmlElement(name = "dealer")
	private List<Dealer> dealerList;
	private MerchantUser merchantUser;

	public List<Dealer> getDealerList() {
		return dealerList;
	}

	public MerchantUser getMerchantUser() {
		return merchantUser;
	}
}
