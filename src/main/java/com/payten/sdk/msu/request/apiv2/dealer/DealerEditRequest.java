package com.payten.sdk.msu.request.apiv2.dealer;

import com.payten.sdk.msu.authentication.Authentication;
import com.payten.sdk.msu.request.base.ApiRequest;
import com.payten.sdk.msu.request.enumerated.ApiAction;
import com.payten.sdk.msu.request.enumerated.Param;
import com.payten.sdk.msu.request.enumerated.YesNo;
import com.payten.sdk.msu.util.ResponseInfo;
import com.payten.sdk.msu.response.DealerEditResponse;

@ResponseInfo(
        responseClass = DealerEditResponse.class
)
public class DealerEditRequest extends ApiRequest {
    private String dealerCode;

    private String name;

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

    private DealerEditRequest() {
    }

    public static DealerEditRequestBuilder builder() {
        return new DealerEditRequestBuilder();
    }

    @Override
    public void applyRequestParams() {
        addToPayload(Param.DEALERCODE, this.dealerCode);
        addToPayload(Param.NAME, this.name);
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
        return ApiAction.DEALEREDIT;
    }

    public static final class DealerEditRequestBuilder {
        private String dealerCode;

        private String name;

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

        public DealerEditRequestBuilder withAuthentication(Authentication authentication) {
            this.authentication = authentication;
            return this;
        }

        public DealerEditRequestBuilder withDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
            return this;
        }

        public DealerEditRequestBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DealerEditRequestBuilder withContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        public DealerEditRequestBuilder withContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }

        public DealerEditRequestBuilder withContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public DealerEditRequestBuilder withContactFax(String contactFax) {
            this.contactFax = contactFax;
            return this;
        }

        public DealerEditRequestBuilder withContactWebAddress(String contactWebAddress) {
            this.contactWebAddress = contactWebAddress;
            return this;
        }

        public DealerEditRequestBuilder withContactPostcode(String contactPostcode) {
            this.contactPostcode = contactPostcode;
            return this;
        }

        public DealerEditRequestBuilder withContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }

        public DealerEditRequestBuilder withCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }

        public DealerEditRequestBuilder withDealerTypes(String dealerTypes) {
            this.dealerTypes = dealerTypes;
            return this;
        }

        public DealerEditRequestBuilder withTckn(String tckn) {
            this.tckn = tckn;
            return this;
        }

        public DealerEditRequestBuilder withVkn(String vkn) {
            this.vkn = vkn;
            return this;
        }

        public DealerEditRequestBuilder withAdjustrates(YesNo adjustrates) {
            this.adjustrates = adjustrates;
            return this;
        }

        public DealerEditRequest build() {
            DealerEditRequest request = new DealerEditRequest();
            request.authentication = this.authentication;
            request.dealerCode = this.dealerCode;
            request.name = this.name;
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
