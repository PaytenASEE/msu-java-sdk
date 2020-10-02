package com.github.msu.sdk.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


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

    public String getBorderColor() {
        return borderColor;
    }

    public String getHeaderColor() {
        return headerColor;
    }

    public String getButtonColor() {
        return buttonColor;
    }

    public String getFont() {
        return font;
    }

    public Boolean getShowSSL() {
        return showSSL;
    }

    public Boolean getShowVISA() {
        return showVISA;
    }

    public Boolean getShowMC() {
        return showMC;
    }

    public Boolean getShowAMEX() {
        return showAMEX;
    }

    public Boolean getShowDINACARD() {
        return showDINACARD;
    }

    public Boolean getShowDINERS() {
        return showDINERS;
    }

    public Boolean getShowJCB() {
        return showJCB;
    }

    public Boolean getShowTROY() {
        return showTROY;
    }

    public String getMerchantBusinessId() {
        return merchantBusinessId;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }

    public void setButtonColor(String buttonColor) {
        this.buttonColor = buttonColor;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setShowSSL(Boolean showSSL) {
        this.showSSL = showSSL;
    }

    public void setShowVISA(Boolean showVISA) {
        this.showVISA = showVISA;
    }

    public void setShowMC(Boolean showMC) {
        this.showMC = showMC;
    }

    public void setShowAMEX(Boolean showAMEX) {
        this.showAMEX = showAMEX;
    }

    public void setShowDINACARD(Boolean showDINACARD) {
        this.showDINACARD = showDINACARD;
    }

    public void setShowDINERS(Boolean showDINERS) {
        this.showDINERS = showDINERS;
    }

    public void setShowJCB(Boolean showJCB) {
        this.showJCB = showJCB;
    }

    public void setShowTROY(Boolean showTROY) {
        this.showTROY = showTROY;
    }

    public void setMerchantBusinessId(String merchantBusinessId) {
        this.merchantBusinessId = merchantBusinessId;
    }

}
