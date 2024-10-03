package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@JsonInclude
@XmlAccessorType(XmlAccessType.FIELD)
public class Point {
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("useRate")
    private String useRate;

    public Point() {
    }

    public Point(String pointName, String pointValue, String useRate, String amount) {
        super();
        this.name = pointName;
        this.value = pointValue;
        this.amount = amount;
        this.useRate = useRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
