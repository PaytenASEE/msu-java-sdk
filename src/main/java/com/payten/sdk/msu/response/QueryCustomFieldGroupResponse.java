package com.payten.sdk.msu.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.CustomFieldGroup;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

public class QueryCustomFieldGroupResponse extends ApiResponse {
    @JsonProperty(value = "customFieldGroupList")
    @XmlElementWrapper(name = "customFieldGroupList")
    @XmlElement(name = "customFieldGroupList")
    private List<CustomFieldGroup> customFieldGroups = new ArrayList<>();

    public QueryCustomFieldGroupResponse(List<CustomFieldGroup> customFieldGroups) {
        this.customFieldGroups = customFieldGroups;
    }

    public List<CustomFieldGroup> getCustomFieldGroups() {
        return customFieldGroups;
    }
}