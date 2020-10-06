package com.merchantsafeunipay.sdk.response;

import java.util.List;

import com.merchantsafeunipay.sdk.response.model.CampaignCode;

public class QueryCampaignResponse extends ApiResponse {
	private List<CampaignCode> campaignCodeList;

	public List<CampaignCode> getCampaignCodeList() {
		return campaignCodeList;
	}


}
