package com.payten.sdk.msu.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BkmTransactionResponse extends ApiResponse {
    private String bkmToken;

    public String getBkmToken() {
        return bkmToken;
    }

    public void setBkmToken(String bkmToken) {
        this.bkmToken = bkmToken;
    }
}