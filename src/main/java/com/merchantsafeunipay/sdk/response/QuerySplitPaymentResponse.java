package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.SplitPayment;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

public class QuerySplitPaymentResponse extends ApiResponse {
    @JsonProperty(value = "splitPaymentList")
    @XmlElementWrapper(name = "splitPaymentList")
    @XmlElement(name = "splitPaymentList")
    private List<SplitPayment> splitPaymentList = new ArrayList<>();

    public List<SplitPayment> getSplitPaymentList() {
        return splitPaymentList;
    }

    @JsonProperty(value = "splitPaymentInvoices")
    @XmlElementWrapper(name = "splitPaymentInvoices")
    @XmlElement(name = "splitPaymentInvoices")
    private List<SplitPaymentInvoices> splitPaymentInvoices = new ArrayList<>();

    public List<SplitPaymentInvoices> getSplitPaymentInvoices() {
        return splitPaymentInvoices;
    }
}
