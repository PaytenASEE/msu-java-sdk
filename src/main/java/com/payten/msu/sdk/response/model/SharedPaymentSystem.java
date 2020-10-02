package com.payten.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.payten.msu.sdk.request.enumerated.PaymentSystemType;
import com.payten.msu.sdk.request.enumerated.Status;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class SharedPaymentSystem {
    private String name;
    private Status status;
    private PaymentSystemType type;

    public String getName() {
        return name;
    }

    public void setName(String paymentSystemName) {
        this.name = paymentSystemName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public PaymentSystemType getType() {
        return type;
    }

    public void setType(PaymentSystemType type) {
        this.type = type;
    }
}
