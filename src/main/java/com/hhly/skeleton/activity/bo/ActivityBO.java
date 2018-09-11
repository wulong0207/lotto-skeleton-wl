package com.hhly.skeleton.activity.bo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

public class ActivityBO extends BaseBO {

	private static final long serialVersionUID = 8719030660466356718L;
	/**
	 * 自定义ID
	 */
	private String activityCode;
	/**
	 * 彩种类型
	 */
	private Integer lotteryCode;
	private String channelId;
	/**
	 * 活动名称
	 */
	private String activityName;

	/**
	 * 1：本站加奖,2：官方加奖,3奖上奖；
	 */
	private Integer activityType;

	/**
	 * 活动开始时间
	 */
	private Date activityStartTime;

	/**
	 * 活动结束时间
	 */
	private Date activityEndTime;

	/**
	 * 活动状态
	 */
	private Short activityStatus;

	/**
	 * 单个方案返奖上限
	 */
	private Double singleOrderMoney;

	/**
	 * 单个用户彩金上限
	 */
	private Double singleUserRedMoney;

	/**
	 * 单个用户返奖上限
	 */
	private Double singleUserMoney;

	/**
	 * 单个用户单日返奖上限
	 */
	private Double singleUserDayMoney;

	/**
	 * 同一真实名称享受人数
	 */
	private Short realUserNum;
	
	/**
	 * 同一手机号码享受人数
	 */
	private Short mobileNum;

	/**
	 * 用户类型(1所有,2发起人, 3合买人等)
	 */
	private Short userType;
	/**
	 * 返利用户类型, 1:返所有用户;2:返发起人
	 */
	private Short rebateUserType;
	/**
	 * 赠送类型,1优惠券;2彩票，兑换码类型 3一码一用 4一码多用
	 */
	private Short configType;

	/**
	 * 合买订单是否参与(0:不参与; 1:参与)
	 */
	private Short isFollowOrder;

	/**
	 * 保底订单是否参与(0:不参与; 1:参与)
	 */
	private Short isCareOrder;

	/**
	 * 是否手机(0:否;1:是)
	 */
	private Short isMobile;

	/**
	 * 是否真实用户(0:否;1:是)
	 */
	private Short isRealUser;

	/**
	 * 分期次数1为全送，大于1分月
	 */
	private Integer installment;

	/**
	 * 分期额度(分月值大于等于2时输入，用#号分隔)
	 */
	private String installmentMoney;

	/**
	 * 优惠次数
	 */
	private Short offerNum;

	/**
	 * 优惠金额
	 */
	private Double offerMoney;

	/**
	 * 平台
	 */
	private String platfrom;

	/**
	 * 最小充值金额
	 */

	private Double minRechargeMoney;
	/**
	 * 活动当日享受次数
	 */
	private Integer activityDayNum;
	/**
	 * 是否大乐透追加
	 */
	private Short isDltAdd;
	/**
	 * 是否允许用户撤单
	 */
	private Short isCancel;
	/**
	 * 中奖是否参与
	 */
	private Short isAward;
	/**
	 * 是否必须活动页参与(0:否;1:是)
	 */
	private Short isActivityPage;
	/**
	 * 图标样式
	 */
	private String icon;
	/**
	 * 移动端图标跳转链接
	 */
	private String mobileIconUrl;
	/**
	 * pc图标跳转链接
	 */
	private String pcIconUrl;
	
	private Short outMatchNun;
	/**
	 * 规则信息
	 */
	private List<?> activityRule;

	/**
	 * 优惠券规则
	 */
	private List<OperateCouponTempBO> activityCouponRuleList;
	/**
	 * 送彩票规则
	 */
	private List<OperateActivityLottoBO> activityLottoRuleList;

	public Short getOutMatchNun() {
		return outMatchNun;
	}

	public void setOutMatchNun(Short outMatchNun) {
		this.outMatchNun = outMatchNun;
	}

	public Short getIsDltAdd() {
		return isDltAdd;
	}

	public void setIsDltAdd(Short isDltAdd) {
		this.isDltAdd = isDltAdd;
	}

	public Short getIsCancel() {
		return isCancel;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMobileIconUrl() {
		return mobileIconUrl;
	}

	public void setMobileIconUrl(String mobileIconUrl) {
		this.mobileIconUrl = mobileIconUrl;
	}

	public String getPcIconUrl() {
		return pcIconUrl;
	}

	public void setPcIconUrl(String pcIconUrl) {
		this.pcIconUrl = pcIconUrl;
	}

	public void setIsCancel(Short isCancel) {
		this.isCancel = isCancel;
	}

	public Short getIsAward() {
		return isAward;
	}

	public void setIsAward(Short isAward) {
		this.isAward = isAward;
	}

	public Integer getActivityDayNum() {
		return activityDayNum;
	}

	public void setActivityDayNum(Integer activityDayNum) {
		this.activityDayNum = activityDayNum;
	}

	public Double getMinRechargeMoney() {
		return minRechargeMoney;
	}

	public void setMinRechargeMoney(Double minRechargeMoney) {
		this.minRechargeMoney = minRechargeMoney;
	}

	public List<?> getActivityRule() {
		return activityRule;
	}

	public void setActivityRule(List<?> activityRule) {
		this.activityRule = activityRule;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Integer getActivityType() {
		return activityType;
	}

	public void setActivityType(Integer activityType) {
		this.activityType = activityType;
	}

	public Date getActivityStartTime() {
		return activityStartTime;
	}

	public void setActivityStartTime(Date activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public Date getActivityEndTime() {
		return activityEndTime;
	}

	public void setActivityEndTime(Date activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public Short getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(Short activityStatus) {
		this.activityStatus = activityStatus;
	}

	public Double getSingleOrderMoney() {
		return singleOrderMoney;
	}

	public void setSingleOrderMoney(Double singleOrderMoney) {
		this.singleOrderMoney = singleOrderMoney;
	}

	public Double getSingleUserRedMoney() {
		return singleUserRedMoney;
	}

	public void setSingleUserRedMoney(Double singleUserRedMoney) {
		this.singleUserRedMoney = singleUserRedMoney;
	}

	public Double getSingleUserMoney() {
		return singleUserMoney;
	}

	public void setSingleUserMoney(Double singleUserMoney) {
		this.singleUserMoney = singleUserMoney;
	}

	public Double getSingleUserDayMoney() {
		return singleUserDayMoney;
	}

	public void setSingleUserDayMoney(Double singleUserDayMoney) {
		this.singleUserDayMoney = singleUserDayMoney;
	}

	public Short getRealUserNum() {
		return realUserNum;
	}

	public void setRealUserNum(Short realUserNum) {
		this.realUserNum = realUserNum;
	}
	
	public Short getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(Short mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Short getUserType() {
		return userType;
	}

	public void setUserType(Short userType) {
		this.userType = userType;
	}
	
	public Short getConfigType() {
		return configType;
	}

	public void setConfigType(Short configType) {
		this.configType = configType;
	}

	public Short getIsFollowOrder() {
		return isFollowOrder;
	}

	public void setIsFollowOrder(Short isFollowOrder) {
		this.isFollowOrder = isFollowOrder;
	}

	public Short getIsCareOrder() {
		return isCareOrder;
	}

	public void setIsCareOrder(Short isCareOrder) {
		this.isCareOrder = isCareOrder;
	}

	public Short getIsMobile() {
		return isMobile;
	}

	public void setIsMobile(Short isMobile) {
		this.isMobile = isMobile;
	}

	public Short getIsRealUser() {
		return isRealUser;
	}

	public void setIsRealUser(Short isRealUser) {
		this.isRealUser = isRealUser;
	}

	public Integer getInstallment() {
		return installment;
	}

	public void setInstallment(Integer installment) {
		this.installment = installment;
	}

	public String getInstallmentMoney() {
		return installmentMoney;
	}

	public void setInstallmentMoney(String installmentMoney) {
		this.installmentMoney = installmentMoney;
	}

	public Short getOfferNum() {
		return offerNum;
	}

	public void setOfferNum(Short offerNum) {
		this.offerNum = offerNum;
	}

	public Double getOfferMoney() {
		return offerMoney;
	}

	public void setOfferMoney(Double offerMoney) {
		this.offerMoney = offerMoney;
	}

	public String getPlatfrom() {
		return platfrom;
	}

	public void setPlatfrom(String platfrom) {
		this.platfrom = platfrom;
	}

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

	public List<OperateCouponTempBO> getActivityCouponRuleList() {
		return activityCouponRuleList;
	}

	public void setActivityCouponRuleList(List<OperateCouponTempBO> activityCouponRuleList) {
		this.activityCouponRuleList = activityCouponRuleList;
	}

	public List<OperateActivityLottoBO> getActivityLottoRuleList() {
		return activityLottoRuleList;
	}

	public void setActivityLottoRuleList(List<OperateActivityLottoBO> activityLottoRuleList) {
		this.activityLottoRuleList = activityLottoRuleList;
	}

	public Short getIsActivityPage() {
		return isActivityPage;
	}

	public void setIsActivityPage(Short isActivityPage) {
		this.isActivityPage = isActivityPage;
	}

	public Short getRebateUserType() {
		return rebateUserType;
	}

	public void setRebateUserType(Short rebateUserType) {
		this.rebateUserType = rebateUserType;
	}

}
