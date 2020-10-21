package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.MerchantGroup;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;


public class QueryGroupsResponse extends ApiResponse {
    @JsonProperty(value = "groupList")
    @XmlElementWrapper(name = "groupList")
    @XmlElement(name = "groupList")
    private List<MerchantGroup> merchantGroups;

    public List<MerchantGroup> getMerchantGroups() {
        return merchantGroups;
    }

    public void setMerchantGroups(List<MerchantGroup> merchantGroups) {
        this.merchantGroups = merchantGroups;
    }
}
