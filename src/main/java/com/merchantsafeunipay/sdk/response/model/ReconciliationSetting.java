package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(Include.NON_NULL)
@XmlAccessorType(XmlAccessType.FIELD)
public class ReconciliationSetting {
	private String paymentSystem;
	private String model;
	private int dueDayInterval;
	private List<ReconciliationCurrencySetting> installments = new ArrayList<>();

	public ReconciliationSetting() {
	}

	public String getPaymentSystem() {
		return paymentSystem;
	}

	public void setPaymentSystem(String paymentSystem) {
		this.paymentSystem = paymentSystem;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDueDayInterval() {
		return dueDayInterval;
	}

	public void setDueDayInterval(int dueDayInterval) {
		this.dueDayInterval = dueDayInterval;
	}

	public List<ReconciliationCurrencySetting> getInstallments() {
		return installments;
	}

	public void setInstallments(List<ReconciliationCurrencySetting> installments) {
		this.installments = installments;
	}

	@Override
	public String toString() {
		return "ReconciliationSettingVO [paymentSystem=" + paymentSystem + ", model=" + model + ", dueDayInterval=" + dueDayInterval + "]";
	}
}
