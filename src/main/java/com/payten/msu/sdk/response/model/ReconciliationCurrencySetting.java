package com.payten.msu.sdk.response.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class ReconciliationCurrencySetting {
	private String currency;
	private List<ReconciliationInstallmentSetting> values = new ArrayList<>();

	public ReconciliationCurrencySetting() {
	}
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<ReconciliationInstallmentSetting> getValues() {
		return values;
	}

	public void setValues(List<ReconciliationInstallmentSetting> values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "ReconciliationCurrencySettingVO [currency=" + currency + "]";
	}

}
