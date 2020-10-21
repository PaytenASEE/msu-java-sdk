package com.merchantsafeunipay.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.merchantsafeunipay.sdk.response.model.MessageContent;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

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
