package com.hhly.skeleton.pay.channel.bo;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @version 1.0
 * @auth chenkangning
 * @date 2017/4/8
 * @desc 支付渠道BO
 * @compay 益彩网络科技有限公司
 */
@SuppressWarnings("serial")
public class PayChannelBO extends BaseBO {

	/**
	 * ID主键
	 */
	private Integer id;

	/**
	 * 渠道名称
	 */
	private String name;

	/**
	 *支付渠道编号 支付宝 ALIPAY、微信 WECHAT、连连 LIANLIAN、京东 JINGDONG、百度 BAIDU、网易 NETEASE
	 */
	private String code;
	/**
	 * 银行ID
	 */
	private Long bankId;

	/**
	 * 渠道支付类型:1网银支付;2快捷支付,3第三方支付
	 */
	private Short type;

	/**
	 * 卡类型:1储蓄卡;2信用卡,3第三方支付
	 */
	private Short cardType;

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
	private Date beginTime;

	/**
	 * 暂停结束时间
	 */
	private Date endTime;

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
	/**
	 * 微信公众号 1代表可用，0不可用
	 */
	private Short wechat;

	/**
	 * 排序，数字越小越靠前
	 */
	private Integer orderId;

	/**
	 * null
	 */
	private String createBy;

	/**
	 * null
	 */
	private String modifyBy;

	/**
	 * null
	 */
	private Date modifyTime;

	/**
	 * null
	 */
	private Date updateTime;

	/**
	 * null
	 */
	private Date createTime;
	private Double rate;// 服务费率
	private Short charge;// 是否收费 0否，1是
	private Integer payChannelMgrId;// 支付渠道ID,关联pay_channel_mgr表的主键id
	private Short appInvokeType;// app调用:1调用sdk，0调用h5
	@JsonIgnore
	private Double minPay = 0d;// 最低支付金额(元)
	@JsonIgnore
	private Double maxPay = 0d;// 最高支付金额(元)
	@JsonIgnore
	private Map<String, PayChannelLimitBO> limitMap;// 支付渠道限额map

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

	public Long getBankId() {
		return bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Short getCardType() {
		return cardType;
	}

	public void setCardType(Short cardType) {
		this.cardType = cardType;
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

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Short getCharge() {
		return charge;
	}

	public void setCharge(Short charge) {
		this.charge = charge;
	}

	public Integer getPayChannelMgrId() {
		return payChannelMgrId;
	}

	public void setPayChannelMgrId(Integer payChannelMgrId) {
		this.payChannelMgrId = payChannelMgrId;
	}

	public Double getMinPay() {
		return minPay;
	}

	public void setMinPay(Double minPay) {
		this.minPay = minPay;
	}

	public Double getMaxPay() {
		return maxPay;
	}

	public void setMaxPay(Double maxPay) {
		this.maxPay = maxPay;
	}

	public Map<String, PayChannelLimitBO> getLimitMap() {
		return limitMap;
	}

	public void setLimitMap(Map<String, PayChannelLimitBO> limitMap) {
		this.limitMap = limitMap;
	}

	public Short getAppInvokeType() {
		return appInvokeType;
	}

	public void setAppInvokeType(Short appInvokeType) {
		this.appInvokeType = appInvokeType;
	}

	public Short getWechat() {
		return wechat;
	}

	public void setWechat(Short wechat) {
		this.wechat = wechat;
	}

}
