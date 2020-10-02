package com.payten.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.Invoice;

public class QueryInvoiceResponse extends ApiResponse {
	@JsonProperty(value = "invoiceList")
	@XmlElementWrapper(name = "invoiceList")
	@XmlElement(name = "invoice")
	private List<Invoice> invoices;

	public List<Invoice> getInvoices() {
		return invoices;
	}
}
