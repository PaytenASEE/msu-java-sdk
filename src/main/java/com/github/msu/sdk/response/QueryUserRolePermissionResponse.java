package com.github.msu.sdk.response;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.msu.sdk.response.model.MerchantUser;


public class QueryUserRolePermissionResponse extends ApiResponse {
	@JsonProperty(value = "merchantUserList")
	@XmlElementWrapper(name = "merchantUserList")
	@XmlElement(name = "merchantUser")
	private List<MerchantUser> merchantUserList;
	private String permission;
	private String role;

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<MerchantUser> getMerchantUserList() {
		return merchantUserList;
	}

	public void setMerchantUserList(List<MerchantUser> merchantUserList) {
		this.merchantUserList = merchantUserList;
	}
}
