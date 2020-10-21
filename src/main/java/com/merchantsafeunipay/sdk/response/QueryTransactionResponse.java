package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Bin;
import com.merchantsafeunipay.sdk.response.model.Transaction;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryTransactionResponse extends ApiResponse {
    @JsonProperty(value = "bin")
    @XmlElement(name = "bin")
    private Bin bin;
    private String transactionCount;
    private String totalTransactionCount;
    @JsonProperty(value = "transactionList")
    @XmlElementWrapper(name = "transactionList")
    @XmlElement(name = "transaction")
    private List<Transaction> transactions;

    public String getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(String transactionCount) {
        this.transactionCount = transactionCount;
    }

    public String getTotalTransactionCount() {
        return totalTransactionCount;
    }

    public void setTotalTransactionCount(String totalTransactionCount) {
        this.totalTransactionCount = totalTransactionCount;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Bin getBin() {
        return bin;
    }

    public void setBin(Bin binVO) {
        this.bin = binVO;
    }
}
