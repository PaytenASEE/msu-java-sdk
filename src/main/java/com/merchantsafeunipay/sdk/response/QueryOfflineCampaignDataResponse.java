package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.CampaignOffline;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class QueryOfflineCampaignDataResponse extends FinancialResponse {

    @JsonProperty(value = "campaignCodeList")
    @XmlElementWrapper(name = "campaignCodeList")
    @XmlElement(name = "campaignCodeList")
    private List<CampaignOffline> campaignsOffline;
    public List<CampaignOffline> getCampaignsOffline() {
        return campaignsOffline;
    }


}
