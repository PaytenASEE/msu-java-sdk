package com.github.msu.sdk.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonInclude;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompayTransactionResponse extends ApiResponse {
	private String compayToken;

	public CompayTransactionResponse(Builder builder) {
		this.compayToken = builder.compayToken;
		super.setResponseCode(builder.responseCode);
		super.setResponseMsg(builder.responseMsg);
	}

	public static class Builder {
		private String compayToken;
		private String responseMsg;
		private String responseCode;

		public Builder compayToken(String _compayToken) {
			this.compayToken = _compayToken;
			return this;
		}

		public Builder responseMsg(String _responseMsg) {
			this.responseMsg = _responseMsg;
			return this;
		}

		public Builder responseCode(String _responseCode) {
			this.responseCode = _responseCode;
			return this;
		}

		public CompayTransactionResponse build() {
			return new CompayTransactionResponse(this);
		}
	}

	public String getCompayToken() {
		return compayToken;
	}

	public void setCompayToken(String compayToken) {
		this.compayToken = compayToken;
	}
}
