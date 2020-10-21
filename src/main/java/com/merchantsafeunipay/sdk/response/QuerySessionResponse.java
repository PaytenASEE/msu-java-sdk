package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.request.complex.OrderItem;
import com.merchantsafeunipay.sdk.response.model.Customer;
import com.merchantsafeunipay.sdk.response.model.Merchant;
import com.merchantsafeunipay.sdk.response.model.Session;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.Set;

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
