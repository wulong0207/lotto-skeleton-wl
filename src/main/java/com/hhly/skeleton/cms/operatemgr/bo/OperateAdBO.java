package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 运营广告
 * @author Tony Wang
 * @date 2017年2月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateAdBO extends BaseBO {

	private static final long serialVersionUID = 9167241127073812298L;

	private Long id;

	private String advCode;

	private String advTitle;

	private String platform;

	private Short menu;

	private Short position;

	private String positionCode;

	private String positionInfo;

	private Short status;

	private Short target;

	private String adUrl;

	private String img;
	/**
	 * 广告用户对象，多选,值为M_TYPE表的id字段
	 */
	private List<Long> userTypes;
	/**
	 * 市场渠道，多选,值为OPERATE_MARKET_CHANNEL的channelId字段,类型为varchar(20)
	 */
	private List<String> channels;
	
	/**
	 * 是否默认 0：否，1：是
	 */
	private Integer defaultAd;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date onlineTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date offlineTime;

	private Short orderId;

	private String remark;

	private String createBy;

	private String modifyBy;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	/**
	 * 广告可见次数:1每次刷新;2每小时;3每天;4每周;5可见一次
	 */
	private Byte display;

	private Integer lotteryCode;
	
	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdvCode() {
		return advCode;
	}

	public void setAdvCode(String advCode) {
		this.advCode = advCode;
	}

	public String getAdvTitle() {
		return advTitle;
	}

	public void setAdvTitle(String advTitle) {
		this.advTitle = advTitle;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Short getMenu() {
		return menu;
	}

	public void setMenu(Short menu) {
		this.menu = menu;
	}

	public Short getPosition() {
		return position;
	}

	public void setPosition(Short position) {
		this.position = position;
	}

	public String getPositionCode() {
		return positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getPositionInfo() {
		return positionInfo;
	}

	public void setPositionInfo(String positionInfo) {
		this.positionInfo = positionInfo;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getTarget() {
		return target;
	}

	public void setTarget(Short target) {
		this.target = target;
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(Date onlineTime) {
		this.onlineTime = onlineTime;
	}

	public Date getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}

	public Short getOrderId() {
		return orderId;
	}

	public void setOrderId(Short orderId) {
		this.orderId = orderId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Byte getDisplay() {
		return display;
	}

	public void setDisplay(Byte display) {
		this.display = display;
	}

	public List<Long> getUserTypes() {
		return userTypes;
	}

	public void setUserTypes(List<Long> userTypes) {
		this.userTypes = userTypes;
	}

	public List<String> getChannels() {
		return channels;
	}

	public void setChannels(List<String> channels) {
		this.channels = channels;
	}

	public Integer getDefaultAd() {
		return defaultAd;
	}

	public void setDefaultAd(Integer defaultAd) {
		this.defaultAd = defaultAd;
	}

}