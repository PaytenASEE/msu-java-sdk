package com.payten.sdk.msu.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.MerchantBinRule;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.Set;

public class QueryMerchantBinRuleResponse extends ApiResponse {

	@JsonProperty(value = "merchantBinRuleList")
	@XmlElementWrapper(name = "merchantBinRuleList")
	@XmlElement(name = "merchantBinRule")
	private Set<MerchantBinRule> merchantBinRules;

	public Set<MerchantBinRule> getMerchantBinRules() {
		return merchantBinRules;
	}

	public void setMerchantBinRules(Set<MerchantBinRule> merchantBinRules) {
		this.merchantBinRules = merchantBinRules;
	}
}
