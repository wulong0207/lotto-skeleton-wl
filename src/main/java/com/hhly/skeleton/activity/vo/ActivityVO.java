package com.hhly.skeleton.activity.vo;
import java.util.Date;
import java.util.List;

import com.hhly.skeleton.activity.bo.OrderInfoBO;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 活动vo类
 * @author lidecheng
 * @date 2017年6月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ActivityVO extends BaseBO{
	/**用户id*/
	private String userId;
	/**税后金额*/
	private Double aftBonus; 
	/**购买类型    1：代购；2：追号；3：合买*/
	private Short buyType; 
	/**投注平台:1：Web,2:Wap;3:Android;4:IOS*/
	private Short platform;
	/**活动时间*/
	private Date activityTime;
	/**彩种类型*/
	private Integer lotteryCode;
	/**活动类型*/
	private List<Integer> activityType;
	/**活动类型*/
	private Integer actType;
	/**活动编号*/
	private String activityCode;
	/**用户操作*/
	private Short userAction;
	/**查询时间*/
	private Date selectTime;
	/**查询时间*/
	private Short ruleType;
	/**查询追加期数*/
	private Integer addNum;
	private String channelId;
	private Integer rowNum;
	
	public Integer getRowNum() {
		return rowNum;
	}
	public void setRowNum(Integer rowNum) {
		this.rowNum = rowNum;
	}
	public ActivityVO(){	
	}
	public ActivityVO(ActivityMsgVO msgVO){
		this.activityType = msgVO.getActivityType();
		this.activityCode = msgVO.getActivityCode();
		this.userAction=msgVO.getUserAction();
	}	
	public ActivityVO(ActivityMsgVO msgVO,OrderInfoBO orderInfoBO){
		this.activityType = msgVO.getActivityType();
		this.activityCode = msgVO.getActivityCode();
		this.lotteryCode = orderInfoBO.getLotteryCode();
	}
	
	public Integer getAddNum() {
		return addNum;
	}
	public void setAddNum(Integer addNum) {
		this.addNum = addNum;
	}
	public Date getSelectTime() {
		return selectTime;
	}
	public void setSelectTime(Date selectTime) {
		this.selectTime = selectTime;
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public List<Integer> getActivityType() {
		return activityType;
	}
	public void setActivityType(List<Integer> activityType) {
		this.activityType = activityType;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Date getActivityTime() {
		return activityTime;
	}
	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Double getAftBonus() {
		return aftBonus;
	}
	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}
	public Short getBuyType() {
		return buyType;
	}
	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}
	public Short getPlatform() {
		return platform;
	}
	public void setPlatform(Short platform) {
		this.platform = platform;
	}
	public Integer getActType() {
		return actType;
	}
	public void setActType(Integer actType) {
		this.actType = actType;
	}
	public Short getUserAction() {
		return userAction;
	}
	public void setUserAction(Short userAction) {
		this.userAction = userAction;
	}
	public Short getRuleType() {
		return ruleType;
	}
	public void setRuleType(Short ruleType) {
		this.ruleType = ruleType;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}	
}
