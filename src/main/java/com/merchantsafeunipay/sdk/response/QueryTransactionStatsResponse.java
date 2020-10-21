package com.merchantsafeunipay.sdk.response;

import com.merchantsafeunipay.sdk.response.model.Merchant;
import com.merchantsafeunipay.sdk.response.model.TransactionStats;

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