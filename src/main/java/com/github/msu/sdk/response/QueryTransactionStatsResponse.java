package com.github.msu.sdk.response;

import com.github.msu.sdk.response.model.Merchant;
import com.github.msu.sdk.response.model.TransactionStats;

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