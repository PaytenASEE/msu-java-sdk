package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Invoice;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryInvoiceResponse extends ApiResponse {
    @JsonProperty(value = "invoiceList")
    @XmlElementWrapper(name = "invoiceList")
    @XmlElement(name = "invoice")
    private List<Invoice> invoices;

    public List<Invoice> getInvoices() {
        return invoices;
    }
}
