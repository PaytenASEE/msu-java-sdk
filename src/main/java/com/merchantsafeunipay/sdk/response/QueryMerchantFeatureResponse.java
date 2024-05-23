package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.Merchant;
import com.merchantsafeunipay.sdk.response.model.MerchantFeature;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;


public class QueryMerchantFeatureResponse extends ApiResponse {

    @JsonProperty(value = "merchant")
    @XmlElementWrapper(name = "merchant")
    @XmlElement(name = "merchant")
    private Merchant merchant;

    @JsonProperty(value = "merchantFeature")
    @XmlElementWrapper(name = "merchantFeature")
    @XmlElement(name = "merchantFeature")
    private MerchantFeature merchantFeature;

    public Merchant getMerchant() {return merchant;}

    public MerchantFeature getMerchantFeature() {return merchantFeature;}}