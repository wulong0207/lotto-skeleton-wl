package com.hhly.skeleton.pay.vo;

import java.util.Calendar;
import java.util.Date;
import com.hhly.skeleton.activity.bo.ActivityBO;
import com.hhly.skeleton.activity.bo.ActivityRuleBO;
import com.hhly.skeleton.activity.bo.OperateCouponTempBO;
import com.hhly.skeleton.activity.bo.OrderInfoBO;
import com.hhly.skeleton.activity.bo.TransRechargeBO;
import com.hhly.skeleton.activity.bo.UserInfoBO;
import com.hhly.skeleton.base.common.ActivityEnum.ActivityOperactionType;
import com.hhly.skeleton.base.common.ActivityEnum.ActivityTypeEnum;
import com.hhly.skeleton.base.common.ActivityEnum.ActivityUserActionEnum;
import com.hhly.skeleton.base.common.OperateCouponEnum.RedSourceEnum;
import com.hhly.skeleton.base.common.OperateCouponEnum.RedStatusEnum;
import com.hhly.skeleton.base.common.OperateCouponEnum.RedTypeEnum;
import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.constants.PayConstants.RedCategoryEnum;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.vo.PageVO;
import com.hhly.skeleton.cms.operatemgr.bo.OperateActivityAddedBO;
import com.hhly.skeleton.cms.operatemgr.bo.OperateActivityAwardBO;
import com.hhly.skeleton.cms.operatemgr.bo.OperateRebateUserBO;

/**
 * @desc 运营管理的优惠券详情（彩金）
 * @author xiongJinGang
 * @date 2017年3月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateCouponVO extends PageVO {
	private static final long serialVersionUID = 8758520266400923107L;

	/**
	 * 会员token
	 */
	private String token;

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
	private Date activeEndTime;
	/**
	 * 用户获取红包的时间 
	 */
	private Date obtainTime;
	/**
	 * 获取时间+有效天数 = 红包过期时间。
	 */
	private Date redOverdueTime;
	/**
	 * 使用时间 
	 */
	private Date useTime;
	/**
	 * 1：充值红包；2：满减红包；3：彩金红包；4：加奖红包；5：大礼包；6：随机红包
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
	 * 使用红包的条件。根据订单金额计算。 
	 */
	private Integer minSpendAmount;
	/**
	 * 所属用户。user_id 
	 */
	private Integer userId;
	/**
	 * 用户获取红包后的有效天数。 
	 */
	private Integer ectivityDay;
	/**
	 * 渠道ID 
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
	 * 1：Web; 2：Wap；3：Android；4：IOS；5：其他;
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
	private Date modifyTime;
	/**
	 * 修改人 
	 */
	private String modifyBy;
	/**
	 * 创建人 
	 */
	private String createBy;
	/**
	 * 更新时间 
	 */
	private Date updateTime;
	/**
	 * 创建时间 
	 */
	private Date createTime;
	/**
	 * 修改备注
	 */
	private String remark;
	/**
	 * 来源类型:1：活动；2：券
	 */
	private Short redSource;
	/**
	 * 红包种类
	 */
	private String redClass;
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
	public OperateCouponVO(){
		
	}

	 public OperateCouponVO(OperateCouponTempBO couponBo ,ActivityBO activity,TransRechargeBO transRechargeBO,String redCode){
	    	if(couponBo.getOperactionType()==ActivityOperactionType.HANDED.getValue()){
	    		this.redStatus = ""+RedStatusEnum.AVAILABLE.getValue();
	    		if(couponBo.getEctivityDay()!=null&&couponBo.getEctivityDay()!=0){
	        		this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(new Date(), couponBo.getEctivityDay()));
	        	}
	    	}else{   		
	    		this.redStatus = ""+RedStatusEnum.WAIT_ACTIVATION.getValue();
	    		Calendar cal = Calendar.getInstance();
	        	cal.setTime(DateUtil.getDateDit(transRechargeBO.getCreateTime(), couponBo.getActiveEndTime()));
	            cal.set(Calendar.HOUR_OF_DAY, 10);
	            cal.set(Calendar.MINUTE, 00);
	            cal.set(Calendar.SECOND, 00);
	            this.activeEndTime=cal.getTime();
	            if(couponBo.getActiveEndTime()!=null&&couponBo.getEctivityDay()!=null){
	        		this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(DateUtil.getDateDit(transRechargeBO.getCreateTime(), couponBo.getEctivityDay()),couponBo.getActiveEndTime()));
	        	}
	    	}   
	    	
	    	this.redCategory = RedCategoryEnum.VIRTUAL.getKey();
			this.redCode=redCode;
			this.remark=activity.getActivityName();
			this.userId=Integer.valueOf(transRechargeBO.getUserId());
			this.redName=couponBo.getRedName();
			this.activityCode=activity.getActivityCode();
			this.redSource=RedSourceEnum.ACTIVITY.getValue();
			this.createBy=Constants.CREATE_BY_ACTIVITY;
			this.channelId=null;
	    	this.redType = couponBo.getRedType();    	
	    	this.redValue =couponBo.getRedValue() ;
	    	this.minSpendAmount=couponBo.getMinSpendAmount();
	    	this.ectivityDay=couponBo.getEctivityDay();
	    	this.limitPlatform=couponBo.getLimitPlatform();
	    	this.limitLotteryChildType=couponBo.getLimitLotteryChildType();
	    	this.redLabel=couponBo.getRedLabel();
	    	if(ObjectUtil.isBlank(couponBo.getOperateLotteryId())){
	    		this.operateLotteryId= com.hhly.skeleton.base.constants.Constants.getActivityLotteryId();
	    	}else{
		    	this.operateLotteryId=couponBo.getOperateLotteryId();
	    	}    	this.limitLottery=couponBo.getLimitLottery();
	    	this.limitLotteryChild=couponBo.getLimitLotteryChild();
	    	this.redValue = couponBo.getRedValue();
	    	this.redBalance= couponBo.getRedValue();
	    }
	    
	    public OperateCouponVO(OperateCouponTempBO couponBo ,ActivityBO activity){
	    	if(couponBo.getOperactionType()==ActivityOperactionType.HANDED.getValue()){
	    		this.redStatus = ""+RedStatusEnum.AVAILABLE.getValue();
	    		if(couponBo.getEctivityDay()!=null&&couponBo.getEctivityDay()!=0){
	        		this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(new Date(), couponBo.getEctivityDay()));
	        	}
	    	}else{   		
	    		this.redStatus = ""+RedStatusEnum.WAIT_ACTIVATION.getValue();
	    		Calendar cal = Calendar.getInstance();
	        	cal.setTime(DateUtil.getDateDit(new Date(), couponBo.getActiveEndTime()));
	            cal.set(Calendar.HOUR_OF_DAY, 10);
	            cal.set(Calendar.MINUTE, 00);
	            cal.set(Calendar.SECOND, 00);
	            this.activeEndTime=cal.getTime();
	            if(couponBo.getActiveEndTime()!=null&&couponBo.getEctivityDay()!=null){
	        		this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(DateUtil.getDateDit(new Date(), couponBo.getEctivityDay()),couponBo.getActiveEndTime()));
	        	}
	    	}   
	    	
	    	this.redCategory = RedCategoryEnum.VIRTUAL.getKey();
			this.remark=activity.getActivityName();
			if(ObjectUtil.isBlank(couponBo.getRedName())) {
				this.redName=ActivityTypeEnum.getCons(activity.getActivityType()).getDesc();
			}else{
				this.redName=couponBo.getRedName();
			}
			this.activityCode=activity.getActivityCode();
			this.redSource=RedSourceEnum.ACTIVITY.getValue();
			this.createBy=Constants.CREATE_BY_ACTIVITY;
			this.channelId=activity.getChannelId();
	    	this.redType = couponBo.getRedType();    	
	    	this.redValue =couponBo.getRedValue() ;
	    	this.minSpendAmount=couponBo.getMinSpendAmount();
	    	this.ectivityDay=couponBo.getEctivityDay();
	    	this.limitPlatform=couponBo.getLimitPlatform();
	    	this.limitLotteryChildType=couponBo.getLimitLotteryChildType();
	    	this.redLabel=couponBo.getRedLabel();
	    	if(ObjectUtil.isBlank(couponBo.getOperateLotteryId())){
	    		this.operateLotteryId= com.hhly.skeleton.base.constants.Constants.getActivityLotteryId();
	    	}else{
		    	this.operateLotteryId=couponBo.getOperateLotteryId();
	    	}
	    	this.limitLottery=couponBo.getLimitLottery();
	    	this.limitLotteryChild=couponBo.getLimitLotteryChild();
	    	this.redValue = couponBo.getRedValue();
	    	this.redBalance= couponBo.getRedValue();
	    	this.obtainTime = new Date();
	    }

	    
		public OperateCouponVO(ActivityBO activityBO, UserInfoBO userInfoBO, ActivityRuleBO ruleBO, Short redType, String redCode) {
			this.redCode = redCode;
			this.redCategory = RedCategoryEnum.VIRTUAL.getKey();
			this.redStatus =""+ RedStatusEnum.AVAILABLE.getValue();
			this.activityCode = activityBO.getActivityCode();
			this.obtainTime = new Date();
			this.redType = redType;	
			this.redName = ActivityTypeEnum.getCons(activityBO.getActivityType()).getDesc();
			this.redValue = ruleBO.getGiftMoney();
			this.redBalance = ruleBO.getGiftMoney();
			this.userId = Integer.parseInt(userInfoBO.getUserId());
			if (ruleBO.getUserAction() != null) {
				this.redRemark = ActivityUserActionEnum.getUserActonEnum(ruleBO.getUserAction()).getDesc();
			}
			this.remark = activityBO.getActivityName();
			this.createBy = Constants.CREATE_BY_ACTIVITY;
			this.redSource = RedSourceEnum.ACTIVITY.getValue();
			this.channelId = activityBO.getChannelId();
			this.ectivityDay = 0;
	    	this.operateLotteryId= com.hhly.skeleton.base.constants.Constants.getActivityLotteryId();
	  
		}
		public OperateCouponVO(OrderInfoBO orderInfoBO,OperateRebateUserBO operateRebateUserBO,Double bonus,String redCode){
			this.redCode = redCode;
			this.redCategory = RedCategoryEnum.VIRTUAL.getKey();
			this.redStatus = ""+ RedStatusEnum.AVAILABLE.getValue();
			this.activityCode = Constants.REBATE_USER_ACTIVITY_CODE;
			this.obtainTime = new Date();
			this.redType = (short)RedTypeEnum.HANDSEL_RED_PACKAGE.getType();
			this.redName = com.hhly.skeleton.base.constants.Constants.REBATE_USER_RED_NAME;
			this.redValue = bonus;
			this.redBalance = bonus;
			this.userId = Integer.parseInt(orderInfoBO.getUserId());
			this.redRemark =com.hhly.skeleton.base.constants.Constants.REBATE_USER_RED_NAME;
			this.remark = com.hhly.skeleton.base.constants.Constants.REBATE_USER_RED_NAME;
			this.createBy = Constants.CREATE_BY_ACTIVITY;
			this.redSource = RedSourceEnum.ACTIVITY.getValue();	
			this.ectivityDay = 0;
	    	this.operateLotteryId= com.hhly.skeleton.base.constants.Constants.getActivityLotteryId();
	    	
	    }
		
		 public OperateCouponVO(OperateActivityAwardBO couponBo ,ActivityBO activity,Integer userId,String redCode){
			 this.redStatus = ""+RedStatusEnum.AVAILABLE.getValue();
		 		if(couponBo.getEctivityDay()!=null&&couponBo.getEctivityDay()!=0){
		     		this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(new Date(), couponBo.getEctivityDay()));
		     	}  	
		 		this.obtainTime = new Date();
		 		this.redCategory = RedCategoryEnum.VIRTUAL.getKey();
				this.redCode=redCode;
				this.remark=activity.getActivityName();
				this.userId=userId;
				this.redName=couponBo.getAwardText();
				this.activityCode=activity.getActivityCode();
				this.redSource=RedSourceEnum.ACTIVITY.getValue();
				this.createBy=Constants.CREATE_BY_ACTIVITY;
				//this.channelId=activity.getChannelId();
		    	this.redType = couponBo.getRedType();    	
		    	this.redValue =couponBo.getRedValue() ;
		    	this.minSpendAmount=couponBo.getMinSpendAmount();
		    	this.ectivityDay=couponBo.getEctivityDay();
		    	if(ObjectUtil.isBlank(couponBo.getOperateLotteryId())){
		    		this.operateLotteryId= com.hhly.skeleton.base.constants.Constants.getActivityLotteryId();
		    	}else{
			    	this.operateLotteryId=couponBo.getOperateLotteryId();
		    	}
		    	this.redValue = couponBo.getRedValue();
		    	this.redBalance= couponBo.getRedValue();
	    }
		 
		 public OperateCouponVO(OperateActivityAddedBO couponBo ,ActivityBO activity,String userId,String redCode){
			 	this.redStatus = ""+couponBo.getRedStatus();
			 	if(couponBo.getRedStatus() == (short)RedStatusEnum.WAIT_ACTIVATION.getValue()){  		
		    		Calendar cal = Calendar.getInstance();
		        	cal.setTime(DateUtil.getDateDit(new Date(), couponBo.getActiveEndTime()));
		            cal.set(Calendar.HOUR_OF_DAY, 10);
		            cal.set(Calendar.MINUTE, 00);
		            cal.set(Calendar.SECOND, 00);
		            this.activeEndTime=cal.getTime();
		            if(couponBo.getActiveEndTime()!=null&&couponBo.getEctivityDay()!=null){
		        		this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(DateUtil.getDateDit(new Date(), couponBo.getEctivityDay()),couponBo.getActiveEndTime()));
		        	}
		    	}else{
		    		if(couponBo.getEctivityDay()!=null&&couponBo.getEctivityDay()!=0){
			     		this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(new Date(), couponBo.getEctivityDay()));
		    		}
		    	}  		 			 			 	
		    	this.redCategory = RedCategoryEnum.VIRTUAL.getKey();
				this.redCode=redCode;
				this.remark=activity.getActivityName();
				this.userId=Integer.valueOf(userId);
				this.redName=couponBo.getRedName();
				this.activityCode=activity.getActivityCode();
				this.redSource=RedSourceEnum.ACTIVITY.getValue();
				this.createBy=Constants.CREATE_BY_ACTIVITY;
				this.channelId=activity.getChannelId();
		    	this.redType = couponBo.getRedType();    	
		    	this.redValue =couponBo.getRedValue() ;
		    	this.minSpendAmount=couponBo.getMinSpendAmount();
		    	this.ectivityDay=couponBo.getEctivityDay();
		    	this.limitPlatform=couponBo.getLimitPlatform();
		    	this.limitLotteryChildType=couponBo.getLimitLotteryChildType();
		    	this.redLabel=couponBo.getRedLabel();
		    	if(ObjectUtil.isBlank(couponBo.getOperateLotteryId())){
		    		this.operateLotteryId= com.hhly.skeleton.base.constants.Constants.getActivityLotteryId();
		    	}else{
			    	this.operateLotteryId=couponBo.getOperateLotteryId();
		    	}
		    	this.limitLottery=couponBo.getLimitLottery();
		    	this.limitLotteryChild=couponBo.getLimitLotteryChild();
		    	this.redValue = couponBo.getRedValue();
		    	this.redBalance= couponBo.getRedValue();
		    	this.obtainTime = new Date();
		}

		public OperateCouponVO(OperateCouponTempBO couponBO, String redCode) {
			this.redType = couponBO.getRedType();
			this.redName = couponBO.getRedName();
			this.redStatus = ""+couponBO.getRedStatus();
			this.redValue = couponBO.getRedValue();
			this.minSpendAmount = couponBO.getMinSpendAmount();
			this.ectivityDay = couponBO.getEctivityDay();
		 	this.redCode = redCode;
		 	this.redCategory = RedCategoryEnum.VIRTUAL.getKey();
		 	this.redBalance = couponBO.getRedValue();
			if(ObjectUtil.isBlank(couponBO.getOperateLotteryId())){
				this.operateLotteryId= com.hhly.skeleton.base.constants.Constants.getActivityLotteryId();
			}else{
				this.operateLotteryId=couponBO.getOperateLotteryId();
			}
			if(couponBO.getRedStatus() == (short)RedStatusEnum.WAIT_ACTIVATION.getValue()){
				Calendar cal = Calendar.getInstance();
				cal.setTime(DateUtil.getDateDit(new Date(), couponBO.getActiveEndTime()));
				cal.set(Calendar.HOUR_OF_DAY, 10);
				cal.set(Calendar.MINUTE, 00);
				cal.set(Calendar.SECOND, 00);
				this.activeEndTime=cal.getTime();
				if(couponBO.getActiveEndTime()!=null&&couponBO.getEctivityDay()!=null){
					this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(DateUtil.getDateDit(new Date(), couponBO.getEctivityDay()),couponBO.getActiveEndTime()));
				}
			}else{
				if(couponBO.getEctivityDay()!=null&&couponBO.getEctivityDay()!=0){
					this.redOverdueTime=DateUtil.getDayEnd(DateUtil.getDateDit(new Date(), couponBO.getEctivityDay()));
				}
			}
			this.limitPlatform = couponBO.getLimitPlatform();
			this.limitLotteryChildType = couponBO.getLimitLotteryChildType();
			this.redLabel = couponBO.getRedLabel();
			this.operateLotteryId = couponBO.getOperateLotteryId();
			this.channelId = couponBO.getChannelId();
			this.limitLottery = couponBO.getLimitLottery();
			this.limitLotteryChild = couponBO.getLimitLotteryChild();
		}
	 public OperateCouponVO(ActivityBO activity,Double bonus,String userId,String redCode,short redType,Short redStatus){
		 this.redCategory=RedCategoryEnum.VIRTUAL.getKey();
		 this.redCode=redCode;
		 this.redType=redType;
		 this.remark=activity.getActivityName();
		 this.userId=Integer.valueOf(userId);
		 this.redName=ActivityTypeEnum.getCons(activity.getActivityType()).getDesc();
		 this.activityCode=activity.getActivityCode();
		 this.redValue=bonus;
		 this.redBalance=bonus;
		 this.ectivityDay=0;
		 this.redStatus=""+redStatus;
		 this.redSource=RedSourceEnum.ACTIVITY.getValue();
		 this.createBy=Constants.CREATE_BY_ACTIVITY;	
		 this.channelId=activity.getChannelId();
		 this.obtainTime=new Date();
		 this.operateLotteryId=com.hhly.skeleton.base.constants.Constants.getActivityLotteryId();
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

	public String getRedClass() {
		return redClass;
	}

	public void setRedClass(String redClass) {
		this.redClass = redClass;
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

	@Override
	public String toString() {
		return "OperateCouponVO [redValue=" + redValue + ", userId=" + userId + ", limitPlatform=" + limitPlatform + ", limitLottery=" + limitLottery + "]";
	}

	public Short getRedSource() {
		return redSource;
	}

	public void setRedSource(Short redSource) {
		this.redSource = redSource;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}