package com.hhly.skeleton.cms.operatemgr.vo;

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

	@Group({ UPD })
	@NotNull
	private Long id;

	@Group({ UPD, ADD })
	@NotNull
	private String advTitle;

	// @JsonIgnore
	private String advCode;

	@Group({ UPD, ADD })
	@NotNull
	//@Range(min = 1, max = 4, msg = "发布平台")
	private String platform;

	@Group({ UPD, ADD })
	@NotNull
	//@Range(min = 1, max = 2, msg = "广告图页面")
	private Short menu;

	@Group({ UPD, ADD })
	@NotNull
	//@Range(min = 1, max = 14, msg = "广告图位置")
	private Short position;

	@Group({ UPD })
	// @NotNull
	private String positionInfo;

	@Group({ UPD, ADD })
	@NotNull(msg = "发布状态")
	//@Range(min = -1, max = 2, msg = "发布状态")
	private Short status;

	@Group({ UPD, ADD })
	@NotNull
	//@Range(min = 0, max = 1, msg = "打开方式")
	private Short target;

	@Group({ UPD })
	// @NotNull
	private String adUrl;

	@Group({ UPD, ADD })
	@NotNull
	private String img;

	@Group({ UPD, ADD })
	@NotNull(msg = "上线时间")
	private Date onlineTime;

	@Group({ UPD, ADD })
	@NotNull(msg = "下线时间")
	private Date offlineTime;

	@Group({ UPD, ADD })
	@NotNull
	private Short orderId;

	private String remark;

	/**
	 * 广告可见次数:1每次刷新;2每小时;3每天;4每周;5可见一次
	 */
	@Group({ UPD, ADD })
	@NotNull
	//@Range(min = 1, max = 5, msg = "广告可见次数")
	private Byte display;
	
	// @JsonIgnore
	private String createBy;
	// @JsonIgnore
	private String modifyBy;
	
	/**
	 * 用于sql中 id!=excludedId
	 */
	private Long excludedId;
	
	/**
	 * 广告用户对象，多选，值为M_TYPE表的id字段
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
	
	/**
	 * 广告对象或广告渠道是否有变化，用于更新时判断是否要更新中间表
	 */
	private boolean adObjectChange;

	private Short searchTimeType;
	private Date startTime;
	private Date endTime;
	
	private Integer publishStatus;
	private String typeCode;
	private Integer lotteryCode;
	private Integer channelId;
	
	
	/**
	 * 广告对象用户ID
	 */
	private Long userId;
	
	private String token;
	

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
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



	public String getAdvTitle() {
		return advTitle;
	}

	public void setAdvTitle(String advTitle) {
		this.advTitle = advTitle;
	}


	public Short getMenu() {
		return menu;
	}

	public void setMenu(Short menu) {
		this.menu = menu;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Short getPosition() {
		return position;
	}

	public void setPosition(Short position) {
		this.position = position;
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

	public String getAdvCode() {
		return advCode;
	}

	public void setAdvCode(String advCode) {
		this.advCode = advCode;
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

	public Long getExcludedId() {
		return excludedId;
	}

	public void setExcludedId(Long excludedId) {
		this.excludedId = excludedId;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isAdObjectChange() {
		return adObjectChange;
	}

	public void setAdObjectChange(boolean adObjectChange) {
		this.adObjectChange = adObjectChange;
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