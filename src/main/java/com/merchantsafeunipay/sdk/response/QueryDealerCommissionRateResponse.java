package com.merchantsafeunipay.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.DealerCommissionRate;

public class QueryDealerCommissionRateResponse extends ApiResponse {
	@JsonProperty(value = "dealerCommissionRateList")
	@XmlElementWrapper(name = "dealerCommissionRateList")
	@XmlElement(name = "dealerCommissionRate")
	private List<DealerCommissionRate> dealerCommissionRates;

	public List<DealerCommissionRate> getDealerCommissionRates() {
		return dealerCommissionRates;
	}
}
