package com.merchantsafeunipay.sdk.response.model;

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
public class PaymentSystemForMerchant {
    private String name;
    private String type;
    private String eftCode;
    @JsonProperty(value = "installmentList")
    @XmlElementWrapper(name = "installmentList")
    @XmlElement(name = "installment")
    private List<Installment> installments;

    public PaymentSystemForMerchant(String name, List<Installment> installments, String type, String eftCode) {
        super();
        this.name = name;
        this.installments = installments;
        this.type = type;
        this.eftCode = eftCode;
    }

    public PaymentSystemForMerchant() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(List<Installment> installments) {
        this.installments = installments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEftCode() {
        return eftCode;
    }

    public void setEftCode(String eftCode) {
        this.eftCode = eftCode;
    }
}
