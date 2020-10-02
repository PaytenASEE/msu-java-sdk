package com.payten.sdk.msu.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.TransactionRule;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryTransactionRuleResponse extends ApiResponse {
    @JsonProperty(value = "transactionRuleList")
    @XmlElementWrapper(name = "transactionRuleList")
    @XmlElement(name = "transactionRule")
    private List<TransactionRule> transactionRules;

    public List<TransactionRule> getTransactionRules() {
        return transactionRules;
    }

    public void setTransactionRules(List<TransactionRule> transactionRules) {
        this.transactionRules = transactionRules;
    }
}
