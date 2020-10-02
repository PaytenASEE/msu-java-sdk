package com.payten.msu.sdk.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.MerchantSharedPaymentSystem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.HashSet;
import java.util.Set;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class QuerySharedPaymentSystemResponse extends ApiResponse {
	@JsonProperty(value = "sharedPaymentSystems")
	@XmlElementWrapper(name = "sharedPaymentSystems")
	@XmlElement(name = "sharedPaymentSystem")
	private Set<MerchantSharedPaymentSystem> sharedPaymentSystems = new HashSet<>();

	public QuerySharedPaymentSystemResponse(Set<MerchantSharedPaymentSystem> sharedPaymentSystems) {
		super();
		this.sharedPaymentSystems = sharedPaymentSystems;
	}

	public Set<MerchantSharedPaymentSystem> getSharedPaymentSystems() {
		return sharedPaymentSystems;
	}

	public void setSharedPaymentSystems(Set<MerchantSharedPaymentSystem> sharedPaymentSystems) {
		this.sharedPaymentSystems = sharedPaymentSystems;
	}
}