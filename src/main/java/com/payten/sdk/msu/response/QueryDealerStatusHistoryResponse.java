package com.payten.sdk.msu.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.DealerStatusHistory;

public class QueryDealerStatusHistoryResponse extends ApiResponse {
	@JsonProperty(value = "dealerStatusHistoryList")
	@XmlElementWrapper(name = "dealerStatusHistoryList")
	@XmlElement(name = "dealerStatusHistory")
	private List<DealerStatusHistory> statusHistoryList;

	public List<DealerStatusHistory> getStatusHistoryList() {
		return statusHistoryList;
	}

	public void setStatusHistoryList(List<DealerStatusHistory> statusHistoryList) {
		this.statusHistoryList = statusHistoryList;
	}
}
