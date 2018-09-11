package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 用户数字彩方案明细
 * @author huangb
 * @date 2017年4月10日
 * @company 益彩网络
 * @version v1.0
 */
public class UserNumOrderDetailBO extends BaseBO {

	private static final long serialVersionUID = 7621567527052358716L;
	/**
	 * 行编号
	 */
	private Integer rn;
	/**
	 * 数字彩，低频彩所选的投注号码；若为上传，需要保存选好方式。 竞彩：存放投注内容字符串
	 */
	private String planContent;
	/**
	 * 单个方案的购买倍数
	 */
	private Integer multiple;
	/**
	 * 单个方案的购买金额
	 */
	private Double amount;
	/**
	 * 内容类型 1：单式；2：复式；3：胆拖；4：混合；5：上传
	 */
	private Integer contentType;
	/**
	 * 子玩法id
	 */
	private Integer lotteryChildCode;
	/**
	 * 子玩法名称
	 */
	private String childName;
	/**
	 * 单个方案的注数
	 */
	private Integer buyNumber;

	public Integer getRn() {
		return rn;
	}

	public void setRn(Integer rn) {
		this.rn = rn;
	}

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public Integer getBuyNumber() {
		return buyNumber;
	}

	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}

}
