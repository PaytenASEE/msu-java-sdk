package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@JsonInclude
@XmlAccessorType(XmlAccessType.FIELD)
public class Point {
    private String name;
    private String value;

    public Point(String pointName, String pointValue) {
        super();
        this.name = pointName;
        this.value = pointValue;
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
