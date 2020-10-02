package com.payten.sdk.msu.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class DealerPST {
	private String subMerchantCode;
	private String createdDate;
	private String psType;
	private Dealer dealer;
	private Merchant merchant;
	private String integrationExtraField00;
	private String integrationExtraField01;

	public String getSubMerchantCode() {
		return subMerchantCode;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public String getPsType() {
		return psType;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public String getIntegrationExtraField00() {
		return integrationExtraField00;
	}

	public String getIntegrationExtraField01() {
		return integrationExtraField01;
	}
}
