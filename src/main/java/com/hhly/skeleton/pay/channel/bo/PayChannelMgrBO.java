package com.hhly.skeleton.pay.channel.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 支付渠道管理
 * @author xiongJinGang
 * @date 2017年12月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayChannelMgrBO extends BaseBO {
	private static final long serialVersionUID = -6419873915064827323L;

	private Integer id;
	private String name;// 渠道名称
	private String code;// 支付渠道code。如：支付宝 ALIPAY、微信 WECHAT
	private Short orderId;// 排序越大越靠前
	private Double minPay;// 最低支付金额(元)
	private Double maxPay;// 最高支付金额(元)
	private Double rate;// 费率
	private Boolean pc;// PC平台 1代表可用，0不可用
	private Boolean h5;// H5平台 1代表可用，0不可用
	private Boolean android;// ANDROID平台 1代表可用，0不可用
	private Boolean ios;// IOS平台 1代表可用，0不可用
	private Boolean available;// 是否可用:0不可用;1可用
	private Boolean pause;// 是否暂停:0不可用;1可用
	private Date beginTime;// 暂停开始时间
	private Date endTime;// 暂停结束时间
	private String createBy;//
	private Date createTime;//
	private String modifyBy;//
	private Date modifyTime;//
	private String remark;//

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
		this.name = name == null ? null : name.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public Short getOrderId() {
		return orderId;
	}

	public void setOrderId(Short orderId) {
		this.orderId = orderId;
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

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Boolean getPc() {
		return pc;
	}

	public void setPc(Boolean pc) {
		this.pc = pc;
	}

	public Boolean getH5() {
		return h5;
	}

	public void setH5(Boolean h5) {
		this.h5 = h5;
	}

	public Boolean getAndroid() {
		return android;
	}

	public void setAndroid(Boolean android) {
		this.android = android;
	}

	public Boolean getIos() {
		return ios;
	}

	public void setIos(Boolean ios) {
		this.ios = ios;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Boolean getPause() {
		return pause;
	}

	public void setPause(Boolean pause) {
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy == null ? null : modifyBy.trim();
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}
}