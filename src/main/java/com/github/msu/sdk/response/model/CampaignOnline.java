package com.github.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude
@XmlAccessorType(XmlAccessType.FIELD)
public class CampaignOnline {
	@JsonProperty("campaignCode")
	private String code;
	@JsonProperty("campaignName")
	private String name;
	@JsonProperty("extra")
	private String extra;

	public CampaignOnline(String campaignCode, String campaignName, String campaignExtra) {
		super();
		this.code = campaignCode;
		this.name = campaignName;
		this.extra = campaignExtra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((extra == null) ? 0 : extra.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getExtra() {
		return extra;
	}

	public void setCode(String campaignCode) {
		this.code = campaignCode;
	}

	public void setName(String campaignName) {
		this.name = campaignName;
	}

	public void setExtra(String campaignExtra) {
		this.extra = campaignExtra;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CampaignOnline other = (CampaignOnline) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (extra == null) {
			if (other.extra != null)
				return false;
		} else if (!extra.equals(other.extra))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CampaignOnline [code=" + code + ", name=" + name + ", extra=" + extra + "]";
	}
}
