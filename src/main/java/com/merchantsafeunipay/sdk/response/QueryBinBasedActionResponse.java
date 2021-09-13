package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.binBasedActionRule;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryBinBasedActionResponse extends ApiResponse{
    @JsonProperty(value = "binBasedActionRuleList")
    @XmlElementWrapper(name = "binBasedActionRuleList")
    @XmlElement(name = "binBasedActionRuleList")
    private List<binBasedActionRule> binBasedActionRuleList;
    public List<binBasedActionRule> getBinBasedActionRuleList() {
        return binBasedActionRuleList;
    }

    public void setBinBasedActionRuleList(List<binBasedActionRule> binBasedActionRuleList) {
        this.binBasedActionRuleList = binBasedActionRuleList;
    }

}
