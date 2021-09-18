package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.BinBasedActionRule;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryBinBasedActionResponse extends ApiResponse{

    @JsonProperty(value = "binBasedActionRuleList")
    @XmlElementWrapper(name = "binBasedActionRuleList")
    @XmlElement(name = "binBasedActionRuleList")
    private List<BinBasedActionRule> binBasedActionRuleList;
    public List<BinBasedActionRule> getBinBasedActionRuleList() {
        return binBasedActionRuleList;
    }

    public void setBinBasedActionRuleList(List<BinBasedActionRule> binBasedActionRuleList) {
        this.binBasedActionRuleList = binBasedActionRuleList;
    }

}
