package com.payten.msu.sdk.response;

import java.util.ArrayList;
import java.util.List;

import com.payten.msu.sdk.response.model.DealerFeature;
import com.payten.msu.sdk.response.model.Merchant;


public class QueryDealerFeatureResponse extends ApiResponse {
	private Merchant merchant;
	private List<DealerFeature> dealerFeatures = new ArrayList<>();

	public QueryDealerFeatureResponse(Merchant merchant, List<DealerFeature> dealerFeatures) {
		this.merchant = merchant;
		this.dealerFeatures = dealerFeatures;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public List<DealerFeature> getDealerFeatures() {
		return dealerFeatures;
	}
}
