package com.payten.sdk.msu.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.payten.sdk.msu.response.model.MessageContent;

public class QueryMessageContentResponse extends ApiResponse {
	@JsonProperty(value = "messageContentList")
	@XmlElementWrapper(name = "messageContentList")
	@XmlElement(name = "messageContent")
	private List<MessageContent> messageContents;

	public List<MessageContent> getMessageContents() {
		return messageContents;
	}

	public void setMessageContents(List<MessageContent> merchantContents) {
		this.messageContents = merchantContents;
	}
}
