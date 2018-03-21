package com.github.msu.sdk.response;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.msu.sdk.response.model.Transaction;

public class QueryBkmTransactionResponse extends ApiResponse {
    @JsonProperty(value = "bkmTransaction")
    @XmlElement(name = "bkmTransaction")
    private BkmTransactionResponse bkmTransactionVO;
    @JsonProperty(value = "transaction")
    @XmlElement(name = "transaction")
    private Transaction transaction;

    public BkmTransactionResponse getBkmTransactionVO() {
        return bkmTransactionVO;
    }

    public void setBkmTransactionVO(BkmTransactionResponse bkmTransactionVO) {
        this.bkmTransactionVO = bkmTransactionVO;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transactionVO) {
        this.transaction = transactionVO;
    }
}