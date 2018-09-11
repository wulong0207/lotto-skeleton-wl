package com.hhly.skeleton.cms.payment.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

@SuppressWarnings("serial")
public class PayChannelVO extends PageVO {

	private Integer id;
	/**
	 * 支付渠道
	 */
	@Group({ ADD, UPD })
	@LenRange(min = 1, max = 10, msg = "支付渠道")
	private String name;
	/**
	 * 银行ID
	 */
	private Integer bankid;
	/**
	 * 渠道支付类型:1网银支付;2快捷支付,3第三方支付
	 */
	private Short type;
	/**
	 * 排序
	 */
	private Integer orderId;
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
	private Date begintime;
	/**
	 * 暂停结束时间
	 */
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
	private String createBy;
	private Date createTime;
	private String modifyBy;
	private Date modifyTime;
	private Integer cardtype;
	private String code;
	private Integer[] ids;
	
	private Double rate;
	
	/**
	 * 是否收费
	 */
	private Integer charge;
	
	private Integer payChannelMgrId;
	
	private String bankName;
	
	private boolean joinBank;
	
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

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Integer getCardtype() {
		return cardtype;
	}

	public void setCardtype(Integer cardtype) {
		this.cardtype = cardtype;
	}

	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
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

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public boolean isJoinBank() {
		return joinBank;
	}

	public void setJoinBank(boolean joinBank) {
		this.joinBank = joinBank;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
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

	@Override
	public String toString() {
		return "PayChannelVO [id=" + id + ", name=" + name + ", bankid=" + bankid + ", type=" + type + ", orderId="
				+ orderId + ", available=" + available + ", pause=" + pause + ", begintime=" + begintime + ", endtime="
				+ endtime + ", pc=" + pc + ", h5=" + h5 + ", android=" + android + ", ios=" + ios + ", createBy="
				+ createBy + ", modifyBy=" + modifyBy + ", cardtype=" + cardtype + "]";
	}

}
