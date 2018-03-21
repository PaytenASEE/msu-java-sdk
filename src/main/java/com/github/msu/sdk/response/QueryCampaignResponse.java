package com.github.msu.sdk.response;

import java.util.List;

import com.github.msu.sdk.response.model.CampaignCode;

public class QueryCampaignResponse extends ApiResponse {
	private List<CampaignCode> campaignCodeList;

	public List<CampaignCode> getCampaignCodeList() {
		return campaignCodeList;
	}


}
