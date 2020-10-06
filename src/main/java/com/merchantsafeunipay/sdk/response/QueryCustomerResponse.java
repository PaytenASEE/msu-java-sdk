package com.merchantsafeunipay.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Customer;

public class QueryCustomerResponse extends ApiResponse {
	@JsonProperty(value = "customerList")
	@XmlElementWrapper(name = "customerList")
	@XmlElement(name = "customer")
	private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
