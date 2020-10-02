package com.payten.sdk.msu.response.model;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionRule {
	private String type;
	private HashMap<String, Object> attributes;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public HashMap<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(HashMap<String, Object> attributes) {
		this.attributes = attributes;
	}
}
