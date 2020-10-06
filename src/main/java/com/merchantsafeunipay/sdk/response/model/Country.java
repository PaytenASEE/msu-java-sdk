package com.merchantsafeunipay.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class Country {
	private String alpha;
	private String name;

	public String getAlpha() {
		return alpha;
	}

	public String getName() {
		return name;
	}

}
