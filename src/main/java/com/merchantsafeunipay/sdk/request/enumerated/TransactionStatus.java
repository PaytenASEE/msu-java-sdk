package com.merchantsafeunipay.sdk.request.enumerated;

import java.util.ArrayList;
import java.util.List;

/**
 * TransactionStatus
 * Max length is 2-chars
 *
 * @author Anil Tangul <anil.tangul@asseco-see.com.tr>
 * @author Flakron Bytyqi <flakron.bytyqi@asseco-see.com>
 */
public enum TransactionStatus {
    /**
     * In Progress, Created
     */
    IP,
    /**
     * CAncelled by CardHolder during approval
     */
    CA,
    /**
     * FAiled / Declined
     * Response from the integrated Payment System
     */
    FA,
    /**
     * APproved
     * Response from the integrated Payment System
     */
    AP,
    /**
     * VoiDed (As secondary process)
     * Response from the integrated Payment System
     */
    VD,
    /**
     * Needs manual review
     * Response from the integrated Payment System exists
     */
    MR,
    /**
     * Postauthed (As secondary process)
     */
    PA,
    /**
     * Waiting for First Approval
     * "First step of two step approval mechanism"
     * Can be used after TransactionRuleException thrown
     */
    WFA,
    /**
     * Waiting For Last Approval
     * "Second step of two step approval and 'the first and only step' of one step approval mechanism"
     * Can be used after TransactionRuleException thrown
     */
    WLA,
    /**
     * Rejected
     * Rejected status of Waiting for Approval statuses (both of them) transactions.
     * When a waiting for approval status transaction is rejected it's status should be updated to RJ
     */
    RJ;

    public static TransactionStatus[] toEnums(String... values) {
        TransactionStatus[] transactionStatuses = new TransactionStatus[values.length];
        int i = 0;
        for (String value : values) {
            transactionStatuses[i++] = valueOf(value);
        }
        return transactionStatuses;
    }

    public static List<TransactionStatus> getWaitingForApprovalStatus() {
        List<TransactionStatus> transactionStatusList = new ArrayList<>();
        transactionStatusList.add(TransactionStatus.WFA);
        transactionStatusList.add(TransactionStatus.WLA);
        return transactionStatusList;
    }

    public static TransactionStatus fromString(String input) {
        for (TransactionStatus transactionStatus : values()) {
            if (transactionStatus.name().equals(input))
                return transactionStatus;
        }
        return null;
    }

    public static List<TransactionStatus> getApprovedAndFailedStatus() {
        List<TransactionStatus> transactionStatusList = new ArrayList<>();
        transactionStatusList.add(TransactionStatus.AP);
        transactionStatusList.add(TransactionStatus.FA);
        return transactionStatusList;
    }
}
