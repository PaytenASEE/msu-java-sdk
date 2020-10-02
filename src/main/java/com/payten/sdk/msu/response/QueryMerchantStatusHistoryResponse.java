package com.payten.sdk.msu.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.MerchantStatusHistory;

public class QueryMerchantStatusHistoryResponse extends ApiResponse {
	@JsonProperty(value = "merchantStatusHistoryList")
	@XmlElementWrapper(name = "merchantStatusHistoryList")
	@XmlElement(name = "merchantStatusHistory")
	private List<MerchantStatusHistory> statusHistoryList;

	public List<MerchantStatusHistory> getStatusHistoryList() {
		return statusHistoryList;
	}
}
