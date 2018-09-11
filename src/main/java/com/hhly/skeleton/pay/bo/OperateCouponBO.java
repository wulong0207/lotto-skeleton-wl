package com.hhly.skeleton.pay.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * @desc 运营管理的优惠券详情（彩金）
 * @author xiongJinGang
 * @date 2017年3月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateCouponBO implements Serializable {
	private static final long serialVersionUID = 8758520266400923107L;
	/**
	 * 自增Id
	 */
	private Integer id;
	/**
	 * 自定义编号
	 */
	private String redCode;
	/**
	 * 红包类别 1：实体；2：虚拟 
	 */
	private Short redCategory;
	/**
	 * 活动管理编号
	 */
	private String activityCode;
	/**
	 * 关联彩种运营管理ID，list 
	 */
	private String operateLotteryId;
	/**
	 * 激活截止时间 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date activeEndTime;
	/**
	 * 用户获取红包的时间 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date obtainTime;
	/**
	 * 获取时间+有效天数 = 红包过期时间。
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date redOverdueTime;
	/**
	 * 使用时间 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date useTime;
	/**
	 * 1：充值优惠；2：消费折扣；3：彩金红包；4：加奖红包；5：大礼包；6：随机红包
	 */
	private Short redType;
	/**
	 * 红包名称；按照指定规则生成；根据红包类型，红包面额，最低消费生成红包名称。 
	 */
	private String redName;
	/**
	 * 红包实际金额 
	 */
	private Double redValue;
	/**
	 * 红包余额 
	 */
	private Double redBalance;
	/**
	 * 最低消费金额 使用红包的条件。根据订单金额计算。 
	 */
	private Integer minSpendAmount;
	/**
	 * 所属用户。user_id 
	 */
	@JsonIgnore
	private Integer userId;
	/**
	 * 用户获取红包后的有效天数。 
	 */
	private Integer ectivityDay;
	/**
	 * 渠道ID 2、本站PC；4、本站android；5、本站IOS；6、本站WAP；7、未知渠道
	 */
	private String channelId;
	/**
	 * 可自定义的红包标签。 
	 */
	private String redLabel;
	/**
	 * 1：待激活；2：待派发；3：可使用；4：已过期；5：已作废；6：已使用 
	 */
	private String redStatus;
	/**
	 * 1：主站Web专用；2：主站Wap专用；3：合作版Wap专用；4：客户端专用；5：API接口专用；6：其它平台专用； 
	 */
	private String limitPlatform;
	/**
	 * lottery_id；多选，list；用逗号隔开 
	 */
	private String limitLottery;
	/**
	 * 自定义的说明。根据类型，面值，最低消费金额，平台，彩种，根据文档进行判断是否可用。规则为固定的。 
	 */
	private String useRule;
	/**
	 * 红包备注 
	 */
	private String redRemark;
	/**
	 * 修改时间 
	 */
	@JsonIgnore
	private Date modifyTime;
	/**
	 * 修改人 
	 */
	@JsonIgnore
	private String modifyBy;
	/**
	 * 创建人 
	 */
	@JsonIgnore
	private String createBy;
	/**
	 * 更新时间 
	 */
	@JsonIgnore
	private Date updateTime;
	/**
	 * 创建时间 
	 */
	@JsonIgnore
	private Date createTime;
	/**
	 * 修改备注
	 */
	@JsonIgnore
	private String remark;
	/**
	 * 来源类型:1：活动；2：券；3：撤单生成
	 */
	private Short redSource;
	/**
	 * 限制红包子玩法
	 */
	private String limitLotteryChild;
	/**
	 * 限制红包玩法类型
	 */
	private String limitLotteryChildType;
	/**
	 * 随机红包生成红包类型为：1.彩金红包2.满减红包3.充值红包4. 加奖红包
	 */
	private Short randomRedType;

	/**
	 * 是否块过期 0,否，1是
	 */
	private Short overTimeStatus;

	public OperateCouponBO() {
		super();
	}

	public OperateCouponBO(String redName, String redCode, Integer userId, Short redSource, String remark) {
		super();
		this.redCode = redCode;
		this.userId = userId;
		this.redSource = redSource;
		this.redName = redName;
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public Short getRedCategory() {
		return redCategory;
	}

	public void setRedCategory(Short redCategory) {
		this.redCategory = redCategory;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getOperateLotteryId() {
		return operateLotteryId;
	}

	public void setOperateLotteryId(String operateLotteryId) {
		this.operateLotteryId = operateLotteryId;
	}

	public Date getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(Date activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public Date getObtainTime() {
		return obtainTime;
	}

	public void setObtainTime(Date obtainTime) {
		this.obtainTime = obtainTime;
	}

	public Date getRedOverdueTime() {
		return redOverdueTime;
	}

	public void setRedOverdueTime(Date redOverdueTime) {
		this.redOverdueTime = redOverdueTime;
	}

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public Short getRedType() {
		return redType;
	}

	public void setRedType(Short redType) {
		this.redType = redType;
	}

	public String getRedName() {
		return redName;
	}

	public void setRedName(String redName) {
		this.redName = redName;
	}

	public Double getRedValue() {
		return redValue;
	}

	public void setRedValue(Double redValue) {
		this.redValue = redValue;
	}

	public Double getRedBalance() {
		return redBalance;
	}

	public void setRedBalance(Double redBalance) {
		this.redBalance = redBalance;
	}

	public Integer getMinSpendAmount() {
		return minSpendAmount;
	}

	public void setMinSpendAmount(Integer minSpendAmount) {
		this.minSpendAmount = minSpendAmount;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getEctivityDay() {
		return ectivityDay;
	}

	public void setEctivityDay(Integer ectivityDay) {
		this.ectivityDay = ectivityDay;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getRedLabel() {
		return redLabel;
	}

	public void setRedLabel(String redLabel) {
		this.redLabel = redLabel;
	}

	public String getRedStatus() {
		return redStatus;
	}

	public void setRedStatus(String redStatus) {
		this.redStatus = redStatus;
	}

	public String getLimitPlatform() {
		return limitPlatform;
	}

	public void setLimitPlatform(String limitPlatform) {
		this.limitPlatform = limitPlatform;
	}

	public String getLimitLottery() {
		return limitLottery;
	}

	public void setLimitLottery(String limitLottery) {
		this.limitLottery = limitLottery;
	}

	public String getUseRule() {
		return useRule;
	}

	public void setUseRule(String useRule) {
		this.useRule = useRule;
	}

	public String getRedRemark() {
		return redRemark;
	}

	public void setRedRemark(String redRemark) {
		this.redRemark = redRemark;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getLimitLotteryChild() {
		return limitLotteryChild;
	}

	public void setLimitLotteryChild(String limitLotteryChild) {
		this.limitLotteryChild = limitLotteryChild;
	}

	public String getLimitLotteryChildType() {
		return limitLotteryChildType;
	}

	public void setLimitLotteryChildType(String limitLotteryChildType) {
		this.limitLotteryChildType = limitLotteryChildType;
	}

	public Short getRandomRedType() {
		return randomRedType;
	}

	public void setRandomRedType(Short randomRedType) {
		this.randomRedType = randomRedType;
	}

	public Short getRedSource() {
		return redSource;
	}

	public void setRedSource(Short redSource) {
		this.redSource = redSource;
	}

	public Short getOverTimeStatus() {
		return overTimeStatus;
	}

	public void setOverTimeStatus(Short overTimeStatus) {
		this.overTimeStatus = overTimeStatus;
	}

	@Override
	public String toString() {
		return "OperateCouponBO [redCode=" + redCode + ", redValue=" + redValue + ", redBalance=" + redBalance + ", userId=" + userId + ", redStatus=" + redStatus + "]";
	}

}