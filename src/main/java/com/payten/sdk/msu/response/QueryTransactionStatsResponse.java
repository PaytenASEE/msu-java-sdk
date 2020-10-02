package com.payten.sdk.msu.response;

import com.payten.sdk.msu.response.model.Merchant;
import com.payten.sdk.msu.response.model.TransactionStats;

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