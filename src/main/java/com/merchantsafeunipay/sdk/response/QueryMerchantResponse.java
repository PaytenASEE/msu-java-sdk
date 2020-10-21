package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Merchant;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;


public class QueryMerchantResponse extends ApiResponse {
    @JsonProperty(value = "merchantList")
    @XmlElementWrapper(name = "merchantList")
    @XmlElement(name = "merchantList")
    private List<Merchant> merchants;

    public List<Merchant> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<Merchant> merchants) {
        this.merchants = merchants;
    }
}
