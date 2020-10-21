package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.LinkedList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantUser {
    private User user;
    private String role;
    private String status;
    private String merchantUserId;
    private String activationHash;
    private boolean gdprEnabled;
    private List<Dealer> dealers = new LinkedList<>();

    public MerchantUser() {
    }

    public User getUser() {
        return user;
    }

    public String getRole() {
        return role;
    }

    public String getStatus() {
        return status;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public String getActivationHash() {
        return activationHash;
    }

    public List<Dealer> getDealers() {
        return dealers;
    }

    public boolean isGdprEnabled() {
        return gdprEnabled;
    }

    public void setGdprEnabled(boolean gdprEnabled) {
        this.gdprEnabled = gdprEnabled;
    }
}
