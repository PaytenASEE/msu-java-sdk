package com.payten.msu.sdk.response;

import com.payten.msu.sdk.response.model.Merchant;
import com.payten.msu.sdk.response.model.TransactionStats;

public class QueryTransactionStatsResponse extends ApiResponse {
	private Merchant merchant;
	private TransactionStats transactionStats;

	public Merchant getMerchant() {
		return merchant;
	}

	public TransactionStats getTransactionStats() {
		return transactionStats;
	}

}