package com.github.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.msu.sdk.response.model.City;

public class QueryCityResponse extends ApiResponse {
	@JsonProperty(value = "cities")
	@XmlElementWrapper(name = "cities")
	@XmlElement(name = "city")
	private List<City> cities;

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
}
