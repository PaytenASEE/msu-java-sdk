package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerUserEditResponse.class
)
public class DealerUserEditRequest extends ApiRequest {
    private String dealerCode;

    private String name;

    private String contactName;

    private String contactPhone;

    private String contactEmail;

    private String contactFax;

    private String contactWebaddress;

    private String contactPostcode;

    private String contactAddress;

    private String cityId;

    private String dealerTypes;

    private String tckn;

    private String vkn;

    private String users;

    private DealerUserEditRequest() {
    }

    public static DealerUserEditRequestBuilder builder() {
        return new DealerUserEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAME, this.name);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTACTNAME, this.contactName);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTACTPHONE, this.contactPhone);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTACTEMAIL, this.contactEmail);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTACTFAX, this.contactFax);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTACTWEBADDRESS, this.contactWebaddress);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTACTPOSTCODE, this.contactPostcode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CONTACTADDRESS, this.contactAddress);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.CITYID, this.cityId);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERTYPES, this.dealerTypes);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.TCKN, this.tckn);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.VKN, this.vkn);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.USERS, this.users);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERUSEREDIT;
    }

    public static final class DealerUserEditRequestBuilder {
        private String dealerCode;

        private String name;

        private String contactName;

        private String contactPhone;

        private String contactEmail;

        private String contactFax;

        private String contactWebaddress;

        private String contactPostcode;

        private String contactAddress;

        private String cityId;

        private String dealerTypes;

        private String tckn;

        private String vkn;

        private String users;

        private Authentication authentication;

        public DealerUserEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerUserEditRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerUserEditRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DealerUserEditRequestBuilder withContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        public DealerUserEditRequestBuilder withContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }

        public DealerUserEditRequestBuilder withContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public DealerUserEditRequestBuilder withContactFax(String contactFax) {
            this.contactFax = contactFax;
            return this;
        }

        public DealerUserEditRequestBuilder withContactWebaddress(String contactWebaddress) {
            this.contactWebaddress = contactWebaddress;
            return this;
        }

        public DealerUserEditRequestBuilder withContactPostcode(String contactPostcode) {
            this.contactPostcode = contactPostcode;
            return this;
        }

        public DealerUserEditRequestBuilder withContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }

        public DealerUserEditRequestBuilder withCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }

        public DealerUserEditRequestBuilder withDealerTypes(String dealerTypes) {
            this.dealerTypes = dealerTypes;
            return this;
        }

        public DealerUserEditRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public DealerUserEditRequestBuilder withVkn(String vkn) {
            this.vkn = vkn;
            return this;
        }

        public DealerUserEditRequestBuilder withUsers(String users) {
            this.users = users;
            return this;
        }

        public DealerUserEditRequest build() {
            DealerUserEditRequest request = new DealerUserEditRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.name = this.name;
            request.contactName = this.contactName;
            request.contactPhone = this.contactPhone;
            request.contactEmail = this.contactEmail;
            request.contactFax = this.contactFax;
            request.contactWebaddress = this.contactWebaddress;
            request.contactPostcode = this.contactPostcode;
            request.contactAddress = this.contactAddress;
            request.cityId = this.cityId;
            request.dealerTypes = this.dealerTypes;
            request.tckn = this.tckn;
            request.vkn = this.vkn;
            request.users = this.users;
            return request;
        }
    }
}
