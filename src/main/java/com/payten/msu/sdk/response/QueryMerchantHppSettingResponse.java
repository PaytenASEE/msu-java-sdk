package com.payten.msu.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.msu.sdk.response.model.MerchantHPPSetting;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class QueryMerchantHppSettingResponse extends ApiResponse {
    @JsonProperty(value = "merchantHPPSetting")
    @XmlElementWrapper(name = "merchantHPPSetting")
    @XmlElement(name = "merchantHPPSetting")
    private MerchantHPPSetting merchantHPPSetting;

    public MerchantHPPSetting getMerchantHPPSetting() {
        return merchantHPPSetting;
    }

    public void setMerchantHPPSetting(MerchantHPPSetting merchantHPPSetting) {
        this.merchantHPPSetting = merchantHPPSetting;
    }

}
