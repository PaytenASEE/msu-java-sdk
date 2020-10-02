package com.payten.msu.sdk.response;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.request.complex.OrderItem;
import com.payten.msu.sdk.response.model.Customer;
import com.payten.msu.sdk.response.model.Merchant;
import com.payten.msu.sdk.response.model.Session;

public class QuerySessionResponse extends ApiResponse {
	@JsonProperty(value = "session")
	@XmlElementWrapper(name = "session")
	@XmlElement(name = "session")
	private Session sessionVO;
	@JsonProperty(value = "merchant")
	@XmlElementWrapper(name = "merchant")
	@XmlElement(name = "merchant")
	private Merchant merchantVO;
	@JsonProperty(value = "customer")
	@XmlElementWrapper(name = "customer")
	@XmlElement(name = "customer")
	private Customer customerVO;
	@JsonProperty(value = "orderItems")
	@XmlElementWrapper(name = "orderItems")
	@XmlElement(name = "orderItem")
	private Set<OrderItem> orderItems;

	public Session getSessionVO() {
		return sessionVO;
	}

	public Merchant getMerchantVO() {
		return merchantVO;
	}

	public Customer getCustomerVO() {
		return customerVO;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
}
