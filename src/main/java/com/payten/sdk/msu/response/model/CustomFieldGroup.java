package com.payten.sdk.msu.response.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.payten.sdk.msu.request.enumerated.CustomFieldGroupBehaviour;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class CustomFieldGroup {
	private String code;
	private String name;
	private CustomFieldGroupBehaviour behaviour;

	public CustomFieldGroup() {}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomFieldGroupBehaviour getBehaviour() {
		return behaviour;
	}

	public void setBehaviour(CustomFieldGroupBehaviour behaviour) {
		this.behaviour = behaviour;
	}
}
