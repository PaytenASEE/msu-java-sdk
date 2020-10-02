package com.payten.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.Bin;
import com.payten.msu.sdk.response.model.Transaction;

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

	public String getTotalTransactionCount() {
		return totalTransactionCount;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactionCount(String transactionCount) {
		this.transactionCount = transactionCount;
	}

	public void setTotalTransactionCount(String totalTransactionCount) {
		this.totalTransactionCount = totalTransactionCount;
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
