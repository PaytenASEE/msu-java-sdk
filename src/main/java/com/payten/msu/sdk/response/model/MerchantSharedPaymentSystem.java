package com.payten.msu.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class MerchantSharedPaymentSystem {
    private String merchant;
    @JsonProperty(value = "paymentSystems")
    @XmlElementWrapper(name = "paymentSystems")
    @XmlElement(name = "paymentSystem")
    private List<SharedPaymentSystem> paymentSystems;

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchantsBusinessId) {
        this.merchant = merchantsBusinessId;
    }

    public List<SharedPaymentSystem> getPaymentSystems() {
        return paymentSystems;
    }

    public void setPaymentSystems(List<SharedPaymentSystem> paymentSystems) {
        this.paymentSystems = paymentSystems;
    }
}