package com.payten.msu.sdk.request.apiv2.query;

import com.payten.msu.sdk.authentication.Authentication;
import com.payten.msu.sdk.request.base.ApiRequest;
import com.payten.msu.sdk.request.enumerated.ApiAction;
import com.payten.msu.sdk.util.ResponseInfo;
import com.payten.msu.sdk.request.enumerated.Param;
import com.payten.msu.sdk.response.QueryUserRolePermissionResponse;

@ResponseInfo(
        responseClass = QueryUserRolePermissionResponse.class
)
public class QueryUserRolePermissionRequest extends ApiRequest {
    private String permission;

    private String role;

    private QueryUserRolePermissionRequest() {
    }

    public static QueryUserRolePermissionRequestBuilder builder() {
        return new QueryUserRolePermissionRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.PERMISSION, this.permission);
        addToPayload(Param.ROLE, this.role);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.QUERYUSERROLEPERMISSION;
    }

    public static final class QueryUserRolePermissionRequestBuilder {
        private String permission;

        private String role;

        private Authentication authentication;

        public QueryUserRolePermissionRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
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
            QueryUserRolePermissionRequest request = new QueryUserRolePermissionRequest();
            request.authentication = this.authentication;
            request.permission = this.permission;
            request.role = this.role;
            return request;
        }
    }
}
