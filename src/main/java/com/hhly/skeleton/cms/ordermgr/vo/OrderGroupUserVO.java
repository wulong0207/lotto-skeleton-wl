package com.hhly.skeleton.cms.ordermgr.vo;

public class OrderGroupUserVO extends OrderGroupCommonVO {

	public OrderGroupUserVO(Integer userId) {
		super(userId);
	}

	public OrderGroupUserVO(){
		
	}
	//用户标识
	private Integer flag;
	//是否推荐
	private Integer isRecommend;
	//关注总数
	private Integer focusCount;
	//定制总数
	private Integer customizationCount;
	
	{
		flag=0;
		isRecommend=0;
		focusCount=0;
		customizationCount=0;
		
	}
	

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}

	public Integer getCustomizationCount() {
		return customizationCount;
	}

	public void setCustomizationCount(Integer customizationCount) {
		this.customizationCount = customizationCount;
	}

	public Integer getFocusCount() {
		return focusCount;
	}

	public void setFocusCount(Integer focusCount) {
		this.focusCount = focusCount;
	}

}
