package com.payten.sdk.msu.request.apiv2.dealer;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.response.DealerUserAddResponse;

@ResponseInfo(
        responseClass = DealerUserAddResponse.class
)
public class DealerUserAddRequest extends ApiRequest {
    private String name;

    private String dealerCode;

    private String parentDealerCode;

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

    private String dealerCodes;

    private String users;

    private DealerUserAddRequest() {
    }

    public static DealerUserAddRequestBuilder builder() {
        return new DealerUserAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.NAME, this.name);
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.PARENTDEALERCODE, this.parentDealerCode);
        addToPayload(Param.CONTACTNAME, this.contactName);
        addToPayload(Param.CONTACTPHONE, this.contactPhone);
        addToPayload(Param.CONTACTEMAIL, this.contactEmail);
        addToPayload(Param.CONTACTFAX, this.contactFax);
        addToPayload(Param.CONTACTWEBADDRESS, this.contactWebaddress);
        addToPayload(Param.CONTACTPOSTCODE, this.contactPostcode);
        addToPayload(Param.CONTACTADDRESS, this.contactAddress);
        addToPayload(Param.CITYID, this.cityId);
        addToPayload(Param.DEALERTYPES, this.dealerTypes);
        addToPayload(Param.TCKN, this.tckn);
        addToPayload(Param.VKN, this.vkn);
        addToPayload(Param.DEALERCODES, this.dealerCodes);
        addToPayload(Param.USERS, this.users);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERUSERADD;
    }

    public static final class DealerUserAddRequestBuilder {
        private String name;

        private String dealerCode;

        private String parentDealerCode;

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

        private String dealerCodes;

        private String users;

        private Authentication authentication;

        public DealerUserAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerUserAddRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DealerUserAddRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerUserAddRequestBuilder withParentDealerCode(String parentDealerCode) {
            this.parentDealerCode = parentDealerCode;
            return this;
        }

        public DealerUserAddRequestBuilder withContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        public DealerUserAddRequestBuilder withContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }

        public DealerUserAddRequestBuilder withContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public DealerUserAddRequestBuilder withContactFax(String contactFax) {
            this.contactFax = contactFax;
            return this;
        }

        public DealerUserAddRequestBuilder withContactWebaddress(String contactWebaddress) {
            this.contactWebaddress = contactWebaddress;
            return this;
        }

        public DealerUserAddRequestBuilder withContactPostcode(String contactPostcode) {
            this.contactPostcode = contactPostcode;
            return this;
        }

        public DealerUserAddRequestBuilder withContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }

        public DealerUserAddRequestBuilder withCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }

        public DealerUserAddRequestBuilder withDealerTypes(String dealerTypes) {
            this.dealerTypes = dealerTypes;
            return this;
        }

        public DealerUserAddRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public DealerUserAddRequestBuilder withVkn(String vkn) {
            this.vkn = vkn;
            return this;
        }

        public DealerUserAddRequestBuilder withDealerCodes(String dealerCodes) {
            this.dealerCodes = dealerCodes;
            return this;
        }

        public DealerUserAddRequestBuilder withUsers(String users) {
            this.users = users;
            return this;
        }

        public DealerUserAddRequest build() {
            DealerUserAddRequest request = new DealerUserAddRequest();
            request.authentication = this.authentication;
            request.name = this.name;
            request.dealerCode = this.dealerCode;
            request.parentDealerCode = this.parentDealerCode;
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
            request.dealerCodes = this.dealerCodes;
            request.users = this.users;
            return request;
        }
    }
}
