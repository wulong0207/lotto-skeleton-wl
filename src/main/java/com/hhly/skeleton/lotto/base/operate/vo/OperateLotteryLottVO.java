package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc  前端彩种运营的信息
 * @author lidecheng
 * @date 2017年5月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateLotteryLottVO extends BaseBO{
	/**
	   * 彩种类型ID:1：数字彩；2：高频彩；3：竞技彩
	*/
	private Short categoryId;
	/**发布平台:1WEB;2WAP;3ANDROID;4IOS*/
    private Short platform;
    private Short isDefault;
    
	public Short getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Short isDefault) {
		this.isDefault = isDefault;
	}
	public Short getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Short categoryId) {
		this.categoryId = categoryId;
	}
	public Short getPlatform() {
		return platform;
	}
	public void setPlatform(Short platform) {
		this.platform = platform;
	}
    
}
