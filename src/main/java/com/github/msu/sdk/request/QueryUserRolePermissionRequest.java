package com.github.msu.sdk.request;

import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.Param;
import com.github.msu.sdk.response.QueryUserRolePermissionResponse;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(responseClass = QueryUserRolePermissionResponse.class)
public class QueryUserRolePermissionRequest extends ApiRequest{

    private String permission;
    private String role;

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PERMISSION, this.permission);
        addToPayload(Param.ROLE, this.role);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYUSERROLEPERMISSION;
    }

    public static QueryUserRolePermissionRequestBuilder builder() {
        return new QueryUserRolePermissionRequestBuilder();
    }

    public static final class QueryUserRolePermissionRequestBuilder {
        private String permission;
        private String role;

        private QueryUserRolePermissionRequestBuilder() {
        }

        public QueryUserRolePermissionRequestBuilder withPermission(String permission) {
            this.permission = permission;
            return this;
        }

        public QueryUserRolePermissionRequestBuilder withRole(String role) {
            this.role = role;
            return this;
        }

        public QueryUserRolePermissionRequest build() {
            QueryUserRolePermissionRequest queryUserRolePermissionRequest = new QueryUserRolePermissionRequest();
            queryUserRolePermissionRequest.permission = this.permission;
            queryUserRolePermissionRequest.role = this.role;
            return queryUserRolePermissionRequest;
        }
    }
}
