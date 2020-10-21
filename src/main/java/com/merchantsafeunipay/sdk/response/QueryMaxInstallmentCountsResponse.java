package com.merchantsafeunipay.sdk.response;

public class QueryMaxInstallmentCountsResponse extends ApiResponse {
    private String minAllowedInstallmentCount;
    private String maxAllowedInstallmentCount;

    public String getMinAllowedInstallmentCount() {
        return minAllowedInstallmentCount;
    }

    public void setMinAllowedInstallmentCount(String minAllowedInstallmentCount) {
        this.minAllowedInstallmentCount = minAllowedInstallmentCount;
    }

    public String getMaxAllowedInstallmentCount() {
        return maxAllowedInstallmentCount;
    }

    public void setMaxAllowedInstallmentCount(String maxAllowedInstallmentCount) {
        this.maxAllowedInstallmentCount = maxAllowedInstallmentCount;
    }
}
