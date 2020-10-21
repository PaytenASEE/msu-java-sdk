package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Transaction;

import javax.xml.bind.annotation.XmlElement;

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