package com.payten.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.MerchantUser;

public class QueryMerchantUserResponse extends ApiResponse {
	@JsonProperty(value = "merchantUserList")
	@XmlElementWrapper(name = "merchantUserList")
	@XmlElement(name = "merchantUser")
	private List<MerchantUser> merchantUserList;

	public List<MerchantUser> getMerchantUserList() {
		return merchantUserList;
	}
}
