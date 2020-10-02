package com.github.msu.sdk.request.apiv2.dealer;

import com.github.msu.sdk.authentication.Authentication;
import com.github.msu.sdk.request.base.ApiRequest;
import com.github.msu.sdk.request.enumerated.ApiAction;
import com.github.msu.sdk.request.enumerated.YesNo;
import com.github.msu.sdk.util.ResponseInfo;

@ResponseInfo(
        responseClass = com.github.msu.sdk.response.DealerAddResponse.class
)
public class DealerAddRequest extends ApiRequest {
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

    private YesNo adjustrates;

    private DealerAddRequest() {
    }

    public static DealerAddRequestBuilder builder() {
        return new DealerAddRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(com.github.msu.sdk.request.enumerated.Param.NAME, this.name);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.DEALERCODE, this.dealerCode);
        addToPayload(com.github.msu.sdk.request.enumerated.Param.PARENTDEALERCODE, this.parentDealerCode);
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
        addToPayload(com.github.msu.sdk.request.enumerated.Param.ADJUSTRATES, this.adjustrates);
    }

    @Override
    public ApiAction apiAction() {
        return ApiAction.DEALERADD;
    }

    public static final class DealerAddRequestBuilder {
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

        private YesNo adjustrates;

        private Authentication authentication;

        public DealerAddRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerAddRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DealerAddRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerAddRequestBuilder withParentDealerCode(String parentDealerCode) {
            this.parentDealerCode = parentDealerCode;
            return this;
        }

        public DealerAddRequestBuilder withContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        public DealerAddRequestBuilder withContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }

        public DealerAddRequestBuilder withContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public DealerAddRequestBuilder withContactFax(String contactFax) {
            this.contactFax = contactFax;
            return this;
        }

        public DealerAddRequestBuilder withContactWebaddress(String contactWebaddress) {
            this.contactWebaddress = contactWebaddress;
            return this;
        }

        public DealerAddRequestBuilder withContactPostcode(String contactPostcode) {
            this.contactPostcode = contactPostcode;
            return this;
        }

        public DealerAddRequestBuilder withContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }

        public DealerAddRequestBuilder withCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }

        public DealerAddRequestBuilder withDealerTypes(String dealerTypes) {
            this.dealerTypes = dealerTypes;
            return this;
        }

        public DealerAddRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public DealerAddRequestBuilder withVkn(String vkn) {
            this.vkn = vkn;
            return this;
        }

        public DealerAddRequestBuilder withAdjustrates(YesNo adjustrates) {
            this.adjustrates = adjustrates;
            return this;
        }

        public DealerAddRequest build() {
            DealerAddRequest request = new DealerAddRequest();
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
            request.adjustrates = this.adjustrates;
            return request;
        }
    }
}
