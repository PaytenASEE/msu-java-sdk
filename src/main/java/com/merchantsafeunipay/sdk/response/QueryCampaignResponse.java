package com.merchantsafeunipay.sdk.response;

import com.merchantsafeunipay.sdk.response.model.CampaignCode;

import java.util.List;

public class QueryCampaignResponse extends ApiResponse {
    private List<CampaignCode> campaignCodeList;

    public List<CampaignCode> getCampaignCodeList() {
        return campaignCodeList;
    }


}
