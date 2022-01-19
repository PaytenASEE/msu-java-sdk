package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.PaymentSystemForBin;

import javax.xml.bind.annotation.XmlElement;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryPaymentSystemsResponse extends ApiResponse {
    @JsonProperty(value = "installmentPaymentSystem")
    @XmlElement(name = "installmentPaymentSystem")
    private PaymentSystemForBin installmentPaymentSystem;
    @JsonProperty(value = "oneShotPaymentSystem")
    @XmlElement(name = "oneShotPaymentSystem")
    private PaymentSystemForBin oneShotPaymentSystem;

    public PaymentSystemForBin getInstallmentPaymentSystem() {
        return installmentPaymentSystem;
    }

    public PaymentSystemForBin getOneShotPaymentSystem() {
        return oneShotPaymentSystem;
    }

}
