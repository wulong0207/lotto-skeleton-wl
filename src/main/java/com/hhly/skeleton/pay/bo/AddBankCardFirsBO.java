package com.hhly.skeleton.pay.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @version 1.0
 * @auth chenkangning
 * @date 2017/4/11
 * @desc 移动端添加银行卡时，根据银行卡获取数据对象
 * @compay 益彩网络科技有限公司
 */
public class AddBankCardFirsBO extends BaseBO{
    
    @JsonProperty("bk_id")
    private String bankId;
    /**银行卡号*/
    @JsonProperty("cc")
    private String cardCode;
    /**银行名称*/
    @JsonProperty("bkn")
    private String bankName;
    /**银行类型,1储蓄卡;2信用卡;*/
    @JsonProperty("bct")
    private Integer cardType;
    /**用户姓名*/
    @JsonProperty("rn")
    private String userName;
    /**用户身份证号*/
    @JsonProperty("idc")
    private String idCard;
    /**是否开启快捷支付 0：否，1：是*/
    private Integer openbank;
    /** 绑定的手机号*/
    @JsonProperty("mb")
    private String mobile;
    /**
     * 银行log
     */
    @JsonProperty("slg")
    private String slog;
    
    public String getSlog () {
        return slog;
    }
    
    public void setSlog (String slog) {
        this.slog = slog;
    }
    
    public String getBankId () {
        return bankId;
    }
    
    public void setBankId (String bankId) {
        this.bankId = bankId;
    }
    
    public String getCardCode () {
        return cardCode;
    }
    
    public void setCardCode (String cardCode) {
        this.cardCode = cardCode;
    }
    
    public String getBankName () {
        return bankName;
    }
    
    public void setBankName (String bankName) {
        this.bankName = bankName;
    }
    
    public Integer getCardType () {
        return cardType;
    }
    
    public void setCardType (Integer cardType) {
        this.cardType = cardType;
    }
    
    public String getUserName () {
        return userName;
    }
    
    public void setUserName (String userName) {
        this.userName = userName;
    }
    
    public String getIdCard () {
        return idCard;
    }
    
    public void setIdCard (String idCard) {
        this.idCard = idCard;
    }
    
    public Integer getOpenbank () {
        return openbank;
    }
    
    public void setOpenbank (Integer openbank) {
        this.openbank = openbank;
    }
    
    public String getMobile () {
        return mobile;
    }
    
    public void setMobile (String mobile) {
        this.mobile = mobile;
    }
    
    @Override
    public String toString () {
        return "AddBankCardFirsBO{" +
                "cardCode='" + cardCode + '\'' +
                ", bankName='" + bankName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", userName='" + userName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", openbank='" + openbank + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
