package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.PaymentSystemForInstallment;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.Set;

public class QueryInstallmentResponse extends ApiResponse {
    @JsonProperty(value = "paymentSystemList")
    @XmlElementWrapper(name = "paymentSystemList")
    @XmlElement(name = "paymentSystem")
    private Set<PaymentSystemForInstallment> paymentSystems;

    public Set<PaymentSystemForInstallment> getPaymentSystems() {
        return paymentSystems;
    }
}
