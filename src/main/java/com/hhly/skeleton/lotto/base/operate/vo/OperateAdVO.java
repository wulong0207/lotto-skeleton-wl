package com.hhly.skeleton.lotto.base.operate.vo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

/**
 * @desc 运营广告
 * @author Tony Wang
 * @date 2017年2月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateAdVO extends PageVO {

	private static final long serialVersionUID = 1785233040720550310L;

	private Long id;
	private Short platform;
	private Short menu;
	private Short position;
	private Short status;
	private Date onlineTime;
	private Date offlineTime;
	private String remark;
	private Byte display;	
	/**
	 * 是否默认 0：否，1：是
	 */
	private Integer defaultAd;

	private Short searchTimeType;
	private Date startTime;
	private Date endTime;
	
	private Integer publishStatus;
	private String typeCode;
	private Integer lotteryCode;
	
	private String channelId;
	
	
	/**
	 * 广告对象用户ID
	 */
	private Long userId;
	
	private String token;
	

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getPublishStatus() {
		return publishStatus;
	}

	public void setPublishStatus(Integer publishStatus) {
		this.publishStatus = publishStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
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
	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
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
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Short getSearchTimeType() {
		return searchTimeType;
	}

	public void setSearchTimeType(Short searchTimeType) {
		this.searchTimeType = searchTimeType;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Byte getDisplay() {
		return display;
	}

	public void setDisplay(Byte display) {
		this.display = display;
	}
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getDefaultAd() {
		return defaultAd;
	}

	public void setDefaultAd(Integer defaultAd) {
		this.defaultAd = defaultAd;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
}