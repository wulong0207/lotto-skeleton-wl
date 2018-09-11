package com.hhly.skeleton.cms.payment.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

@SuppressWarnings("serial")
public class PayChannelBO extends BaseBO {

	private Integer id;
	/**
	 * 渠道名称
	 */
	private String name;
	/**
	 * 渠道支付类型:1网银支付;2快捷支付,3第三方支付
	 */
	private Short type;
	/**
	 * 卡类型:1储蓄卡;2信用卡,3第三方支付
	 */
	private Short cardtype;
	/**
	 * 是否可用:0不可用;1可用
	 */
	private Short available;
	/**
	 * 是否暂停:0不可用;1可用
	 */
	private Short pause;
	/**
	 * 暂停开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date begintime;
	/**
	 * 暂停结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date endtime;
	/**
	 * PC平台
	 */
	private Short pc;
	/**
	 * H5平台
	 */
	private Short h5;
	/**
	 * ANDROID平台
	 */
	private Short android;
	/**
	 * IOS平台
	 */
	private Short ios;
	private Short wechat;
	/**
	 * 排序
	 */
	private Integer orderId;
	
	private String code;
	
	private Double rate;
	
    private Integer bankid;

    private Integer charge;

    private Integer payChannelMgrId;

    private String createBy;
//
//    private String modifyBy;
//
//    private Date modifyTime;
//
//    private Date updateTime;
//
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    
	/**
	 * app调用:1调用sdk，0调用h5
	 */
	private Integer appInvokeType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getCardtype() {
		return cardtype;
	}

	public void setCardtype(Short cardtype) {
		this.cardtype = cardtype;
	}

	public Short getAvailable() {
		return available;
	}

	public void setAvailable(Short available) {
		this.available = available;
	}

	public Short getPause() {
		return pause;
	}

	public void setPause(Short pause) {
		this.pause = pause;
	}

	public Date getBegintime() {
		return begintime;
	}

	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Short getPc() {
		return pc;
	}

	public void setPc(Short pc) {
		this.pc = pc;
	}

	public Short getH5() {
		return h5;
	}

	public void setH5(Short h5) {
		this.h5 = h5;
	}

	public Short getAndroid() {
		return android;
	}

	public void setAndroid(Short android) {
		this.android = android;
	}

	public Short getIos() {
		return ios;
	}

	public void setIos(Short ios) {
		this.ios = ios;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}

	public Integer getCharge() {
		return charge;
	}

	public void setCharge(Integer charge) {
		this.charge = charge;
	}

	public Integer getPayChannelMgrId() {
		return payChannelMgrId;
	}

	public void setPayChannelMgrId(Integer payChannelMgrId) {
		this.payChannelMgrId = payChannelMgrId;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getAppInvokeType() {
		return appInvokeType;
	}

	public void setAppInvokeType(Integer appInvokeType) {
		this.appInvokeType = appInvokeType;
	}

	public Short getWechat() {
		return wechat;
	}

	public void setWechat(Short wechat) {
		this.wechat = wechat;
	}
}
