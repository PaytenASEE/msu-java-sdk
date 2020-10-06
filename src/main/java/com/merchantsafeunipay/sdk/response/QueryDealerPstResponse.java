package com.merchantsafeunipay.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.DealerPST;


public class QueryDealerPstResponse extends ApiResponse {
	@JsonProperty(value = "dealerPSTList")
	@XmlElementWrapper(name = "dealerPSTList")
	@XmlElement(name = "dealerPST")
	private List<DealerPST> dealerPSTs;

	public List<DealerPST> getDealerPSTs() {
		return dealerPSTs;
	}

	public void setDealerPSTs(List<DealerPST> dealerPSTs) {
		this.dealerPSTs = dealerPSTs;
	}
}
