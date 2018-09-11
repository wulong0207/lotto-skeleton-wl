package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.vo.BaseVO;

import java.util.Date;

/**
 * @desc 用户银行卡数据对象
 * @author chenkangning
 * @date 2017年3月6日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayBankcardVO extends BaseVO{

    /**
     * 是否需要验证身份
     */
    private String validateInfo;

    private String token;
    
	/**手机号*/
	private String mobile;
	/**验证码*/
    private String code;
    
    /**
     * ID主键
     */
    private Integer id;

    /**
     * 银行卡id
     */
    private Integer cardId;
    
    /**
     * 用户id
     */
    private Integer userid;
    
    /**
     * 真实姓名
     */
    private String realname;
    
    /**
     * 银行id
     */
    private Integer bankid;
    
    /**
     * 开户行名称
     */
    private String bankname;
    
    /**
     * 是默认卡 0：否，1：是
     */
    private Short isdefault;
    
    /**
     * 是否开启快捷支付 0：否，1：是
     */
    private Short openbank;
    
    /**
     * 省份
     */
    private String province;
    
    /**
     * 城市
     */
    private String city;
    
    /**
     * 银行卡号
     */
    private String cardcode;
    
    /**
     * 银行卡类型:1储蓄卡;2信用卡
     */
    private Short banktype;
    
    /**
     * 针对信用卡(有效期,年,月字串)
     */
    private String overdue;
    
    /**
     * 是否绑定 0：否，1：是
     */
    private Short bindflag;
    
    /**
     * 针对信用卡(安全码)
     */
    private String safecode;
    
    /**
     *  ip地址
     */
    private String ip;
    
    /**
     * null
     */
    private String ext;
    
    /**
     * 更新时间
     */
    private Date updateTime;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 卡状态:0:删除;1:有效
     */
    private Short status;
    
    /**
     * 姓名
     */
    private String userName;
    /**
     * 身份证
     */
    private String idCard;

    /**
     * 平台
     */
    private Short platform;

    public String getValidateInfo() {
        return validateInfo;
    }

    public void setValidateInfo(String validateInfo) {
        this.validateInfo = validateInfo;
    }

    public PayBankcardVO(){}
    public PayBankcardVO (Integer userid) {
        this.userid = userid;
    }
    
    public PayBankcardVO(Integer userid, String cardcode) {
		super();
		this.userid = userid;
		this.cardcode = cardcode;
	}
	public String getToken () {
        return token;
    }
    
    public void setToken (String token) {
        this.token = token;
    }
    
    public Integer getId () {
        return id;
    }
    
    public void setId (Integer id) {
        this.id = id;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getUserid () {
        return userid;
    }
    
    public void setUserid (Integer userid) {
        this.userid = userid;
    }
    
    public String getRealname () {
        return realname;
    }
    
    public void setRealname (String realname) {
        this.realname = realname;
    }
    
    public Integer getBankid () {
        return bankid;
    }
    
    public void setBankid (Integer bankid) {
        this.bankid = bankid;
    }
    
    public String getBankname () {
        return bankname;
    }
    
    public void setBankname (String bankname) {
        this.bankname = bankname;
    }
    
    public Short getIsdefault () {
        return isdefault;
    }
    
    public void setIsdefault (Short isdefault) {
        this.isdefault = isdefault;
    }
    
    public Short getOpenbank () {
        return openbank;
    }
    
    public void setOpenbank (Short openbank) {
        this.openbank = openbank;
    }
    
    public String getProvince () {
        return province;
    }
    
    public void setProvince (String province) {
        this.province = province;
    }
    
    public String getCity () {
        return city;
    }
    
    public void setCity (String city) {
        this.city = city;
    }
    
    public String getCardcode () {
        return cardcode;
    }
    
    public void setCardcode (String cardcode) {
        this.cardcode = cardcode;
    }
    
    public Short getBanktype () {
        return banktype;
    }
    
    public void setBanktype (Short banktype) {
        this.banktype = banktype;
    }
    
    public String getOverdue () {
        return overdue;
    }
    
    public void setOverdue (String overdue) {
        this.overdue = overdue;
    }
    
    public Short getBindflag () {
        return bindflag;
    }
    
    public void setBindflag (Short bindflag) {
        this.bindflag = bindflag;
    }
    
    public String getSafecode () {
        return safecode;
    }
    
    public void setSafecode (String safecode) {
        this.safecode = safecode;
    }
    
    public String getIp () {
        return ip;
    }
    
    public void setIp (String ip) {
        this.ip = ip;
    }
    
    public String getExt () {
        return ext;
    }
    
    public void setExt (String ext) {
        this.ext = ext;
    }
    
    public Date getUpdateTime () {
        return updateTime;
    }
    
    public void setUpdateTime (Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Date getCreateTime () {
        return createTime;
    }
    
    public void setCreateTime (Date createTime) {
        this.createTime = createTime;
    }
    
    public Short getStatus () {
        return status;
    }
    
    public void setStatus (Short status) {
        this.status = status;
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
    
    public String getCode () {
        return code;
    }
    
    public void setCode (String code) {
        this.code = code;
    }
    
    public String getMobile () {
        return mobile;
    }
    
    public void setMobile (String mobile) {
        this.mobile = mobile;
    }

    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "PayBankcardVO{" +
                "validateInfo='" + validateInfo + '\'' +
                ", token='" + token + '\'' +
                ", mobile='" + mobile + '\'' +
                ", code='" + code + '\'' +
                ", id=" + id +
                ", userid=" + userid +
                ", realname='" + realname + '\'' +
                ", bankid=" + bankid +
                ", bankname='" + bankname + '\'' +
                ", isdefault=" + isdefault +
                ", openbank=" + openbank +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", cardcode='" + cardcode + '\'' +
                ", banktype=" + banktype +
                ", overdue='" + overdue + '\'' +
                ", bindflag=" + bindflag +
                ", safecode='" + safecode + '\'' +
                ", ip='" + ip + '\'' +
                ", ext='" + ext + '\'' +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                ", status=" + status +
                ", userName='" + userName + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
