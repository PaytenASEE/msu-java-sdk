package com.merchantsafeunipay.sdk.request.apiv2.dealer;

import com.merchantsafeunipay.sdk.authentication.Authentication;
import com.merchantsafeunipay.sdk.request.base.ApiRequest;
import com.merchantsafeunipay.sdk.request.enumerated.ApiAction;
import com.merchantsafeunipay.sdk.request.enumerated.Param;
import com.merchantsafeunipay.sdk.request.enumerated.YesNo;
import com.merchantsafeunipay.sdk.response.DealerAddResponse;

public class DealerAddRequest extends ApiRequest<DealerAddResponse> {
    private String name;

    private String dealerCode;

    private String parentDealerCode;

    private String contactName;

    private String contactPhone;

    private String contactEmail;

    private String contactFax;

    private String contactWebAddress;

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
    public Class<DealerAddResponse> responseClass() {
        return DealerAddResponse.class;
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
        addToPayload(Param.CONTACTWEBADDRESS, this.contactWebAddress);
        addToPayload(Param.CONTACTPOSTCODE, this.contactPostcode);
        addToPayload(Param.CONTACTADDRESS, this.contactAddress);
        addToPayload(Param.CITYID, this.cityId);
        addToPayload(Param.DEALERTYPES, this.dealerTypes);
        addToPayload(Param.TCKN, this.tckn);
        addToPayload(Param.VKN, this.vkn);
        addToPayload(Param.ADJUSTRATES, this.adjustrates);
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

        private String contactWebAddress;

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

        public DealerAddRequestBuilder withContactWebAddress(String contactWebAddress) {
            this.contactWebAddress = contactWebAddress;
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
            request.contactWebAddress = this.contactWebAddress;
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
