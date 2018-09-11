package com.hhly.skeleton.activity.vo;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.ObjectUtil;


/**
 * @desc 活动渠道vo类
 * @author lidecheng
 * @date 2017年6月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ActivityMsgVO extends BaseBO{			
	/**活动类型*/
	private List<Integer> activityType;
	/**流水号*/
	private String transId; 
	/**活动编号*/
	private String activityCode;
	/**用户操作*/
	private Short userAction;
	/**渠道*/
	private String channelId;
	/**是否必须活动页参与(0:否;1:是)*/
	private Short isActivityPage;
	private Integer type;
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public ActivityMsgVO(){
		
	}
	public ActivityMsgVO(MsgVO msgVo){
		this.transId = msgVo.getTransId();
		this.activityCode = msgVo.getActivityCode();
		this.channelId = msgVo.getChannelId();
		this.isActivityPage=ObjectUtil.isBlank(msgVo.getActivityPage())?0:Short.valueOf(msgVo.getActivityPage());
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

	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public Short getUserAction() {
		return userAction;
	}
	public void setUserAction(Short userAction) {
		this.userAction = userAction;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public Short getIsActivityPage() {
		return isActivityPage;
	}
	public void setIsActivityPage(Short isActivityPage) {
		this.isActivityPage = isActivityPage;
	}
	@Override  
	public String toString(){
		return "流水号"+transId+",活动编号"+activityCode;
	}
}
