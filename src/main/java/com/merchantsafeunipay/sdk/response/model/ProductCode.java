package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductCode {

    private String code;
    private String productName;
    private String paymentSystem;
    private String extra;
    private String validFor;
    private List dealerCode;


    public List getDealerCode() {
        return dealerCode;
    }

    public ProductCode() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPaymentSystem() {
        return paymentSystem;
    }

    public void setPaymentSystem(String paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getValidFor() {
        return validFor;
    }

    public void setValidFor(String validFor) {
        this.validFor = validFor;
    }

}