package com.hhly.skeleton.cms.operatemgr.vo;


import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

public class OperateActivityAwardVO extends PageVO {
    /**
     * 
     */
    private Integer id;

    /**
     * 奖项背景色
     */
    private String awardColor;

    /**
     * 奖项图片
     */
    private String awardImg;

    /**
     * 奖项文本
     */
    private String awardText;

    /**
     * 概率
     */
    private Double probability;

    /**
     * 排序
     */
    private Short orderId;

    /**
     * 1:优惠券 ,2:活动
     */
    private Short type;

    /**
     * 优惠券填operate_activity_coupon表的id,活动填operate_activity表的activity_code
     */
    private String typeCode;

    /**
     * 
     */
    private Date modifyTime;

    /**
     * 
     */
    private String modifyBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createBy;

    /**
     * 
     */
    private Date updateTime;

    
    private String activityCode;
    
    private Integer activityConfigId;
    
    /**
     * 红包面额
     */
    private Double redValue;

    /**
     * 最低消费金额
     */
    private Double minSpendAmount;

    /**
     * 有效天数
     */
    private Short ectivityDay;

    /**
     * 关联彩种运营管理ID，list
     */
    private String operateLotteryId;
    /**
     * 红包类型
     */
    private Short redType;

    /**
     * 可用渠道
     */
    private String channelId;
    
    
    
    
    public Double getRedValue() {
		return redValue;
	}

	public void setRedValue(Double redValue) {
		this.redValue = redValue;
	}

	public Double getMinSpendAmount() {
		return minSpendAmount;
	}

	public void setMinSpendAmount(Double minSpendAmount) {
		this.minSpendAmount = minSpendAmount;
	}

	public Short getEctivityDay() {
		return ectivityDay;
	}

	public void setEctivityDay(Short ectivityDay) {
		this.ectivityDay = ectivityDay;
	}

	public String getOperateLotteryId() {
		return operateLotteryId;
	}

	public void setOperateLotteryId(String operateLotteryId) {
		this.operateLotteryId = operateLotteryId;
	}

	public Short getRedType() {
		return redType;
	}

	public void setRedType(Short redType) {
		this.redType = redType;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getActivityConfigId() {
		return activityConfigId;
	}

	public void setActivityConfigId(Integer activityConfigId) {
		this.activityConfigId = activityConfigId;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	/**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 奖项背景色
     * @return award_color 奖项背景色
     */
    public String getAwardColor() {
        return awardColor;
    }

    /**
     * 奖项背景色
     * @param awardColor 奖项背景色
     */
    public void setAwardColor(String awardColor) {
        this.awardColor = awardColor == null ? null : awardColor.trim();
    }

    public String getAwardImg() {
        return awardImg;
    }

    public void setAwardImg(String awardImg) {
        this.awardImg = awardImg;
    }

    /**
     * 奖项文本
     * @return award_text 奖项文本
     */
    public String getAwardText() {
        return awardText;
    }

    /**
     * 奖项文本
     * @param awardText 奖项文本
     */
    public void setAwardText(String awardText) {
        this.awardText = awardText == null ? null : awardText.trim();
    }

    /**
     * 概率
     * @return probability 概率
     */
    public Double getProbability() {
        return probability;
    }

    /**
     * 概率
     * @param probability 概率
     */
    public void setProbability(Double probability) {
        this.probability = probability;
    }

    /**
     * 排序
     * @return order_id 排序
     */
    public Short getOrderId() {
        return orderId;
    }

    /**
     * 排序
     * @param orderId 排序
     */
    public void setOrderId(Short orderId) {
        this.orderId = orderId;
    }

    /**
     * 1:优惠券 ,2:活动
     * @return type 1:优惠券 ,2:活动
     */
    public Short getType() {
        return type;
    }

    /**
     * 1:优惠券 ,2:活动
     * @param type 1:优惠券 ,2:活动
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * 优惠券填operate_activity_coupon表的id,活动填operate_activity表的activity_code
     * @return type_code 优惠券填operate_activity_coupon表的id,活动填operate_activity表的activity_code
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * 优惠券填operate_activity_coupon表的id,活动填operate_activity表的activity_code
     * @param typeCode 优惠券填operate_activity_coupon表的id,活动填operate_activity表的activity_code
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    /**
     * 
     * @return modify_time 
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 
     * @param modifyTime 
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 
     * @return modify_by 
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 
     * @param modifyBy 
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}