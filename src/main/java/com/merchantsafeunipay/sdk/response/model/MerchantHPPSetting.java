package com.merchantsafeunipay.sdk.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
public class MerchantHPPSetting {
    private String leftLogo;
    private String rightLogo;
    private String backgroundColor;
    private String borderColor;
    private String headerColor;
    private String buttonColor;
    private String font;
    private Boolean showSSL;
    private Boolean showVISA;
    private Boolean showMC;
    private Boolean showAMEX;
    private Boolean showDINACARD;
    private Boolean showDINERS;
    private Boolean showJCB;
    private Boolean showTROY;
    private String merchantBusinessId;

    public MerchantHPPSetting() {
        //constructor
    }

    public String getLeftLogo() {
        return leftLogo;
    }

    public void setLeftLogo(String leftLogo) {
        this.leftLogo = leftLogo;
    }

    public String getRightLogo() {
        return rightLogo;
    }

    public void setRightLogo(String rightLogo) {
        this.rightLogo = rightLogo;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public String getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }

    public String getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(String buttonColor) {
        this.buttonColor = buttonColor;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public Boolean getShowSSL() {
        return showSSL;
    }

    public void setShowSSL(Boolean showSSL) {
        this.showSSL = showSSL;
    }

    public Boolean getShowVISA() {
        return showVISA;
    }

    public void setShowVISA(Boolean showVISA) {
        this.showVISA = showVISA;
    }

    public Boolean getShowMC() {
        return showMC;
    }

    public void setShowMC(Boolean showMC) {
        this.showMC = showMC;
    }

    public Boolean getShowAMEX() {
        return showAMEX;
    }

    public void setShowAMEX(Boolean showAMEX) {
        this.showAMEX = showAMEX;
    }

    public Boolean getShowDINACARD() {
        return showDINACARD;
    }

    public void setShowDINACARD(Boolean showDINACARD) {
        this.showDINACARD = showDINACARD;
    }

    public Boolean getShowDINERS() {
        return showDINERS;
    }

    public void setShowDINERS(Boolean showDINERS) {
        this.showDINERS = showDINERS;
    }

    public Boolean getShowJCB() {
        return showJCB;
    }

    public void setShowJCB(Boolean showJCB) {
        this.showJCB = showJCB;
    }

    public Boolean getShowTROY() {
        return showTROY;
    }

    public void setShowTROY(Boolean showTROY) {
        this.showTROY = showTROY;
    }

    public String getMerchantBusinessId() {
        return merchantBusinessId;
    }

    public void setMerchantBusinessId(String merchantBusinessId) {
        this.merchantBusinessId = merchantBusinessId;
    }

}
