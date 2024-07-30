package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

public class CommissionSchemaEditResponse extends ApiResponse{
    @JsonProperty(value = "settings")
    @XmlElementWrapper(name = "settings")
    private List<Object> settings = new ArrayList<>();

    public List<Object> getSettings() {
        return settings;
    }
}