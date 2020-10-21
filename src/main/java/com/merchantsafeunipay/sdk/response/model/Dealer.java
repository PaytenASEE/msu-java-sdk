package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.merchantsafeunipay.sdk.request.enumerated.Status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.LinkedHashSet;
import java.util.Set;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Dealer {
    private String code;
    private String parentCode;
    private String parentName;
    private String name;
    private String tckn;
    private String vkn;
    private String createdTime;
    private Status status;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private String contactFax;
    private String contactPostCode;
    private String contactAddress;
    private String contactWebAddress;
    private Boolean adjustCommissionRate;
    private City city;
    private Merchant merchant;
    private DealerType dealerType;
    private Set<DealerType> dealerTypes = new LinkedHashSet<>();
    private Set<MerchantUser> merchantUsers = new LinkedHashSet<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }

    public String getVkn() {
        return vkn;
    }

    public void setVkn(String vkn) {
        this.vkn = vkn;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    public String getContactPostCode() {
        return contactPostCode;
    }

    public void setContactPostCode(String contactPostCode) {
        this.contactPostCode = contactPostCode;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactWebAddress() {
        return contactWebAddress;
    }

    public void setContactWebAddress(String contactWebAddress) {
        this.contactWebAddress = contactWebAddress;
    }

    public Boolean getAdjustCommissionRate() {
        return adjustCommissionRate;
    }

    public void setAdjustCommissionRate(Boolean adjustCommissionRate) {
        this.adjustCommissionRate = adjustCommissionRate;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public DealerType getDealerType() {
        return dealerType;
    }

    public void setDealerType(DealerType dealerType) {
        this.dealerType = dealerType;
    }

    public Set<DealerType> getDealerTypes() {
        return dealerTypes;
    }

    public void setDealerTypes(Set<DealerType> dealerTypes) {
        this.dealerTypes = dealerTypes;
    }

    public Set<MerchantUser> getMerchantUsers() {
        return merchantUsers;
    }

    public void setMerchantUsers(Set<MerchantUser> merchantUsers) {
        this.merchantUsers = merchantUsers;
    }
}
