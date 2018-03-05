package com.github.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
@XmlAccessorType(XmlAccessType.FIELD)
public class Point {
	private String name;
	private String value;

	public Point(String pointName, String pointValue) {
		super();
		this.name = pointName;
		this.value = pointValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
