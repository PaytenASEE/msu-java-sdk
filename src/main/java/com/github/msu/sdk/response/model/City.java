package com.github.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class City {
	private String id;
	private String name;
	private Country country;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Country getCountry() {
		return country;
	}
}
