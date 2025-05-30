package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@JsonInclude
@XmlAccessorType(XmlAccessType.FIELD)
public class CampaignOffline {
    @JsonProperty("campaignCode")
    private String code;

    @JsonProperty("campaignName")
    private String campaignName;
    @JsonProperty("extra")
    private String extra;
    @JsonProperty("minumumAmount")
    private String minumumAmount;
    @JsonProperty("campaignInstallment")
    private String campaignInstallment;
    @JsonProperty("baseInstallment")
    private String baseInstallment;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("paymentSystemType")
    private String paymentSystemType;
    @JsonProperty("status")
    private String status;
    @JsonProperty("campaignType")
    private String campaignType;
    @JsonProperty("details")
    private String details;


    public CampaignOffline() {
        super();
    }

    public String getCampaignName() {return campaignName;}
    public String getCode() {
        return code;
    }

    public void setCode(String campaignCode) {
        this.code = campaignCode;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String campaignExtra) {
        this.extra = campaignExtra;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CampaignOffline other = (CampaignOffline) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (extra == null) {
            if (other.extra != null)
                return false;
        } else if (!extra.equals(other.extra))
            return false;
        if (campaignName == null) {
            if (other.campaignName != null)
                return false;
        } else if (!campaignName.equals(other.campaignName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CampaignOnline [code=" + code + ", name=" + campaignName + ", extra=" + extra + "]";
    }
}