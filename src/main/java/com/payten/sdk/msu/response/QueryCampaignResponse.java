package com.payten.sdk.msu.response;

import java.util.List;

import com.payten.sdk.msu.response.model.CampaignCode;

public class QueryCampaignResponse extends ApiResponse {
	private List<CampaignCode> campaignCodeList;

	public List<CampaignCode> getCampaignCodeList() {
		return campaignCodeList;
	}


}
