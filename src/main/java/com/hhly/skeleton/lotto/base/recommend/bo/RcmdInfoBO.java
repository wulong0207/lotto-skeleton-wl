package com.hhly.skeleton.lotto.base.recommend.bo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class RcmdInfoBO extends BaseBO {
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 推单发起人；关联用户表
	 */
	private Integer userId;

	/**
	 * 推单编号；可定义“T”开头的21位编号
	 */
	private String rcmdCode;

	/**
	 * 推文标题
	 */
	private String title;

	/**
	 * 栏目编号;推文分栏目展示 保留字段；后续有用
	 */
	private Integer typeId;

	/**
	 * 推文标签
	 */
	private String label;

	/**
	 * 阅读数量/浏览量
	 */
	private Integer click;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;

	/**
	 * 彩种名称
	 */
	private String lotteryName;

	/**
	 * 彩期
	 */
	private String lotteryIssue;

	/**
	 * 玩法编号
	 */
	private Integer lotteryChildCode;

	/**
	 * 过关方式；1：单关 2：2串1
	 */
	private Integer passWay;

	/**
	 * 方案状态；1：进行中；2：已完场；3：删除
	 */
	private Integer status;

	/**
	 * 赛事销售截止时间；取最早赛事的
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date saleEndTime;

	/**
	 * 推文方案的开奖的时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date lotteryTime;

	/**
	 * 中奖状态；1：未中；2：命中；
	 */
	private Integer winningStatus;

	/**
	 * 付费类型；1：免费；2：付费；
	 */
	private Integer payType;

	/**
	 * 付费金额
	 */
	private Float payAmount;

	/**
	 * 付费人数
	 */
	private Integer payCount;

	/**
	 * 启用退款(即不中退款)；0：否 1：是
	 */
	private Integer refundEnabled;

	/**
	 * 是否已退款；用于标识，退款启用(1)且没有命中时，钱款是否已退0：否 1：是
	 */
	private Integer isRefunded;

	/**
	 * 推单平台;1：Web,2:Wap;3:Android;4:IOS
	 */
	private Integer platform;

	/**
	 * 渠道来源;渠道表自定义的ID
	 */
	private String channelId;

	/**
	 * 是否置顶 0：不置顶；1：置顶；
	 */
	private Integer isTop;

	/**
	 * 是否加推荐 0：不推荐；1：推荐；
	 */
	private Integer isRecommend;

	/**
	 * 是否锁定；0：不锁定；1：锁定； 注：锁定的推单不纳入到统计信息(如命中率，连中数等)方便调整显示面
	 */
	private Integer isLock;

	/**
	 * 创建时间/发起时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date updateTime;

	/**
	 * 修改人
	 */
	private String modifyBy;

	/**
	 * 备注说明
	 */
	private String remark;

	/**
	 * 推荐理由
	 */
	private String reason;

	private Integer lock;
	
	private double planAmount;
	
	private double winningAmount;

	public Integer getLock() {
		return lock;
	}

	public void setLock(Integer lock) {
		this.lock = lock;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRcmdCode() {
		return rcmdCode;
	}

	public void setRcmdCode(String rcmdCode) {
		this.rcmdCode = rcmdCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getClick() {
		return click;
	}

	public void setClick(Integer click) {
		this.click = click;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}



	public Integer getPassWay() {
		return passWay;
	}

	public void setPassWay(Integer passWay) {
		this.passWay = passWay;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Date getLotteryTime() {
		return lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public Integer getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Integer winningStatus) {
		this.winningStatus = winningStatus;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Float getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Float payAmount) {
		this.payAmount = payAmount;
	}

	public Integer getPayCount() {
		return payCount;
	}

	public void setPayCount(Integer payCount) {
		this.payCount = payCount;
	}

	public Integer getRefundEnabled() {
		return refundEnabled;
	}

	public void setRefundEnabled(Integer refundEnabled) {
		this.refundEnabled = refundEnabled;
	}

	public Integer getIsRefunded() {
		return isRefunded;
	}

	public void setIsRefunded(Integer isRefunded) {
		this.isRefunded = isRefunded;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getIsTop() {
		return isTop;
	}

	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}

	public Integer getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getIsLock() {
		return isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public double getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(double planAmount) {
		this.planAmount = planAmount;
	}

	public double getWinningAmount() {
		return winningAmount;
	}

	public void setWinningAmount(double winningAmount) {
		this.winningAmount = winningAmount;
	}
	
	
	
}