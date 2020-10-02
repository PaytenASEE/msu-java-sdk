package com.github.msu.sdk.response.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.github.msu.sdk.request.enumerated.IntegrationModelv2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author Donjeta Mulaj <donjeta.mulaj@asseco-see.com>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class CustomFieldAvailability {
	private IntegrationModelv2 integrationModel;
	private boolean required;

	public CustomFieldAvailability() {
		// Default constructor
	}

	public CustomFieldAvailability(Builder builder) {
		this.integrationModel = builder.integrationModel;
		this.required = builder.required;
	}

	public IntegrationModelv2 getIntegrationModel() {
		return integrationModel;
	}

	public void setIntegrationModel(IntegrationModelv2 integrationModel) {
		this.integrationModel = integrationModel;
	}

	public boolean getRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}


	public static class Builder {
		private IntegrationModelv2 integrationModel;
		private boolean required;

		public Builder integrationModel(IntegrationModelv2 integrationModel) {
			this.integrationModel = integrationModel;
			return this;
		}

		public Builder required(boolean required) {
			this.required = required;
			return this;
		}

		public CustomFieldAvailability build() {
			return new CustomFieldAvailability(this);
		}
	}
}