package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.TransactionRule;

import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class CheckTransactionRuleResponse extends ApiResponse {
    @JsonProperty(value = "transactionRuleList")
    @XmlElementWrapper(name = "transactionRuleList")
    List<TransactionRule> transactionRuleList;

    public List<TransactionRule> getTransactionRuleList() {
        return transactionRuleList;
    }
}