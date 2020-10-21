package com.merchantsafeunipay.sdk.response;

public class QueryPaymentSystemDataResponse extends ApiResponse {
    private String paymentSystemName;
    private String posUrl;
    private String posUserId;
    private String posPassword;
    private String mpiUrl;
    private String mpiUserId;
    private String mpiPassword;
    private String clientId;
    private String storeKey;
    private String extraParams;
    private String psIntegrationExtraField00;
    private String psIntegrationExtraField01;

    public String getPaymentSystemName() {
        return paymentSystemName;
    }

    public void setPaymentSystemName(String paymentSystemName) {
        this.paymentSystemName = paymentSystemName;
    }

    public String getPosUrl() {
        return posUrl;
    }

    public void setPosUrl(String posUrl) {
        this.posUrl = posUrl;
    }

    public String getPosUserId() {
        return posUserId;
    }

    public void setPosUserId(String posUserId) {
        this.posUserId = posUserId;
    }

    public String getPosPassword() {
        return posPassword;
    }

    public void setPosPassword(String posPassword) {
        this.posPassword = posPassword;
    }

    public String getMpiUrl() {
        return mpiUrl;
    }

    public void setMpiUrl(String mpiUrl) {
        this.mpiUrl = mpiUrl;
    }

    public String getMpiUserId() {
        return mpiUserId;
    }

    public void setMpiUserId(String mpiUserId) {
        this.mpiUserId = mpiUserId;
    }

    public String getMpiPassword() {
        return mpiPassword;
    }

    public void setMpiPassword(String mpiPassword) {
        this.mpiPassword = mpiPassword;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getStoreKey() {
        return storeKey;
    }

    public void setStoreKey(String storeKey) {
        this.storeKey = storeKey;
    }

    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams;
    }

    public String getPsIntegrationExtraField00() {
        return psIntegrationExtraField00;
    }

    public void setPsIntegrationExtraField00(String psIntegrationExtraField00) {
        this.psIntegrationExtraField00 = psIntegrationExtraField00;
    }

    public String getPsIntegrationExtraField01() {
        return psIntegrationExtraField01;
    }

    public void setPsIntegrationExtraField01(String psIntegrationExtraField01) {
        this.psIntegrationExtraField01 = psIntegrationExtraField01;
    }
}
