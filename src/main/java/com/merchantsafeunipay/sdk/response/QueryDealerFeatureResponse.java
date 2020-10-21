package com.merchantsafeunipay.sdk.response;

import com.merchantsafeunipay.sdk.response.model.DealerFeature;
import com.merchantsafeunipay.sdk.response.model.Merchant;

import java.util.ArrayList;
import java.util.List;


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
