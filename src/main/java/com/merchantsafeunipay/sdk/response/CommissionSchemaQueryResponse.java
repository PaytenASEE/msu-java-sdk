package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

public class CommissionSchemaQueryResponse extends ApiResponse{

    @JsonProperty(value = "name")
    @XmlElementWrapper(name = "name")
    private String name;

    @JsonProperty(value = "activationDate")
    @XmlElementWrapper(name = "activationDate")
    private String activationDate;

    @JsonProperty(value = "endDate")
    @XmlElementWrapper(name = "endDate")
    private String endDate;

    @JsonProperty(value = "settings")
    @XmlElementWrapper(name = "settings")
    private List<Object> settings = new ArrayList<>();

    public List<Object> getSettings() {
        return settings;
    }

    public String getName() {
        return name;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public String getEndDate() {
        return endDate;
    }

}