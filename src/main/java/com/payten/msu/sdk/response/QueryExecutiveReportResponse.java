package com.payten.msu.sdk.response;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.payten.msu.sdk.request.enumerated.Currency;

public class QueryExecutiveReportResponse extends ApiResponse {
	private List<TransactionStatVO> transactionStats = new ArrayList<>();

	public List<TransactionStatVO> getTransactionStats() {
		return transactionStats;
	}

	public void setTransactionStats(List<TransactionStatVO> transactionStats) {
		this.transactionStats = transactionStats;
	}

	public QueryExecutiveReportResponse() {
		// Constructor
	}

	public class TransactionStatVO {
		private String type;
		private long count;
		private BigDecimal sum;
		private Currency currency;

		public TransactionStatVO(String type, long count, BigDecimal sum, Currency currency) {
			super();
			this.type = type;
			this.count = count;
			this.sum = sum;
			this.currency = currency;
		}

		public String getType() {
			return type;
		}

		public long getCount() {
			return count;
		}

		public BigDecimal getSum() {
			return sum;
		}

		public Currency getCurrency() {
			return currency;
		}
	}
}
